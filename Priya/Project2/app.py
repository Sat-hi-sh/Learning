from flask import Flask, render_template, request
import cv2
import numpy as np
from tensorflow import keras
from tensorflow.keras.preprocessing import image

app = Flask(__name__)

# Load the trained model
model = keras.models.load_model('trained_model.h5')

@app.route('/', methods=['GET', 'POST'])
def home():
    if request.method == 'POST':
        # Get the uploaded file
        file = request.files['file']

         # Save the file to disk
        file.save('static/uploads/' + file.filename)

        img = image.load_img('static/uploads/' + file.filename, target_size=(224, 224))
        x = image.img_to_array(img)
        x = x / 255.0  # Normalize pixel values to [0, 1]
        x = np.expand_dims(x, axis=0)

        # Predict the class of the image
        prediction = model.predict(x)

        # Format the prediction as a response
        if prediction < 0.5:
            result = 'BENINGN'
        else:
            result = 'MALIGNANT'

        # Render the result page with the prediction result
        return render_template('index.html', result=result)
    else:
        # Render the home page with the upload form
        return render_template('index.html')

if __name__ == '__main__':
    app.run(debug=True)