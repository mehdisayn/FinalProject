package devsharkit.papermill.Controller.accountant;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class TaxAuditController
{
    @javafx.fxml.FXML
    private TableColumn amountCol;
    @javafx.fxml.FXML
    private TableColumn statusCol;
    @javafx.fxml.FXML
    private TableView taxAndAuditTableView;
    @javafx.fxml.FXML
    private TableColumn taxTypeCol;
    @javafx.fxml.FXML
    private Label errorLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void handleExportForAuditButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleGenTaxReportButton(ActionEvent actionEvent) {
    }
}