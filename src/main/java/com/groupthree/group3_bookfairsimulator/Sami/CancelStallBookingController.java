package com.groupthree.group3_bookfairsimulator.Sami;

import com.groupthree.group3_bookfairsimulator.HelloApplication;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class CancelStallBookingController
{
    @javafx.fxml.FXML
    private TextField stallNumberTextField;
    @javafx.fxml.FXML
    private ComboBox<String> statusCombobox;
    @javafx.fxml.FXML
    private Label cancelLabel;
    @javafx.fxml.FXML
    private TextField authorID;

    @javafx.fxml.FXML
    public void initialize() {
        statusCombobox.getItems().addAll("Cancelled");

    }

    @javafx.fxml.FXML
    public void cancelButton(ActionEvent actionEvent) {
        if (authorID.getText().isEmpty()){
            cancelLabel.setText("Provide author ID");
            return;


        }
        if (stallNumberTextField.getText().isEmpty()){
            cancelLabel.setText("Add stallID");
            return;
        }
        if (statusCombobox.getItems() == null){
            cancelLabel.setText("Provide the status");
            return;
        }
        authorID.clear();
        stallNumberTextField.clear();
        statusCombobox.getSelectionModel().clearSelection();
        cancelLabel.setText("Cancel successfully!");
    }


    @javafx.fxml.FXML
    public void backButton(Event event)throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Sami/AuthorDashboard.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setScene(scene);
    }
}