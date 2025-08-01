package devsharkit.papermill.Controller.factoryManager;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class MachineMonitor
{
    @javafx.fxml.FXML
    private TableView FMmachineMonitorTableView;
    @javafx.fxml.FXML
    private TableColumn FMmachineMonitorPerformanceColumn;
    @javafx.fxml.FXML
    private TableColumn FMmachineMonitorLastMaintainColumn;
    @javafx.fxml.FXML
    private TableColumn FMmachineMonitorStatusColumn;
    @javafx.fxml.FXML
    private TableColumn FMmachineMonitorMachineIDColumn;
    @javafx.fxml.FXML
    private Label FMmachineDowntimeAlartLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void FMmachineMonitorAssignMachineOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void FMmachineMonitorViewLogOnAction(ActionEvent actionEvent) {
    }
}