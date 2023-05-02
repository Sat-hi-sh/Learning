from flask import Flask, render_template, request
import cv2
import os

app = Flask(__name__)

# Define the route for the home page
@app.route('/')
def index():
    return render_template('index.html')

# Define the route for the image processing page
@app.route('/process', methods=['POST'])
def process():
    # Get the uploaded file from the HTML form
    file = request.files['file']

    # Save the file to disk
    file.save(os.path.join('static', file.filename))

    # Load grayscale image
    img = cv2.imread(os.path.join('static', file.filename), 0)

    # Apply Otsu's thresholding
    ret, thresh = cv2.threshold(img, 0, 255, cv2.THRESH_BINARY_INV + cv2.THRESH_OTSU)

    # Save thresholded image as PNG
    cv2.imwrite(os.path.join('static', 'image.png'), thresh)

    # Pass the image filenames to the HTML template
    return render_template('process.html', original_image=file.filename, thresholded_image='image.png')

if __name__ == '__main__':
    app.run(debug=True)
