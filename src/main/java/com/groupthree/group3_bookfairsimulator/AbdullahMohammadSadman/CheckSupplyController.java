package com.groupthree.group3_bookfairsimulator.AbdullahMohammadSadman;

import com.groupthree.group3_bookfairsimulator.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class CheckSupplyController
{
    @javafx.fxml.FXML
    private Label checkLabel;
    @javafx.fxml.FXML
    private TableColumn equipmentCol;
    @javafx.fxml.FXML
    private TableColumn urgencyLevelCol;
    @javafx.fxml.FXML
    private TableView suppliesTableView;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void check(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void back(ActionEvent actionEvent) throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("AbdullahMohammadSadman/MaintenanceOfficerDashboard.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setScene(scene);
    }
}