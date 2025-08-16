package com.groupthree.group3_bookfairsimulator.Sami;

import com.groupthree.group3_bookfairsimulator.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class VisitorInquery
{
    @javafx.fxml.FXML
    private TextField visitorIdTextField;
    @javafx.fxml.FXML
    private TextField visitorNameTextField;
    @javafx.fxml.FXML
    private TextArea textArea;
    @javafx.fxml.FXML
    private Label visitorLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void submitButton(ActionEvent actionEvent) {
        if (visitorNameTextField.getText().isEmpty()){
            visitorLabel.setText("Provide Visitor ID");
            return;

        }
        if (visitorIdTextField.getText().isEmpty()){
            visitorLabel.setText("Please provide Visitor ID");
            return;

        }
        if (textArea.getText().isEmpty()){
            visitorLabel.setText("Provide information");
            return;
        }
        visitorNameTextField.clear();
        visitorIdTextField.clear();
        textArea.clear();
        visitorLabel.setText("Successful");
    }

    @javafx.fxml.FXML
    public void dashBoardButton(ActionEvent actionEvent)throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Sami/PublisherDashboard.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setScene(scene);
    }
}