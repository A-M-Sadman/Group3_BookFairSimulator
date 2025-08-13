package com.groupthree.group3_bookfairsimulator.Sami;

import com.groupthree.group3_bookfairsimulator.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class LogisticSupport
{
    @javafx.fxml.FXML
    private TextField logisticTypeTextField;
    @javafx.fxml.FXML
    private TextField detailsTextField;
    @javafx.fxml.FXML
    private TextField stallNumberTextField;
    @javafx.fxml.FXML
    private Label logisticSupportLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void dashboarButton(ActionEvent actionEvent)throws IOException {



        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Sami/PublisherDashboard.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void confirmButton(ActionEvent actionEvent) {
        if (stallNumberTextField.getText().isEmpty()){
            logisticSupportLabel.setText("Provide Stall Number");
            return;
        }
        if (logisticTypeTextField.getText().isEmpty()){
            logisticSupportLabel.setText("Provide Logistic Type");
            return;
        }
        if (detailsTextField.getText().isEmpty()){
            logisticSupportLabel.setText("Provide details");
            return;
        }
        stallNumberTextField.clear();
        logisticTypeTextField.clear();
        detailsTextField.clear();
        logisticSupportLabel.setText("Successful");

    }
}