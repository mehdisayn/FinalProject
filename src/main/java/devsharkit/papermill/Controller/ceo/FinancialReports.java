package devsharkit.papermill.Controller.ceo;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class FinancialReports
{
    @javafx.fxml.FXML
    private TableColumn revenueColumnCEOFR;
    @javafx.fxml.FXML
    private ComboBox yearComboboxFRCEO;
    @javafx.fxml.FXML
    private Label totalProfitLabelShowCEOFR;
    @javafx.fxml.FXML
    private TableColumn profitColumnCEOFR;
    @javafx.fxml.FXML
    private ComboBox monthComboboxFRCEO;
    @javafx.fxml.FXML
    private TableView financialReportTableviewCEO;
    @javafx.fxml.FXML
    private TableColumn expenseColumnCEOFR;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void exportPDFonActionCEOFR(ActionEvent actionEvent) {
    }
}