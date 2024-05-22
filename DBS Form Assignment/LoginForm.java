import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class LoginForm extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Login Form");
        
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(20, 20, 20, 20));
        grid.setVgap(10);
        grid.setHgap(10);
        
        Label emailLabel = new Label("Email:");
        GridPane.setConstraints(emailLabel, 0, 0);
        
        TextField emailField = new TextField();
        GridPane.setConstraints(emailField, 1, 0);
        
        Label passwordLabel = new Label("Password:");
        GridPane.setConstraints(passwordLabel, 0, 1);
        
        PasswordField passwordField = new PasswordField();
        GridPane.setConstraints(passwordField, 1, 1);
        
        Button signInButton = new Button("Sign In");
        GridPane.setConstraints(signInButton, 1, 2);
        
        grid.getChildren().addAll(emailLabel, emailField, passwordLabel, passwordField, signInButton);
        
        Scene scene = new Scene(grid, 300, 150);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
