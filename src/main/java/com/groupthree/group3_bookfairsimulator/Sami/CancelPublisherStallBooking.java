package com.groupthree.group3_bookfairsimulator.Sami;

import com.groupthree.group3_bookfairsimulator.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class CancelPublisherStallBooking
{
    @javafx.fxml.FXML
    private TextField stallIdTextField;
    @javafx.fxml.FXML
    private TextField reasonId;
    @javafx.fxml.FXML
    private Label label;
    @javafx.fxml.FXML
    private TextField publisherIDTextField;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void cancelButton(ActionEvent actionEvent) {
        if (stallIdTextField.getText().isEmpty()){
            label.setText("Please provide Stall ID");
            return;
        }
        if (publisherIDTextField.getText().isEmpty()){
            label.setText("Please provide Stall ID");
            return;
        }
        if (reasonId.getText().isEmpty()){
            label.setText("Please provide Stall ID");
            return;
        }

        stallIdTextField.clear();
        publisherIDTextField.clear();
        reasonId.clear();
        label.setText("Successful");
    }

    @javafx.fxml.FXML
    public void dashBoardButton(ActionEvent actionEvent)throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Sami/PublisherDashboard.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setScene(scene);
    }
}