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

public class CoordinateWithOrganaizer
{

    @javafx.fxml.FXML
    private TextField coordinateTextField;
    @javafx.fxml.FXML
    private TextField meetingTimeTextField;
    @javafx.fxml.FXML
    private Label coordinateLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent)throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Reya/HelpDeskOfficerDasboard.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setScene(scene);

    }


    @javafx.fxml.FXML
    public void confirmButton(ActionEvent actionEvent) {
        if (coordinateTextField.getText().isEmpty()){
            coordinateLabel.setText("Provide coordinate label");
            return;
        }
        if (meetingTimeTextField.getText().isEmpty()){
            coordinateLabel.setText("Provide Time");
            return;
        }

    }
}