package com.groupthree.group3_bookfairsimulator.Reya;

import com.groupthree.group3_bookfairsimulator.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class VolunteerCoordinate
{
    @javafx.fxml.FXML
    private ComboBox<String> availabilitycombo;
    @javafx.fxml.FXML
    private TextField volunteeridtextfield;
    @javafx.fxml.FXML
    private TextField nametextfield;
    @javafx.fxml.FXML
    private Label volunteerLabel;
    @javafx.fxml.FXML
    private TextField locationTextfield;

    @javafx.fxml.FXML
    public void initialize() {
        availabilitycombo.getItems().addAll("10:00AM-01:00PM","01:00PM-05:00PM","05:00-08:00PM");


    }



    @javafx.fxml.FXML
    public void backonactions(ActionEvent actionEvent)throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Reya/HelpDeskOfficerDasboard.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void assignDutyButton(ActionEvent actionEvent) {
        if (volunteeridtextfield.getText().isEmpty()){
            volunteerLabel.setText("Provide volunteer id");
            return;
        }
        if (nametextfield.getText().isEmpty()){
            volunteerLabel.setText("Provide your name");
            return;
        }
        if (locationTextfield.getText().isEmpty()){
            volunteerLabel.setText("Please provide location");
            return;

        }
        if (availabilitycombo.getValue() == null){
            volunteerLabel.setText("Please provide time");
            return;
        }
        volunteeridtextfield.clear();
        nametextfield.clear();
        locationTextfield.clear();
        availabilitycombo.getSelectionModel().clearSelection();
        volunteerLabel.setText("Successful");

    }
}