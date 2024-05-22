import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class LoginForm extends Application {

    private Connection connection;

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Login Form");
        primaryStage.setWidth(400);
        primaryStage.setHeight(250);

        // UI components
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setPadding(new Insets(20, 20, 20, 20));
        grid.setVgap(10);
        grid.setHgap(10);
        grid.setBackground(new Background(new BackgroundFill(Color.DARKCYAN, CornerRadii.EMPTY, Insets.EMPTY)));

        Label emailLabel = new Label("Email:");
        emailLabel.setStyle("-fx-font-size: 14px; -fx-text-fill: white; -fx-font-weight: bold;");
        GridPane.setConstraints(emailLabel, 0, 1);

        TextField emailField = new TextField();
        emailField.setStyle("-fx-font-size: 14px; -fx-background-color: #fff; -fx-text-fill: black;");
        GridPane.setConstraints(emailField, 1, 1);

        Label passwordLabel = new Label("Password:");
        passwordLabel.setStyle("-fx-font-size: 14px; -fx-text-fill: white; -fx-font-weight: bold;");
        GridPane.setConstraints(passwordLabel, 0, 2);

        PasswordField passwordField = new PasswordField();
        passwordField.setStyle("-fx-font-size: 14px; -fx-background-color: #fff; -fx-text-fill: black;");
        GridPane.setConstraints(passwordField, 1, 2);

        Button signInButton = new Button("Sign In");
        signInButton.setStyle("-fx-font-size: 14px; -fx-background-color: #fff; -fx-text-fill: black; -fx-font-weight: bold;");
        GridPane.setConstraints(signInButton, 0, 3, 2, 1);
        GridPane.setHalignment(signInButton, HPos.CENTER);

        grid.getChildren().addAll(emailLabel, emailField, passwordLabel, passwordField, signInButton);

        // Set focus on another node to prevent cursor blinking
        signInButton.requestFocus();

        // Database connection
        try {
            connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "Oracle_1");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Sign in button action
        signInButton.setOnAction(e -> {
            String email = emailField.getText();
            String password = passwordField.getText();

            if (authenticate(email, password)) {
                showSuccessMessage();
            } else {
                showErrorMessage();
            }
        });

        Scene scene = new Scene(grid);
        primaryStage.setScene(scene);
        primaryStage.centerOnScreen();
        primaryStage.show();
    }

    private boolean authenticate(String email, String password) {
        String query = "SELECT * FROM users WHERE email = ? AND password = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, email);
            statement.setString(2, password);
            ResultSet resultSet = statement.executeQuery();
            return resultSet.next();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    private void showSuccessMessage() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Success");
        alert.setHeaderText(null);
        alert.setContentText("Authentication successful!");
        alert.showAndWait();
    }

    private void showErrorMessage() {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error");
        alert.setHeaderText(null);
        alert.setContentText("Authentication failed. Please check your credentials.");
        alert.showAndWait();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
