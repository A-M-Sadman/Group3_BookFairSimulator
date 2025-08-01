package com.groupthree.group3_bookfairsimulator.AbdullahMohammadSadman;

import com.groupthree.group3_bookfairsimulator.HelloApplication;
import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
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
    private TableColumn<Task, String> taskIdCol;
    @javafx.fxml.FXML
    private TableColumn<Task, Integer> zoneCol;
    @javafx.fxml.FXML
    private TableColumn<Task, String> descriptionCol;

    @javafx.fxml.FXML
    public void initialize() {
        taskIdCol.setCellValueFactory(new PropertyValueFactory<>("taskId"));
        descriptionCol.setCellValueFactory(new PropertyValueFactory<>("description"));
        zoneCol.setCellValueFactory(new PropertyValueFactory<>("zone"));

//        taskTableView.getItems().addAll(taskList);
    }

    @javafx.fxml.FXML
    public void back(ActionEvent actionEvent) throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("AbdullahMohammadSadman/MaintenanceOfficerDashboard.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void showPendingTasks(ActionEvent actionEvent) {
    }
}