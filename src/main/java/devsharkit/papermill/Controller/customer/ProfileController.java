package devsharkit.papermill.Controller.customer;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class ProfileController
{
    @javafx.fxml.FXML
    private TextField phoneTextField;
    @javafx.fxml.FXML
    private PasswordField oldPasswordPasswordField;
    @javafx.fxml.FXML
    private TextField emailTextField;
    @javafx.fxml.FXML
    private TextField nameTextField;
    @javafx.fxml.FXML
    private Label errorLabel;
    @javafx.fxml.FXML
    private PasswordField newPasswordPasswordField;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void handleSaveButton(ActionEvent actionEvent) {
    }
}