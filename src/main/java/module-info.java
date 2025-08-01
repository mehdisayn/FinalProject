module devsharkit.papermill {
    requires javafx.controls;
    requires javafx.fxml;


    opens devsharkit.papermill to javafx.fxml;
    exports devsharkit.papermill;
}