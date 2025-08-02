package devsharkit.papermill.Controller.customer;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class OrderController
{
    @javafx.fxml.FXML
    private ComboBox productTypeComboBox;
    @javafx.fxml.FXML
    private DatePicker expectedDeliveryDatePIcker;
    @javafx.fxml.FXML
    private ComboBox sizeComboBox;
    @javafx.fxml.FXML
    private TextField deliveryAddressTextField;
    @javafx.fxml.FXML
    private Label errorLabel;
    @javafx.fxml.FXML
    private TextField quantityTextField;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void handleOrderButton(ActionEvent actionEvent) {
    }
}