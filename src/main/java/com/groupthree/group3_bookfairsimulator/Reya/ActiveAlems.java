package com.groupthree.group3_bookfairsimulator.Reya;

import com.groupthree.group3_bookfairsimulator.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class ActiveAlems
{
    @javafx.fxml.FXML
    private TableColumn<activeAlermModelClass,String> locationCol;
    @javafx.fxml.FXML
    private TableColumn<activeAlermModelClass,String> dateCol;
    @javafx.fxml.FXML
    private TableColumn<activeAlermModelClass,String> incidentTypeCol;
    @javafx.fxml.FXML
    private TableColumn<activeAlermModelClass,String> alarmId;
    @javafx.fxml.FXML
    private ComboBox<String> incidentTypeXombo;
    @javafx.fxml.FXML
    private TextField alarmIdtetField;
    @javafx.fxml.FXML
    private TextField locationTextfield;
    @javafx.fxml.FXML
    private DatePicker datePICKER;
    @javafx.fxml.FXML
    private TableView<activeAlermModelClass> tableView;
    @javafx.fxml.FXML
    private Label alarmLabel;

    @javafx.fxml.FXML
    public void initialize() {
        dateCol.setCellValueFactory(new PropertyValueFactory<>("date"));
        locationCol.setCellValueFactory(new PropertyValueFactory<>("location"));
        incidentTypeCol.setCellValueFactory(new PropertyValueFactory<>("incidentType"));
        alarmId.setCellValueFactory(new PropertyValueFactory<>("alarmId"));
        incidentTypeXombo.getItems().addAll(
                "Lost Child",
                "Lost Item",
                "Medical Emergency",
                "Fire Alarm Triggered",
                "Suspicious Package",
                "Unauthorized Entry",
                "Theft Reported",
                "Crowd Surge",
                "Power Outage",
                "Slip / Trip / Fall Injury",
                "VIP Movement Security Breach",
                "Weather Alert (Rain/Storm)",
                "Gas Leak / Chemical Spill",
                "Electrical Hazard",
                "Minor Conflict / Argument",
                "Major Security Breach"
        );


    }

    @javafx.fxml.FXML
    public void startAlerm(ActionEvent actionEvent) {
        String alarmId = alarmIdtetField.getText();
        String incidentType = incidentTypeXombo.getValue();
        String location = locationTextfield.getText();
        String date = String.valueOf(datePICKER.getValue());

        activeAlermModelClass s = tableView.getSelectionModel().getSelectedItem();

        if (alarmIdtetField.getText().isEmpty()){
            alarmLabel.setText("Please provide alarm ID");
            return;

        }
        if (locationTextfield.getText().isEmpty()){
            alarmLabel.setText("Please provide the location");
            return;
        }
        if(datePICKER.getValue() == null){
            alarmLabel.setText("Set the date");
            return;
        }
        if (incidentTypeXombo.getValue() == null){
            alarmLabel.setText("Please provide the incident Type");
            return;
        }
        activeAlermModelClass s1 = new activeAlermModelClass(alarmId,incidentType,location,date);

        tableView.getItems().add(s1);

        // Clear input
        alarmIdtetField.clear();
        incidentTypeXombo.getSelectionModel().clearSelection();
        locationTextfield.clear();

        datePICKER.setValue(null);

        alarmLabel.setText("Successful!");
    }

    @javafx.fxml.FXML
    public void dashBoardButton(ActionEvent actionEvent)throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Reya/securityOfficerDashboard.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setScene(scene);
    }
}