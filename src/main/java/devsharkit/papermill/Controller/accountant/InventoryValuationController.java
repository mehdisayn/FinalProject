package devsharkit.papermill.Controller.accountant;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class InventoryValuationController
{
    @javafx.fxml.FXML
    private TableColumn unitPriceCol;
    @javafx.fxml.FXML
    private TableColumn totalValueCol;
    @javafx.fxml.FXML
    private TableColumn quantityCol;
    @javafx.fxml.FXML
    private TableView inventoryTableView;
    @javafx.fxml.FXML
    private TableColumn itemNameCol;
    @javafx.fxml.FXML
    private Label errorLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void handleCreateValuationButton(ActionEvent actionEvent) {
    }
}