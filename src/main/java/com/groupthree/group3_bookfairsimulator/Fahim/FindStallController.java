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

import static com.groupthree.group3_bookfairsimulator.Fahim.stall.stallList;

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
        String name = nameT.getText();
        String numberText = numberT.getText();
        String type = (String) combobox.getValue();

        if (name.isEmpty() || numberText.isEmpty() || type == null) {
            lable.setText("Please fill All the Input");
            return;
        }

        int number;
        try {
            number = Integer.parseInt(numberText);
        } catch (NumberFormatException e) {
            lable.setText("Stall number must be an integer.");
            return;
        }

        String location = "";

        if (type.equals("Publisher Stall")) {
            location = "Zone A";
            lable.setText("The " + name + " (Stall No: " + number + ") is in Publisher area in " + location);
        } else if (type.equals("Author’s Corner")) {
            location = "Zone B";
            lable.setText("The " + name + " (Stall No: " + number + ") is in Author’s Corner in " + location);
        } else if (type.equals("Children’s Book Stall")) {
            location = "Zone C";
            lable.setText("The " + name + " (Stall No: " + number + ") is in Children’s Books in " + location);
        } else if (type.equals("Academic & Educational Stall")) {
            location = "Zone D";
            lable.setText("The " + name + " (Stall No: " + number + ") is in Academic & Educational area in " + location);
        } else if (type.equals("Comics & Graphic Novels Stall")) {
            location = "Zone E";
            lable.setText("The " + name + " (Stall No: " + number + ") is in Comics & Graphic Novels in " + location);
        } else if (type.equals("Second-hand Books Stall")) {
            location = "Zone F";
            lable.setText("The " + name + " (Stall No: " + number + ") is in Second-hand Books in " + location);
        } else {
            lable.setText("Please select a valid stall type");
            return;
        }

        stallList.add(new stall(name, number, type, location));
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
