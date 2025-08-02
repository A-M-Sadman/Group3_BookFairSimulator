package com.groupthree.group3_bookfairsimulator.AbdullahMohammadSadman;

import com.groupthree.group3_bookfairsimulator.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class CheckScheduleController
{
    @javafx.fxml.FXML
    private ComboBox zoneInput;
    @javafx.fxml.FXML
    private TableColumn taskCol;
    @javafx.fxml.FXML
    private TableColumn dateCol;
    @javafx.fxml.FXML
    private Label notifyStaffLabel;
    @javafx.fxml.FXML
    private TableView taskTableView;
    @javafx.fxml.FXML
    private ComboBox staffNameInput;
    @javafx.fxml.FXML
    private ComboBox taskInput;
    @javafx.fxml.FXML
    private TableColumn zoneCol;
    @javafx.fxml.FXML
    private TableColumn staffNameCol;
    @javafx.fxml.FXML
    private DatePicker dateInput;
    @javafx.fxml.FXML
    private Label assignDutyLabel;
    @javafx.fxml.FXML
    private TableColumn taskCol1;
    @javafx.fxml.FXML
    private TableColumn zoneCol1;

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
    public void assignDuty(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void notifyStaff(ActionEvent actionEvent) {
    }
}