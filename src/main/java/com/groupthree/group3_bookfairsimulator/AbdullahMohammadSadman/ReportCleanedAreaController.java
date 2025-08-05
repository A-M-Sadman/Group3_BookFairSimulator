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
import java.time.LocalDate;

import static com.groupthree.group3_bookfairsimulator.AbdullahMohammadSadman.Task.taskList;

public class ReportCleanedAreaController
{
    @javafx.fxml.FXML
    private Label cleanedLabel;
    @javafx.fxml.FXML
    private TableColumn<Task, LocalDate> statusCol;
    @javafx.fxml.FXML
    private TableView<Task> taskTableView;
    @javafx.fxml.FXML
    private TableColumn<Task, String> taskNameCol;
    @javafx.fxml.FXML
    private TableColumn<Task, String> zoneCol;

    @javafx.fxml.FXML
    public void initialize() {
        taskNameCol.setCellValueFactory(new PropertyValueFactory<>("taskName"));
        zoneCol.setCellValueFactory(new PropertyValueFactory<>("zone"));
        statusCol.setCellValueFactory(new PropertyValueFactory<>("date"));

        for (Task t:taskList) {
            if ((t.getType().equals("Cleaning"))){
                taskTableView.getItems().add(t);
            }
        }
    }

    @javafx.fxml.FXML
    public void back(ActionEvent actionEvent) throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("AbdullahMohammadSadman/MaintenanceOfficerDashboard.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void cleaned(ActionEvent actionEvent) {
        if (taskList.isEmpty()) {
            cleanedLabel.setText("There are no tasks");
            return;
        }
        Task t = taskTableView.getSelectionModel().getSelectedItem();
        if (t == null) {
            cleanedLabel.setText("Please select a task!");
            return;
        }
        if (t.getStatus().equals("Completed")) {
            cleanedLabel.setText("This area is already cleaned");
            return;
        }
        t.setStatus("Completed");
        cleanedLabel.setText("This area is reported as cleaned!");
    }
}