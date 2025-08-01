package devsharkit.papermill.Controller.ceo;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;

public class StrategyPanel
{
    @javafx.fxml.FXML
    private TableColumn deptColumn;
    @javafx.fxml.FXML
    private TextArea txtStrategyNotes;
    @javafx.fxml.FXML
    private TableColumn summaryColumn;
    @javafx.fxml.FXML
    private ComboBox comboDepartment;
    @javafx.fxml.FXML
    private ComboBox comboQuarter;
    @javafx.fxml.FXML
    private TableColumn dateSavedColumn;
    @javafx.fxml.FXML
    private TableView tableStrategyRecords;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void saveStrategOnAction(ActionEvent actionEvent) {
    }
}