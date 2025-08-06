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

import static com.groupthree.group3_bookfairsimulator.AbdullahMohammadSadman.Task.taskList;

public class ViewPendingTaskController
{
    @javafx.fxml.FXML
    private TableView<Task> taskTableView;
    @javafx.fxml.FXML
    private TableColumn taskIdCol;
    @javafx.fxml.FXML
    private TableColumn zoneCol;
    @javafx.fxml.FXML
    private TableColumn descriptionCol;
    @javafx.fxml.FXML
    private Label showLabel;

    @javafx.fxml.FXML
    public void initialize() {
        taskIdCol.setCellValueFactory(new PropertyValueFactory<Task, String>("taskName"));
        descriptionCol.setCellValueFactory(new PropertyValueFactory<Task, String>("description"));
        zoneCol.setCellValueFactory(new PropertyValueFactory<Task, String>("zone"));

        taskTableView.getItems().addAll(taskList);
    }

    @javafx.fxml.FXML
    public void back(ActionEvent actionEvent) throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("AbdullahMohammadSadman/MaintenanceOfficerDashboard.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void showPendingTasks(ActionEvent actionEvent) {
        if (taskList.isEmpty()){
            showLabel.setText("There are no tasks");
        }
        taskTableView.getItems().clear();
        for (Task t:taskList) {
            if (t.getStatus().equals("Pending")) {
                taskTableView.getItems().add(t);
            }
        }
        if (taskTableView.getItems().isEmpty()) {
            showLabel.setText("There are no pending tasks!");
            return;
        }
        showLabel.setText("Successfully loaded");
    }
}