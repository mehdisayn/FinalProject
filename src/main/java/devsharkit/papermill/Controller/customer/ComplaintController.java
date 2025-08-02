package devsharkit.papermill.Controller.customer;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class ComplaintController
{
    @javafx.fxml.FXML
    private TextArea complaintDetailsTextArea;
    @javafx.fxml.FXML
    private ComboBox selectOrderComboBox;
    @javafx.fxml.FXML
    private ComboBox complaintTypeComboBox;
    @javafx.fxml.FXML
    private Label errorLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void handleSubmitButton(ActionEvent actionEvent) {
    }
}