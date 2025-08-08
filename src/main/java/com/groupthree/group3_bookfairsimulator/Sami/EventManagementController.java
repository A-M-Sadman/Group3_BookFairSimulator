package com.groupthree.group3_bookfairsimulator.Sami;

import com.groupthree.group3_bookfairsimulator.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.util.PropertyPermission;

public class EventManagementController
{
    @javafx.fxml.FXML
    private TableColumn<Eventmanagement,String> locationCol;
    @javafx.fxml.FXML
    private TableColumn<Eventmanagement, String> dateCol;
    @javafx.fxml.FXML
    private TableColumn<Eventmanagement, String> eventTypeCol;
    @javafx.fxml.FXML
    private TableColumn<Eventmanagement,String> eventnameCol;
    @javafx.fxml.FXML
    private DatePicker datePicker;
    @javafx.fxml.FXML
    private ComboBox<String> locationCombobox;
    @javafx.fxml.FXML
    private ComboBox<String> eventTypeCombobox;
    @javafx.fxml.FXML
    private Label evenManagementLabel;
    @javafx.fxml.FXML
    private TableView<Eventmanagement> evenmanagementTableView;
    @javafx.fxml.FXML
    private TextField EventNametextField;

    @javafx.fxml.FXML
    public void initialize() {
        eventnameCol.setCellValueFactory(new PropertyValueFactory<>("eventName"));
        locationCol.setCellValueFactory(new PropertyValueFactory<>("location"));
        eventTypeCol.setCellValueFactory(new PropertyValueFactory<>("eventType"));
        dateCol.setCellValueFactory(new PropertyValueFactory<>("date"));


        eventTypeCombobox.getItems().addAll("Book Launch", "Author Meet and Greet", "Poetry Recitation", "Storytelling Session","Panel Discussion on Literature","Children’s Book Hour","Folk Music Night","Nazrul Sangeet", "Rabindra Sangeet Performance","Cultural Dance Program","Workshop","Seminar","Tea talk");
        locationCombobox.getItems().addAll("Ekushey Book Fair Ground","Bangla Academy Library","Auditorium","Shikha Chirantoni","Open Ground at Sohrawardy Uddan","Ramna Racecourse Ground","TSC");










    }

    @javafx.fxml.FXML
    public void viewDetailsButton(ActionEvent actionEvent) {
        String eventname = EventNametextField.getText();
        String location = locationCombobox.getValue();
        String eventType = eventTypeCombobox.getValue();
        String date = String.valueOf(datePicker.getValue());
        String e = eventTypeCombobox.getSelectionModel().getSelectedItem();
        if (EventNametextField.getText().isEmpty()) {
            evenManagementLabel.setText("Please Provide the event name");
            return;
        }
        if (locationCombobox == null){
            evenManagementLabel.setText("Please Select the location");
            return;
        }
        if (eventTypeCombobox == null){
            evenManagementLabel.setText("Please select the event Type");
            return;
        }
        if (datePicker.getValue() == null){
            evenManagementLabel.setText("Please Select the date");
            return;
        }
        Eventmanagement newBook = new Eventmanagement(eventname,location,eventType,date);


        evenmanagementTableView.getItems().add(newBook);

        // Clear input
        EventNametextField.clear();
        locationCombobox.getSelectionModel().clearSelection();
        eventTypeCombobox.getSelectionModel().clearSelection();
        datePicker.setValue(null);
        evenManagementLabel.setText("Successful!");



    }

    @javafx.fxml.FXML
    public void backOnaction(ActionEvent actionEvent)throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Sami/AuthorDashboard.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setScene(scene);
    }
}