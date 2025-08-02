package devsharkit.papermill.Controller.accountant;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class FinancialStatementsController
{
    @javafx.fxml.FXML
    private TableColumn typeCol;
    @javafx.fxml.FXML
    private TableView financialStatementsTableView;
    @javafx.fxml.FXML
    private TableColumn amountCol;
    @javafx.fxml.FXML
    private Label summaryLabel;
    @javafx.fxml.FXML
    private TableColumn categoryCol;
    @javafx.fxml.FXML
    private ComboBox selectMonthComboBox;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void handleExportPDFbutton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleGenStatement(ActionEvent actionEvent) {
    }
}