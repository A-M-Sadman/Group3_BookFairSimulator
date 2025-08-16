package com.groupthree.group3_bookfairsimulator.Reya;

import com.groupthree.group3_bookfairsimulator.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class ManageSequrityClearence
{
    @javafx.fxml.FXML
    private TextField idTextField;
    @javafx.fxml.FXML
    private TextField nameTextField;
    @javafx.fxml.FXML
    private Label secuirityClearanceLabel;
    @javafx.fxml.FXML
    private ComboBox<String> roleComboBox;
    @javafx.fxml.FXML
    private ComboBox<String> clearanceCombo;

    @javafx.fxml.FXML
    public void initialize() {
        roleComboBox.getItems().addAll("Gate Security officer","Patrol Officer","Crowd control officer","FireFighting Officer","Medical Officer");
        clearanceCombo.getItems().addAll("General Access – Public Areas", "Zone Supervisor – Specific Zones",
                "Restricted Area Access – Backstage / Storae","Emergency Response – Fire/Medical/Security Threat","VIP Escort & Protection");

    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent)throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Reya/HelpDeskOfficerDasboard.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void manageButton(ActionEvent actionEvent) {
        if (idTextField.getText().isEmpty()){
            secuirityClearanceLabel.setText("Please Provide your ID");
            return;
        }
        if (nameTextField.getText().isEmpty()){
            secuirityClearanceLabel.setText("Please provide your name");
            return;
        }
        if (clearanceCombo.getValue() == null){
            secuirityClearanceLabel.setText("Please provide clearance");
            return;
        }
        if (roleComboBox.getValue() == null){
            secuirityClearanceLabel.setText("Please provide role");
            return;
        }
        clearanceCombo.getSelectionModel().clearSelection();
        roleComboBox.getSelectionModel().clearSelection();
        idTextField.clear();

        nameTextField.clear();
        secuirityClearanceLabel.setText("Successful!");

    }
}