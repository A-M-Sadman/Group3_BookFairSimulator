package com.groupthree.group3_bookfairsimulator.AbdullahMohammadSadman;

import com.groupthree.group3_bookfairsimulator.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class MaintenanceOfficerDashboardController
{
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void reportCleanedArea(ActionEvent actionEvent) throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("AbdullahMohammadSadman/ReportCleanedArea.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setTitle("Report Cleaned Area");
        HelloApplication.stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void viewPendingTask(ActionEvent actionEvent) throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("AbdullahMohammadSadman/ViewPendingTask.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setTitle("Pending Tasks");
        HelloApplication.stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void logout(ActionEvent actionEvent) throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Login.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void logRepair(ActionEvent actionEvent) throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("AbdullahMohammadSadman/LogRepair.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setTitle("Log repair");
        HelloApplication.stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void updateFacilityStatus(ActionEvent actionEvent) throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("AbdullahMohammadSadman/UpdateFacilityStatus.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setTitle("Facility Status");
        HelloApplication.stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void reportATechnicalIssue(ActionEvent actionEvent) throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("AbdullahMohammadSadman/ReportATechnicalIssue.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setTitle("Technical Issue");
        HelloApplication.stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void checkSupply(ActionEvent actionEvent) throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("AbdullahMohammadSadman/CheckSupply.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setTitle("Check Supply");
        HelloApplication.stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void checkSchedule(ActionEvent actionEvent) throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("AbdullahMohammadSadman/CheckSchedule.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setTitle("Make Schedule");
        HelloApplication.stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void markCompletedTask(ActionEvent actionEvent) throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("AbdullahMohammadSadman/MarkCompletedTask.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setTitle("Task Completed");
        HelloApplication.stage.setScene(scene);
    }
}