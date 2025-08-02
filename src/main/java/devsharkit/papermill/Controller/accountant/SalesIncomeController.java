package devsharkit.papermill.Controller.accountant;
import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class SalesIncomeController
{
    @javafx.fxml.FXML
    private TextField amountTextFiled;
    @javafx.fxml.FXML
    private DatePicker saleDateDatePicker;
    @javafx.fxml.FXML
    private TableColumn amountCol;
    @javafx.fxml.FXML
    private TableColumn dateCol;
    @javafx.fxml.FXML
    private TableColumn clientNameCol;
    @javafx.fxml.FXML
    private TableView salesTableView;
    @javafx.fxml.FXML
    private TextField clientNameTextFiled;
    @javafx.fxml.FXML
    private Label errorLabel;

    @javafx.fxml.FXML
    public void initialize() {

    }

    @javafx.fxml.FXML
    public void handleLogSaleButton(ActionEvent actionEvent) {
    }
}