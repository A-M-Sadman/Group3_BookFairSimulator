package com.groupthree.group3_bookfairsimulator.Fahim;

import com.groupthree.group3_bookfairsimulator.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

import static com.groupthree.group3_bookfairsimulator.Fahim.EventManager.eventList;

public class ChangeEventTimeController {

    @FXML
    private TableColumn<Event, String> namecol1;
    @FXML
    private TableColumn<Event, String> timecol1;

    @FXML
    private TableColumn<Event, String> locationcol1;
    @FXML
    private TableColumn<Event, String> datecol1;
    @FXML
    private TableView<Event> tableview1;

    @FXML
    private TextField name;
    @FXML
    private TextField time;
    @FXML
    private DatePicker datepicker;

    @FXML
    private RadioButton am;
    @FXML
    private RadioButton pm;

    @FXML
    private Label lable;
    @FXML
    private TextField eventlocation;
    @FXML
    private ToggleGroup toggleTime;

    @FXML
    public void initialize() {
        namecol1.setCellValueFactory(new PropertyValueFactory<>("title"));
        datecol1.setCellValueFactory(new PropertyValueFactory<>("date"));
        timecol1.setCellValueFactory(new PropertyValueFactory<>("time"));
        locationcol1.setCellValueFactory(new PropertyValueFactory<>("location"));
        tableview1.getItems().setAll(eventList);
    }

    @FXML
    public void change(ActionEvent actionEvent) {
        Event s = tableview1.getSelectionModel().getSelectedItem();
        if (s == null) {
            lable.setText("Please select an event");
            return;
        }

        if (name.getText().isEmpty()) {
            return;
        }
        if (datepicker.getValue() == null) {
            return;
        }
        if (time.getText().isEmpty()) {
            return;
        }
        if (eventlocation.getText().isEmpty()) {
            return;
        }

        String t = time.getText();
        if (pm.isSelected()) {
            t = t + " PM";
        } else if (am.isSelected()) {
            t = t + " AM";
        }

        s.setTitle(name.getText());
        s.setDate(datepicker.getValue());
        s.setTime(t);
        s.setLocation(eventlocation.getText());
        tableview1.getItems().clear();
        tableview1.getItems().addAll(eventList);

        lable.setText("Event updated successfully");

    }

    @FXML
    public void next(ActionEvent actionEvent) throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Fahim/SeeWhoJoinedEvent.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setScene(scene);
    }

    @FXML
    public void dashbord(ActionEvent actionEvent) throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Fahim/EventManager.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setScene(scene);
    }

    @FXML
    public void back(ActionEvent actionEvent) throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Fahim/AddSpeaker.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setScene(scene);
    }
}
