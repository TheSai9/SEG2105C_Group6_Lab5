# Lab 5: Profile Manager Android App

This is an Android application created for a university lab assignment. The app serves as a simple profile manager, demonstrating the use of multiple activities, intents (for both internal and external apps), and dynamic UI updates using the traditional Android View system with XML layouts.

## Features

-   **Set and Change Profile Avatar**: Users can click on a profile image on the main screen to navigate to a separate activity. This new screen displays a grid of predefined images (flags, in this case). Selecting an image updates the avatar on the main profile screen.
-   **Enter Postal Code**: A simple `EditText` field allows the user to input a postal code or address.
-   **Open in Google Maps**: A dedicated button takes the text from the postal code field and launches the Google Maps application, automatically searching for the entered location.

## Screenshots

*(It is highly recommended to add screenshots of your app here. Replace these placeholders with your own images.)*

| Main Activity                                       | Profile Avatar Selection                                |
| --------------------------------------------------- | ------------------------------------------------------- |
| ![Main Activity](https://github.com/user-attachments/assets/49a2f024-c0fd-4bd2-b96f-424895b5e671) | ![Profile Activity](https://github.com/user-attachments/assets/610a2d0c-b7b5-467b-9cc0-c6bc46660cc5) |

## Technologies Used

-   **Language**: Java
-   **UI Framework**: Android XML Layouts
-   **Key Components**:
    -   `AppCompatActivity`: For creating activities with backward compatibility.
    -   `ConstraintLayout`, `LinearLayout`, `TableLayout`: For designing the user interfaces.
    -   `ImageView`, `EditText`, `Button`, `TextView`: Standard UI widgets.
    -   `Intent`: For navigating between the app's own activities and for launching the external Google Maps application.
    -   `ActivityResultLauncher`: The modern approach for starting an activity and receiving a result back (used for the avatar selection).
    -   `Package Visibility (<queries>)`: Used in `AndroidManifest.xml` to allow the app to detect if Google Maps is installed on Android 11+ devices.

## How to Set Up and Run

1.  **Clone the Repository**:
    ```sh
    git clone https://github.com/TheSai9/SEG2105C_Group6_Lab5
    ```

2.  **Open in Android Studio**:
    Open the cloned project folder in Android Studio.

3.  **Add Image Assets**:
    This project requires image assets that are not included in the repository. Before building, you must add your own `.png` images to the `app/src/main/res/drawable/` folder. The required filenames are:
    -   `ic_avatar_picture.png` (the default avatar)
    -   `flag_ca.png`
    -   `flag_eg.png`
    -   `flag_fr.png`
    -   `flag_jp.png`
    -   `flag_kr.png`
    -   `flag_sp.png`
    -   `flag_tr.png`
    -   `flag_uk.png`
    -   `flag_us.png`

4.  **Build and Run**:
    -   Let Android Studio sync the Gradle files.
    -   Run the app on an Android emulator or a physical device.
    -   **Note**: To test the Google Maps feature, you must run the app on an emulator that includes the **Google Play Store**. You can create one via the AVD Manager.
  
## Demo Video

https://github.com/user-attachments/assets/19f9ca13-407d-4408-bac3-6b05c0c72f59


