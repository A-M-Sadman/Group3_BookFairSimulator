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

public class OfficerLogin
{
    @javafx.fxml.FXML
    private TextField officerNameTextField;
    @javafx.fxml.FXML
    private Label officerLabel;
    @javafx.fxml.FXML
    private TextField passwordTextField;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void generateButton(ActionEvent actionEvent) {
        if (officerNameTextField.getText().isEmpty()){
            officerLabel.setText("Officer");
            return;
        }
        if (passwordTextField.getText().isEmpty()){
            officerLabel.setText("Generate Password");
            return;
        }

        officerNameTextField.clear();
        passwordTextField.clear();
        officerLabel.setText("Successful");


    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent)throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Reya/HelpDeskOfficerDasboard.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setScene(scene);
    }
}