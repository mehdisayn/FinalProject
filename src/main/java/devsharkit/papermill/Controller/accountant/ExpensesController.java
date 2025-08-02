package devsharkit.papermill.Controller.accountant;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class ExpensesController
{
    @javafx.fxml.FXML
    private ComboBox <String> categoryComboBox;
    @javafx.fxml.FXML
    private DatePicker dateDatePicker;
    @javafx.fxml.FXML
    private TableColumn amountCol;
    @javafx.fxml.FXML
    private TableColumn dateCol;
    @javafx.fxml.FXML
    private TextField amountTextField;
    @javafx.fxml.FXML
    private TableColumn expenseIdCol;
    @javafx.fxml.FXML
    private TableColumn categoryCol;
    @javafx.fxml.FXML
    private TableView expenseTableView;
    @javafx.fxml.FXML
    private Label errorLabel;

    @javafx.fxml.FXML
    public void initialize() {
        categoryComboBox.getItems().addAll("Raw Material","Maintenance","Transport","Utilities","Other");
    }

    @javafx.fxml.FXML
    public void handleAddExpenseButton(ActionEvent actionEvent) {
    }
}