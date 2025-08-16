package com.groupthree.group3_bookfairsimulator.Reya;

import com.groupthree.group3_bookfairsimulator.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class ProvideDirection
{
    @javafx.fxml.FXML
    private TextField contactNumber;
    @javafx.fxml.FXML
    private TextField visitorNameTextField;
    @javafx.fxml.FXML
    private TextArea textArea;
    @javafx.fxml.FXML
    private Label label;
    @javafx.fxml.FXML
    private TextField idTextField;
    @javafx.fxml.FXML
    private DatePicker datepicker;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void dashboardButton(ActionEvent actionEvent)throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Reya/HelpDeskOfficerDasboard.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setScene(scene);


    }

    @javafx.fxml.FXML
    public void addButton(ActionEvent actionEvent) {
        if (visitorNameTextField.getText().isEmpty()){
            label.setText("Provide your name");
            return;

        }
        if (idTextField.getText().isEmpty()){
            label.setText("Provide Your Id");
            return;
        }
        if (contactNumber.getText().isEmpty()){
            label.setText("Provide Contact Number");
            return;

        }
        if (textArea.getText().isEmpty()){
            label.setText("Provide Information");
            return;
        }
        if (datepicker.getValue() == null){
            label.setText("Please provide date");
            return;
        }

        visitorNameTextField.clear();
        idTextField.clear();
        textArea.clear();
        label.setText("Successful");
    }
}