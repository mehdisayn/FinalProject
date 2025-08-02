package com.example.customer;

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
        String name = nameTextField.getText();
        String email = emailTextField.getText();
        String phone = phoneTextField.getText();
        String oldPassword = oldPasswordPasswordField.getText();
        String newPassword = newPasswordPasswordField.getText();
        if(name.isEmpty() || email.isEmpty() || phone.isEmpty()){
            errorLabel.setText("Plz fill required fields!");
            errorLabel.setStyle("-fx-text-fill: red;");
        }else{
            errorLabel.setText("Profile updated successfully!");
            errorLabel.setStyle("-fx-text-fill: green;");
        }
        errorLabel.setVisible(true);
    }
}