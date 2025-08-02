package devsharkit.papermill.Controller.accountant;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class PurchaseApprovalsController
{
    @javafx.fxml.FXML
    private TableColumn departmentCol;
    @javafx.fxml.FXML
    private TableColumn amountCol;
    @javafx.fxml.FXML
    private TableColumn statusCol;
    @javafx.fxml.FXML
    private TableView purchaseApprovalTableView;
    @javafx.fxml.FXML
    private TableColumn reqIdCol;
    @javafx.fxml.FXML
    private TableColumn itemNameCol;
    @javafx.fxml.FXML
    private Label errorLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void handleRejectButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleApproveButton(ActionEvent actionEvent) {
    }
}