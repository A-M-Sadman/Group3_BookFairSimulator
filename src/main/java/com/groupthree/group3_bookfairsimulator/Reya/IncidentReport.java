package com.groupthree.group3_bookfairsimulator.Reya;

import com.groupthree.group3_bookfairsimulator.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class IncidentReport
{
    @javafx.fxml.FXML
    private TextField incidentIDTextField;
    @javafx.fxml.FXML
    private DatePicker datePicker;
    @javafx.fxml.FXML
    private TextField locationTextField;
    @javafx.fxml.FXML
    private TextArea textArea;
    @javafx.fxml.FXML
    private Label incidentLabel;

    @javafx.fxml.FXML
    public void initialize() {
        //IncidentCombox.setCellFactory(new PropertyValueFactory<>("Incident"));




    }

    @javafx.fxml.FXML
    public void dashboardButton(ActionEvent actionEvent)throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Reya/securityOfficerDashboard.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void addButton(ActionEvent actionEvent) {
        if (incidentIDTextField.getText().isEmpty()){
            incidentLabel.setText("Provide Your Id");
            return;

        }
        if (datePicker.getValue() == null){
            incidentLabel.setText("Please Provide Date");
            return;
        }
        if (locationTextField.getText().isEmpty()){
            incidentLabel.setText("Please provide location");
            return;
        }
        if (textArea.getText().isEmpty()){
            incidentLabel.setText("Please provide details");
            return;
        }


        incidentIDTextField.clear();
        datePicker.setValue(null);
        locationTextField.clear();
        incidentLabel.setText("Successful");

    }
}