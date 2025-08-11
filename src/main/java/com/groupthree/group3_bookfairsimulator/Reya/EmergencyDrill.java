package com.groupthree.group3_bookfairsimulator.Reya;

import com.groupthree.group3_bookfairsimulator.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class EmergencyDrill
{
    @javafx.fxml.FXML
    private ComboBox<String> drillTypeCombo;
    @javafx.fxml.FXML
    private ComboBox<String> assignCombo;
    @javafx.fxml.FXML
    private DatePicker datePicker;
    @javafx.fxml.FXML
    private Label emergenCydrillLabel;

    @javafx.fxml.FXML
    public void initialize() {
        assignCombo.getItems().addAll(    "Nazrul Moncho",
                "Lekhok Kunjo",
                "Children's Zone",
                "Main Stall Area",
                "Media Centre");
        drillTypeCombo.getItems().addAll(        "Fire Evacuation Drill",
                "Medical Emergency Drill",
                "Earthquake Drill",
                "Crowd Control Drill",
                "Security Threat Response Drill");
    }

    @javafx.fxml.FXML
    public void backButon(ActionEvent actionEvent)throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Reya/securityOfficerDashboard.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void confirmButton(ActionEvent actionEvent) {
        String DrillType = drillTypeCombo.getValue();
        String assign = assignCombo.getValue();
        String date = String.valueOf(datePicker.getValue());

        if (drillTypeCombo.getValue() == null){
            emergenCydrillLabel.setText("Select the drill type");
            return;

        }
        if (assignCombo.getValue() == null){
            emergenCydrillLabel.setText("Please assign");
            return;

        }
        if (datePicker.getValue() == null){
            emergenCydrillLabel.setText("Pleae set the date");
            return;
        }

        drillTypeCombo.getSelectionModel().clearSelection();
        assignCombo.getSelectionModel().clearSelection();
        datePicker.setValue(null);


    }
}