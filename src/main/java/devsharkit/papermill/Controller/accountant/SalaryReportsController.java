package devsharkit.papermill.Controller.accountant;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class SalaryReportsController
{
    @javafx.fxml.FXML
    private TableView salaryReportTableView;
    @javafx.fxml.FXML
    private TableColumn departmentCol;
    @javafx.fxml.FXML
    private TableColumn salaryCol;
    @javafx.fxml.FXML
    private TableColumn IdCol;
    @javafx.fxml.FXML
    private TableColumn nameCol;
    @javafx.fxml.FXML
    private ComboBox selectMonthComboBox;
    @javafx.fxml.FXML
    private TableColumn monthCol;
    @javafx.fxml.FXML
    private Label errorLabel;

    @javafx.fxml.FXML
    public void initialize() {
        selectMonthComboBox.getItems().addAll("January","February",
                "March","April","May","June","July","August","September",
                "October","November","December"
        );
    }

    @javafx.fxml.FXML
    public void handleExportPDFbutton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleGenReportButton(ActionEvent actionEvent) {
    }
}