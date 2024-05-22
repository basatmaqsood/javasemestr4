module com.basat {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.basat to javafx.fxml;
    exports com.basat;
}
