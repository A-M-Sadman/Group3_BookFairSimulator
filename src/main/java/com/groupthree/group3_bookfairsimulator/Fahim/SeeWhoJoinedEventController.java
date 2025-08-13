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

import static com.groupthree.group3_bookfairsimulator.Fahim.EventManager.joinList;

public class SeeWhoJoinedEventController
{
    @javafx.fxml.FXML
    private TableColumn<Event, LocalDate> eventdatecoloum;
    @javafx.fxml.FXML
    private TableColumn<Event, String> pNamecoloum;
    @javafx.fxml.FXML
    private TextField nametextfild;
    @javafx.fxml.FXML
    private TableColumn<Event, String> eventnameColoum;
    @javafx.fxml.FXML
    private TableView<Event> tableviwe;
    @javafx.fxml.FXML
    private TextField eventtextfild;
    @javafx.fxml.FXML
    private TableColumn<Event, String> eventLocationcoloum;
    @javafx.fxml.FXML
    private Label lable;
    @javafx.fxml.FXML
    private TableColumn<Event, String> eventTimecoloum;
    @javafx.fxml.FXML
    private DatePicker datepicker;

    @javafx.fxml.FXML
    public void initialize() {
        eventnameColoum.setCellValueFactory(new PropertyValueFactory<>("title"));
        eventdatecoloum.setCellValueFactory(new PropertyValueFactory<>("date"));
        eventTimecoloum.setCellValueFactory(new PropertyValueFactory<>("time"));
        eventLocationcoloum.setCellValueFactory(new PropertyValueFactory<>("location"));
        pNamecoloum.setCellValueFactory(new PropertyValueFactory<>("parName"));

        tableviwe.getItems().addAll(joinList);
        lable.setText("For Search a Event Fill the Input.");
    }

    @javafx.fxml.FXML
    public void next(ActionEvent actionEvent) throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Fahim/SendNewstoVisitors.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setScene(scene);
    }

    public void viweforspecific(ActionEvent actionEvent) {
        if (nametextfild.getText().isEmpty() || eventtextfild.getText().isEmpty() || datepicker.getValue() == null) {
            lable.setText("Please fill all the input fields.");
            return;
        }
        tableviwe.getItems().clear();
        for (Event a : joinList) {
            if (a.getParName().equals(nametextfild.getText()) && a.getTitle().equals(eventtextfild.getText()) && a.getDate().equals(datepicker.getValue())) {
                tableviwe.getItems().add(a);
            }
        }
        if (tableviwe.getItems().isEmpty()) {
            lable.setText("No matching event found.");
        } else {
            lable.setText("Event(s) found successfully.");
        }
    }



    @javafx.fxml.FXML
    public void dashbord(ActionEvent actionEvent) throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Fahim/EventManager.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void back(ActionEvent actionEvent) throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Fahim/ChangeEventTime.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void Reset(ActionEvent actionEvent) {
        tableviwe.getItems().clear();
        tableviwe.getItems().addAll(joinList);
    }
}