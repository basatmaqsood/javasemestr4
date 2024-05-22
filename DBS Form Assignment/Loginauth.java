import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Loginauth extends Application {

    private Stage stage;
    private Scene loginScene, signupScene;

    private TextField emailFieldLogin, passwordFieldLogin;
    private TextField emailFieldSignup, passwordFieldSignup;

    private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
    private static final String USERNAME = "system";
    private static final String PASSWORD = "Oracle_1";

    @Override
    public void start(Stage primaryStage) {
        stage = primaryStage;

        // Login Form
        Label loginLabel = new Label("Login");
        emailFieldLogin = new TextField();
        emailFieldLogin.setPromptText("Email");
        passwordFieldLogin = new TextField();
        passwordFieldLogin.setPromptText("Password");
        Button loginButton = new Button("Sign In");

        loginButton.setOnAction(e -> {
            String email = emailFieldLogin.getText();
            String password = passwordFieldLogin.getText();
            if (authenticateUser(email, password)) {
                showSuccessPage();
            } else {
                showErrorPage();
            }
        });

        // Signup Form
        Label signupLabel = new Label("Sign Up");
        emailFieldSignup = new TextField();
        emailFieldSignup.setPromptText("Email");
        passwordFieldSignup = new TextField();
        passwordFieldSignup.setPromptText("Password");
        Hyperlink signupLink = new Hyperlink("Sign Up");

        Button signupButton = new Button("Sign Up");
        signupButton.setOnAction(e -> {
            String email = emailFieldSignup.getText();
            String password = passwordFieldSignup.getText();
            addUser(email, password);
            stage.setScene(loginScene);
        });

        // Switch Button
        Button switchButton = new Button("Sign Up");
        switchButton.setOnAction(e -> stage.setScene(signupScene));

        // Signup Link
        signupLink.setOnAction(e -> stage.setScene(signupScene));

        // Login Link
        Hyperlink loginLink = new Hyperlink("Already have an account? Login");
        loginLink.setOnAction(e -> stage.setScene(loginScene));

        VBox loginLayout = new VBox(10, loginLabel, emailFieldLogin, passwordFieldLogin, loginButton, signupLink);
        VBox signupLayout = new VBox(10, signupLabel, emailFieldSignup, passwordFieldSignup, signupButton, loginLink);

        loginScene = new Scene(loginLayout, 300, 200);
        loginScene.getStylesheets().add(getClass().getResource("styles.css").toExternalForm());
        signupScene = new Scene(signupLayout, 300, 250);
        signupScene.getStylesheets().add(getClass().getResource("styles.css").toExternalForm());

        stage.setScene(loginScene);
        stage.setTitle("Login Form");
        stage.show();
    }

    private boolean authenticateUser(String email, String password) {
        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            String sql = "SELECT * FROM Users WHERE email = ? AND password = ?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, email);
            statement.setString(2, password);
            ResultSet resultSet = statement.executeQuery();
            return resultSet.next();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    private void addUser(String email, String password) {
        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            String sql = "INSERT INTO Users (email, password) VALUES (?, ?)";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, email);
            statement.setString(2, password);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void showSuccessPage() {
        VBox successLayout = new VBox(10);
        Label successLabel = new Label("Login successful!");
        successLayout.getChildren().add(successLabel);
        Scene successScene = new Scene(successLayout, 200, 100);
        stage.setScene(successScene);
    }

    private void showErrorPage() {
        VBox errorLayout = new VBox(10);
        Label errorLabel = new Label("Invalid email or password. Please try again.");
        errorLayout.getChildren().add(errorLabel);
        Scene errorScene = new Scene(errorLayout, 300, 100);
        stage.setScene(errorScene);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
