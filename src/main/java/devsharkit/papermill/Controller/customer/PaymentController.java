package devsharkit.papermill.Controller.customer;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class PaymentController
{
    @javafx.fxml.FXML
    private TableColumn dueDateCol;
    @javafx.fxml.FXML
    private TableColumn amountCol;
    @javafx.fxml.FXML
    private TableColumn statusCol;
    @javafx.fxml.FXML
    private TextField transactionIdTextField;
    @javafx.fxml.FXML
    private ComboBox paymentMethodComboBox;
    @javafx.fxml.FXML
    private TableView paymentTableView;
    @javafx.fxml.FXML
    private Label errorLabel;
    @javafx.fxml.FXML
    private TableColumn orderIdCol;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void handlePayNowButton(ActionEvent actionEvent) {
    }
}