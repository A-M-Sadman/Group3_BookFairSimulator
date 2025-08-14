package com.groupthree.group3_bookfairsimulator.Reya;

import com.groupthree.group3_bookfairsimulator.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class EventScheduleUpdate
{
    @javafx.fxml.FXML
    private ComboBox<String> eventtypecombobox;
    @javafx.fxml.FXML
    private ComboBox<String> locationcombobox;
    @javafx.fxml.FXML
    private Label eventLabel;

    @javafx.fxml.FXML
    public void initialize() {
        eventtypecombobox.getItems().addAll("Book Launch", "Author Meet and Greet", "Poetry Recitation", "Storytelling Session","Panel Discussion on Literature","Children’s Book Hour","Folk Music Night","Nazrul Sangeet", "Rabindra Sangeet Performance","Cultural Dance Program","Workshop","Seminar","Tea talk");
        locationcombobox.getItems().addAll("Ekushey Book Fair Ground","Bangla Academy Library","Auditorium","Shikha Chirantoni","Open Ground at Sohrawardy Uddan","Ramna Racecourse Ground","TSC");

    }

    @javafx.fxml.FXML
    public void updateeventonaction(ActionEvent actionEvent) {
        if (eventtypecombobox.getValue() == null){
            eventLabel.setText("Provide EventType");
            return;
        }
        if (locationcombobox.getValue() == null){
            eventLabel.setText("Provide Location");
            return;
        }
        eventtypecombobox.getSelectionModel().clearSelection();
        locationcombobox.getSelectionModel().clearSelection();
        eventLabel.setText("Successful");
    }

    @javafx.fxml.FXML
    public void dashBoardButton(ActionEvent actionEvent)throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Reya/HelpDeskOfficerDasboard.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setScene(scene);
    }
}