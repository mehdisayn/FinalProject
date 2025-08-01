package devsharkit.papermill.Controller.factoryManager;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class ProductionOverview
{
    @javafx.fxml.FXML
    private Label FMmaintenanceAlartLabel;
    @javafx.fxml.FXML
    private TableView FMproductionOverviewTable;
    @javafx.fxml.FXML
    private Label FMsatusLabel;
    @javafx.fxml.FXML
    private TableColumn FMTargetColumn;
    @javafx.fxml.FXML
    private TableColumn FMdateColumn;
    @javafx.fxml.FXML
    private TableColumn FMactualColumn;
    @javafx.fxml.FXML
    private TableColumn FMdelayColumn;
    @javafx.fxml.FXML
    private Label FMqualityStatusLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void FMrefreshDataOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void FMexportReportOnAction(ActionEvent actionEvent) {
    }
}