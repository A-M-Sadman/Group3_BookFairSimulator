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
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Reya/accessSequrityButton.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setTitle("Done");
        HelloApplication.stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void activeAlermButton(ActionEvent actionEvent) throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Reya/activeAlermButton.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setTitle("Activate Alarm");
        HelloApplication.stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void visitorEntryButton(ActionEvent actionEvent) throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Reya/visitorEntryButton.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setTitle("Done");
        HelloApplication.stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void emergencyDrillButton(ActionEvent actionEvent) throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Reya/emergencyDrillButton.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setTitle("Emergency Drill Done");
        HelloApplication.stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void assignDutyButton(ActionEvent actionEvent) throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Reya/ assignDutyButton.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setTitle("Assign Duty Done");
        HelloApplication.stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void realTimeButton(ActionEvent actionEvent) throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Reya/realTimeButton.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setTitle("Real Time Button");
        HelloApplication.stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void incidentReportButton(ActionEvent actionEvent) throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Reya/incidentReportButton.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setTitle("Done");
        HelloApplication.stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void manageSequrityClearenceButton(ActionEvent actionEvent) throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Reya/manageSequrityClearenceButton.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setTitle("Done");
        HelloApplication.stage.setScene(scene);
    }
}