import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import java.io.IOException;

public class SignUpController {

    @FXML
    private TextField nameField;

    @FXML
    private TextField emailField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private PasswordField confirmPasswordField;

    @FXML
    private Button signUpButton;

    @FXML
    private VBox signUpBox;

    @FXML
    private void handleSignUp(ActionEvent event) throws IOException {
        String name = nameField.getText();
        String email = emailField.getText();
        String password = passwordField.getText();
        @SuppressWarnings("unused")
        String confirmPassword = confirmPasswordField.getText();

        // Validate input fields

        // Insert data into database
        boolean isSignUpSuccessful = DatabaseManager.insertApplicant(new Applicant(name, email, password));

        if (isSignUpSuccessful) {
            SceneLoader.loadScene(signUpBox, "/views/LoginView.fxml");
        } else {
            // Display error message
        }
    }
}
