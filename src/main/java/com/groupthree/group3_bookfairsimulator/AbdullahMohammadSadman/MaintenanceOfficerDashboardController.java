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
    public void reportCleanedArea(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void viewPendingTask(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void logout(ActionEvent actionEvent) throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Login.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void logRepair(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void updateFacilityStatus(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void reportATechnicalIssue(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void checkSupply(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void checkSchedule(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void markCompletedTask(ActionEvent actionEvent) {
    }
}