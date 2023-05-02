from flask import Flask, render_template, request, redirect, url_for
import cv2
import numpy as np

app = Flask(__name__)

@app.route('/', methods=['GET', 'POST'])
def index():
    if request.method == 'POST':
        # Get the file uploaded by the user
        file = request.files['file']

        # Save the file to disk
        file.save('static/uploads/' + file.filename)

        # Load the PNG image
        img = cv2.imread('static/uploads/' + file.filename, cv2.IMREAD_GRAYSCALE)

        # Apply thresholding to binarize the image
        threshold_value = 150
        max_value = 255
        threshold_type = cv2.THRESH_BINARY
        _, binary_img = cv2.threshold(img, threshold_value, max_value, threshold_type)

        # Apply Gaussian blur
        blur_img = cv2.GaussianBlur(binary_img, (5, 5), 0)

        # Define the binary mask
        mask = np.zeros_like(blur_img)
        rows, cols = blur_img.shape
        center = (cols // 2, rows // 2)
        radius = min(center) - 50
        cv2.circle(mask, center, radius, 255, -1)

        # Apply the mask to the image
        masked_img = cv2.bitwise_and(blur_img, mask)

        # Apply median blur
        blur_img1 = cv2.medianBlur(masked_img, 5)

        # Normalize the grayscale image
        img_norm = cv2.normalize(blur_img1, None, alpha=0, beta=255, norm_type=cv2.NORM_MINMAX)

        # Apply the blue-red colormap
        cmap = cv2.COLORMAP_JET
        img_color = cv2.applyColorMap(img_norm, cmap)

        # Threshold the image to get a binary image
        ret, thresh = cv2.threshold(blur_img1, 127, 255, cv2.THRESH_BINARY)

        # Find contours in the binary image
        contours, hierarchy = cv2.findContours(thresh, cv2.RETR_EXTERNAL, cv2.CHAIN_APPROX_SIMPLE)

        # Classify the yellow regions based on their area
        output = ""
        for contour in contours:
            # Calculate the area of the contour
            area = cv2.contourArea(contour)

            if area < 100:
                output += "Regular\n"
            elif 100 <= area <= 1000:
                output += "Round\n"
            else:
                output += "Lobular\n"

        # Draw yellow contours on the original image
        img_contours = cv2.cvtColor(blur_img1, cv2.COLOR_GRAY2BGR)
        cv2.drawContours(img_contours, contours, -1, (0, 255, 255), 2)

        # Save the output image
        cv2.imwrite('static/results/result1.png', blur_img)
        cv2.imwrite('static/results/result2.png', masked_img)
        cv2.imwrite('static/results/result3.png', img_norm)
        cv2.imwrite('static/results/result4.png', img_color)
        cv2.imwrite('static/results/result5.png', thresh)
        cv2.imwrite('static/results/result.png', img_contours)

        return render_template('index.html', filename=file.filename, output=output, gaussian = blur_img, masked =  masked_img, normal = img_norm, color = img_color, threshold = thresh )
    else:
        return render_template('index.html')

if __name__ == '__main__':
    app.run(debug=True)
