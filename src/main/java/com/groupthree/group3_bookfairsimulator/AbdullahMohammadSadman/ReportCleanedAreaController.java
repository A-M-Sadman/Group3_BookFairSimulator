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

public class ReportCleanedAreaController
{
    @javafx.fxml.FXML
    private Label cleanedLabel;
    @javafx.fxml.FXML
    private TableColumn<Task, String> statusCol;
    @javafx.fxml.FXML
    private TableView<Task> taskTableView;
    @javafx.fxml.FXML
    private TableColumn<Task, String> taskNameCol;
    @javafx.fxml.FXML
    private TableColumn<Task, Integer> zoneCol;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void back(ActionEvent actionEvent) throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("AbdullahMohammadSadman/MaintenanceOfficerDashboard.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void cleaned(ActionEvent actionEvent) {
    }
}