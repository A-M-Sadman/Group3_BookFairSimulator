package com.groupthree.group3_bookfairsimulator.AbdullahMohammadSadman;

import com.groupthree.group3_bookfairsimulator.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

import static com.groupthree.group3_bookfairsimulator.AbdullahMohammadSadman.SupplyPartsManager.supplyList;

public class CheckSupplyController
{
    @javafx.fxml.FXML
    private Label checkLabel;
    @javafx.fxml.FXML
    private TableColumn<SupplyParts, String> equipmentCol;
    @javafx.fxml.FXML
    private TableColumn<SupplyParts, String> urgencyLevelCol;
    @javafx.fxml.FXML
    private TableView<SupplyParts> suppliesTableView;

    @javafx.fxml.FXML
    public void initialize() {
        equipmentCol.setCellValueFactory(new PropertyValueFactory<>("equipmentName"));
        urgencyLevelCol.setCellValueFactory(new PropertyValueFactory<>("urgencyLevel"));

        try {
            suppliesTableView.getItems().addAll(supplyList);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @javafx.fxml.FXML
    public void check(ActionEvent actionEvent) {
        SupplyParts sp = suppliesTableView.getSelectionModel().getSelectedItem();
        if (sp == null) {
            checkLabel.setText("Select an item to check");
            return;
        }
        String zone = sp.getLocation();
        checkLabel.setText("Supplies located at: ".concat(zone));
    }

    @javafx.fxml.FXML
    public void back(ActionEvent actionEvent) throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("AbdullahMohammadSadman/MaintenanceOfficerDashboard.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setScene(scene);
    }
}