package com.groupthree.group3_bookfairsimulator.Fahim;

import com.groupthree.group3_bookfairsimulator.AbdullahMohammadSadman.Book;
import com.groupthree.group3_bookfairsimulator.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

import static com.groupthree.group3_bookfairsimulator.AbdullahMohammadSadman.Book.bookList;
import static com.groupthree.group3_bookfairsimulator.Fahim.Event.eventList;

public class AddNewEventController
{
    @javafx.fxml.FXML
    private TextField eventTitleTextfild;
    @javafx.fxml.FXML
    private TextField eventTimeTextFild;
    @javafx.fxml.FXML
    private TextField eventLocation;
    @javafx.fxml.FXML
    private Label lable;
    @javafx.fxml.FXML
    private DatePicker datepicker;
    @javafx.fxml.FXML
    private RadioButton am;
    @javafx.fxml.FXML
    private RadioButton pm;
    @javafx.fxml.FXML
    private ToggleGroup time;

    @javafx.fxml.FXML
    public void initialize() {
        am.setToggleGroup(time);
        pm.setToggleGroup(time);
    }

    @javafx.fxml.FXML
    public void addNewEvent(ActionEvent actionEvent) {
        if ((eventTitleTextfild.getText().isEmpty()) && (eventLocation.getText().isEmpty()) && (eventTimeTextFild.getText().isEmpty()) && (datepicker.getValue() == null)) {
            lable.setText("Please fill-up all the input fields!");
            return;
        }

        String time = eventTimeTextFild.getText();

        if (am.isSelected()) {
            time += " AM";
        } else if (pm.isSelected()) {
            time += " PM";
        } else {
            lable.setText("Please select AM or PM for the time.");
            return;
        }

        for (Event b : eventList) {
            if ((b.getLocation().equals(eventLocation.getText())) &&
                    (b.getTime().equals(time)) &&
                    b.getDate().equals(datepicker.getValue())) {

                lable.setText("Same Date, Time and Location already exists!");
                return;
            }
        }

        Event b = new Event(
                eventTitleTextfild.getText(),
                datepicker.getValue(),
                time,
                eventLocation.getText()
        );

        eventList.add(b);
        lable.setText("Event successfully added!");
    }


    @javafx.fxml.FXML
    public void next(ActionEvent actionEvent) throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Fahim/AddSpeaker.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void dashbord(ActionEvent actionEvent) throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Fahim/EventManager.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setScene(scene);
    }
}