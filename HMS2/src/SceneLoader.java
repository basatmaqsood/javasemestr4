import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class SceneLoader {

    public static void loadScene(Pane parentPane, String resourcePath) throws IOException {
        Parent root = FXMLLoader.load(SceneLoader.class.getResource(resourcePath));
        @SuppressWarnings("unused")
        Scene scene = new Scene(root);
        parentPane.getScene().setRoot(root);
    }
}
