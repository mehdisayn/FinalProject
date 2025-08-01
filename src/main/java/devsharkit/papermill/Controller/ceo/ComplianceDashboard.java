package devsharkit.papermill.Controller.ceo;

import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;

public class ComplianceDashboard
{
    @javafx.fxml.FXML
    private TableColumn colComplianceType;
    @javafx.fxml.FXML
    private TableView tableComplianceRecords;
    @javafx.fxml.FXML
    private TextArea txtComplianceComment;
    @javafx.fxml.FXML
    private TableColumn colComplianceStatus;
    @javafx.fxml.FXML
    private TableColumn colLastChecked;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void btnNotifyDepartments(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void clearOnAction(ActionEvent actionEvent) {
    }
}