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

import static com.groupthree.group3_bookfairsimulator.AbdullahMohammadSadman.TaskManager.taskList;

public class MarkCompletedTaskController
{
    @javafx.fxml.FXML
    private TableColumn<Task, String> typeCol;
    @javafx.fxml.FXML
    private TableView<Task> taskTableView;
    @javafx.fxml.FXML
    private Label completedLabel;
    @javafx.fxml.FXML
    private TableColumn<Task, String> taskNameCol;
    @javafx.fxml.FXML
    private TableColumn<Task, String> descriptionCol;

    @javafx.fxml.FXML
    public void initialize() {
        taskNameCol.setCellValueFactory(new PropertyValueFactory<>("taskName"));
        descriptionCol.setCellValueFactory(new PropertyValueFactory<>("description"));
        typeCol.setCellValueFactory(new PropertyValueFactory<>("type"));

        try {
            taskTableView.getItems().addAll(taskList);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @javafx.fxml.FXML
    public void back(ActionEvent actionEvent) throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("AbdullahMohammadSadman/MaintenanceOfficerDashboard.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void completed(ActionEvent actionEvent) {
        if (taskList.isEmpty()){
            completedLabel.setText("There are no tasks!");
            return;
        }
        Task t = taskTableView.getSelectionModel().getSelectedItem();
        if (t == null) {
            completedLabel.setText("Please select a task to mark as completed");
            return;
        }
        if (t.getStatus().equals("Completed")){
            completedLabel.setText("The task is already completed!");
            return;
        }
        t.setStatus("Completed");
        try {
            TaskManager.saveTaskList();
            completedLabel.setText("Marked item as completed");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        taskTableView.refresh();

    }
}