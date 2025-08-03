package com.groupthree.group3_bookfairsimulator.Fahim;

import com.groupthree.group3_bookfairsimulator.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class FindStallController
{
    @javafx.fxml.FXML
    private Label lable;
    @javafx.fxml.FXML
    private TextField nameT;
    @javafx.fxml.FXML
    private TextField numberT;
    @javafx.fxml.FXML
    private ComboBox combobox;

    @javafx.fxml.FXML
    public void initialize() {
        combobox.getItems().addAll("Publisher Stall","Author’s Corner","Children’s Book Stall","Academic & Educational Stall","Comics & Graphic Novels Stall","Second-hand Books Stall");
    }

    @javafx.fxml.FXML
    public void search(ActionEvent actionEvent) {
        if (nameT.getText().isEmpty() && numberT.getText().isEmpty() && combobox.getValue() == null) {
            lable.setText("Please fill All the Input");
            return;
        }
        if ("Publisher Stall".equals(combobox.getValue())) {
            lable.setText("The " + nameT.getText() + " is in Publisher area in Zone A");
        } else if ("Author’s Corner".equals(combobox.getValue())) {
            lable.setText("The " + nameT.getText() + " is in Author’s Corner in Zone B");
        } else if ("Children’s Book Stall".equals(combobox.getValue())) {
            lable.setText("The " + nameT.getText() + " is in Children’s Books in Zone C");
        } else if ("Academic & Educational Stall".equals(combobox.getValue())) {
            lable.setText("The " + nameT.getText() + " is in Academic & Educational area in Zone D");
        } else if ("Comics & Graphic Novels Stall".equals(combobox.getValue())) {
            lable.setText("The " + nameT.getText() + " is in Comics & Graphic Novels in Zone E");
        } else if ("Second-hand Books Stall".equals(combobox.getValue())) {
            lable.setText("The " + nameT.getText() + " is in Second-hand Books in Zone F");
        } else {
            lable.setText("Please select a valid stall type");
        }
    }

    @javafx.fxml.FXML
    public void dashbord(ActionEvent actionEvent) throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Fahim/visitor.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void back(ActionEvent actionEvent) throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Fahim/JoinEvent.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void next(ActionEvent actionEvent) throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Fahim/GiveFeedback.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setScene(scene);
    }
}
