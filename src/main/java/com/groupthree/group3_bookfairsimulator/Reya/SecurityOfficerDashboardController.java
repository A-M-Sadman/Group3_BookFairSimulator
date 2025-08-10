package com.groupthree.group3_bookfairsimulator.Reya;

import com.groupthree.group3_bookfairsimulator.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class SecurityOfficerDashboardController
{
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void accessSequrityButton(ActionEvent actionEvent)throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Reya/accessSequrityLogs.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setTitle("Done");
        HelloApplication.stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void activeAlermButton(ActionEvent actionEvent) throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Reya/activeAlerms.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setTitle("Activate Alarm");
        HelloApplication.stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void visitorEntryButton(ActionEvent actionEvent) throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Reya/visitorEntry.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setTitle("Done");
        HelloApplication.stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void emergencyDrillButton(ActionEvent actionEvent) throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Reya/emergencyDrill.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setTitle("Emergency Drill Done");
        HelloApplication.stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void assignDutyButton(ActionEvent actionEvent) throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Reya/ assignDuty.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setTitle("Assign Duty Done");
        HelloApplication.stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void realTimeButton(ActionEvent actionEvent) throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Reya/realTimeSurvillance.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setTitle("Real Time Button");
        HelloApplication.stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void incidentReportButton(ActionEvent actionEvent) throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Reya/incidentReport.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setTitle("Done");
        HelloApplication.stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void manageSequrityClearenceButton(ActionEvent actionEvent) throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Reya/manageSequrityClearence.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setTitle("Done");
        HelloApplication.stage.setScene(scene);
    }
}