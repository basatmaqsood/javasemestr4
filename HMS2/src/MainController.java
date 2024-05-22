import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.VBox;
import java.io.IOException;

public class MainController {

    @FXML
    private VBox mainBox;

    @FXML
    private void showApplicantLoginView(ActionEvent event) throws IOException {
        SceneLoader.loadScene(mainBox, "/views/ApplicantLoginView.fxml");
    }

    @FXML
    private void showCompanyLoginView(ActionEvent event) throws IOException {
        SceneLoader.loadScene(mainBox, "/views/CompanyLoginView.fxml");
    }
}
