package com.groupthree.group3_bookfairsimulator.Fahim;

import com.groupthree.group3_bookfairsimulator.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.time.LocalDate;

import static com.groupthree.group3_bookfairsimulator.Fahim.EventManager.eventList;

public class CancelanEventController
{
    @javafx.fxml.FXML
    private TableView<Event> tableviwe;
    @javafx.fxml.FXML
    private TableColumn<Event, String> timecoloum;
    @javafx.fxml.FXML
    private TextField titleTextFild;
    @javafx.fxml.FXML
    private Label lable;
    @javafx.fxml.FXML
    private TableColumn<Event, String> titlecoloum;
    @javafx.fxml.FXML
    private DatePicker datepicker;
    @javafx.fxml.FXML
    private TableColumn<Event, LocalDate> datecoloum;
    @javafx.fxml.FXML
    private TableColumn<Event, String> locationcol;

    @javafx.fxml.FXML
    public void initialize() {
        titlecoloum.setCellValueFactory(new PropertyValueFactory<>("title"));
        datecoloum.setCellValueFactory(new PropertyValueFactory<>("date"));
        timecoloum.setCellValueFactory(new PropertyValueFactory<>("time"));
        locationcol.setCellValueFactory(new PropertyValueFactory<>("location"));
        tableviwe.getItems().setAll(eventList);
    }

    @javafx.fxml.FXML
    public void filter(ActionEvent actionEvent) {
        if (titleTextFild.getText().isEmpty()) {
            lable.setText("Please enter Event Title");
            return;
        }
        if (datepicker.getValue() == null) {
            lable.setText("Please select Event Date");
            return;
        }
        tableviwe.getItems().clear();
        for (Event a : eventList) {
            if (a.getTitle().equals(titleTextFild.getText()) ||
                    (a.getDate().equals(datepicker.getValue()))) {
                tableviwe.getItems().add(a);
            }
        }
    }

    @javafx.fxml.FXML
    public void resetfilter(ActionEvent actionEvent) {
        tableviwe.getItems().clear();
        tableviwe.getItems().addAll(eventList);
    }

    @javafx.fxml.FXML
    public void dashbord(ActionEvent actionEvent) throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Fahim/EventManager.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void back(ActionEvent actionEvent) throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Fahim/CheckVisitorFeedback.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void cancelEvent(ActionEvent actionEvent) {
        Event s = tableviwe.getSelectionModel().getSelectedItem();
        if (s == null){
            lable.setText("Please Select a Event which you want to cancel");
            return;
        }
        tableviwe.getItems().remove(s);
        eventList.remove(s);
        lable.setText("Event Delete Successfully");
    }
}
