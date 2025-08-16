package com.groupthree.group3_bookfairsimulator.Reya;

import com.groupthree.group3_bookfairsimulator.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class AssignDuty
{
    @javafx.fxml.FXML
    private TextField idTextField;
    @javafx.fxml.FXML
    private TextField currentDutyTextField;
    @javafx.fxml.FXML
    private TextField nameTextField;
    @javafx.fxml.FXML
    private TextField locationTextField;
    @javafx.fxml.FXML
    private Label label;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void addDutyButton(ActionEvent actionEvent) {
        if (nameTextField.getText().isEmpty()){
            label.setText("Add Duty");
            return;
        }
        if (idTextField.getText().isEmpty()){
            label.setText("ID");
            return;
        }
        if (currentDutyTextField.getText().isEmpty()){
            label.setText("Duty");
            return;
        }
        if (locationTextField.getText().isEmpty()){
            label.setText("add location");
            return;
        }

        nameTextField.clear();
        idTextField.clear();
        currentDutyTextField.clear();
        locationTextField.clear();
        label.setText("Done");
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent)throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Reya/SequirityOfficerDashboard.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setScene(scene);
    }
}