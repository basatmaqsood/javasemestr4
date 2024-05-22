import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import java.io.IOException;

public class ApplicantLoginController {

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Button loginButton;

    @FXML
    private VBox applicantLoginBox;

    @FXML
    private void handleLogin(ActionEvent event) throws IOException {
        String username = usernameField.getText();
        String password = passwordField.getText();
        boolean isValidCredentials = DatabaseManager.validateApplicantLogin(username, password);

        if (isValidCredentials) {
            SceneLoader.loadScene(applicantLoginBox, "/views/ApplicantDashboard.fxml");
        } else {
            // Display error message
        }
    }
}
