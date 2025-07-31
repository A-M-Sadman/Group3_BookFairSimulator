package com.groupthree.group3_bookfairsimulator.Fahim;

import com.groupthree.group3_bookfairsimulator.AbdullahMohammadSadman.Book;
import com.groupthree.group3_bookfairsimulator.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

import static com.groupthree.group3_bookfairsimulator.AbdullahMohammadSadman.Book.bookList;

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
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void addNewEvent(ActionEvent actionEvent) {
        if ((eventTitleTextfild.getText().isEmpty()) || (eventLocation.getText().isEmpty()) || (eventTimeTextFild.getText().isEmpty()) || (datepicker.getValue() == null)){
            lable.setText("Please fill-up all the input fields!");
            return;
        }
        for (Book b : bookList){
            if ((b.getLocation().equals(eventLocation.getText())) && (b.getTime().equals(eventTimeTextFild.getText())) && b.getDate().equals(datepicker.getValue())){
                lable.setText("Same Date and Same Location another ");
                return;
            }
    }}

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