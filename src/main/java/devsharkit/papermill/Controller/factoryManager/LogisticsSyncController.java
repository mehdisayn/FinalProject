package devsharkit.papermill.Controller.factoryManager;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class LogisticsSyncController
{
    @javafx.fxml.FXML
    private TableColumn deptColumn;
    @javafx.fxml.FXML
    private TableColumn quantityColumn;
    @javafx.fxml.FXML
    private ComboBox comboDepartment;
    @javafx.fxml.FXML
    private TableColumn productColumn;
    @javafx.fxml.FXML
    private TableColumn deliveryStatusColumn;
    @javafx.fxml.FXML
    private Label labelLastUpdate;
    @javafx.fxml.FXML
    private TableView tableLogistics;
    @javafx.fxml.FXML
    private TableColumn expectedDateColumn;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void requestSyncOnAction(ActionEvent actionEvent) {
    }
}