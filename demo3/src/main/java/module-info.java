module com.exam {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.exam to javafx.fxml;
    exports com.exam;
}
