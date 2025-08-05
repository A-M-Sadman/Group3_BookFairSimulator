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

import static com.groupthree.group3_bookfairsimulator.Fahim.Event.eventList;
import static com.groupthree.group3_bookfairsimulator.Fahim.Event.joinList;

public class JoinEventController
{
    @javafx.fxml.FXML
    private Label lable;
    @javafx.fxml.FXML
    private TableColumn<Event, String> tableTime;
    @javafx.fxml.FXML
    private TableColumn<Event, String> tableEvantName;
    @javafx.fxml.FXML
    private TableColumn<Event, String> tableLocation;
    @javafx.fxml.FXML
    private TableView<Event> tableviwe;
    @javafx.fxml.FXML
    private TextField eventNameTextfild;
    @javafx.fxml.FXML
    private DatePicker datepicker;
    @javafx.fxml.FXML
    private TableColumn<Event, LocalDate> tableDate;

    @javafx.fxml.FXML
    public void initialize() {
        tableEvantName.setCellValueFactory(new PropertyValueFactory<>("title"));
        tableDate.setCellValueFactory(new PropertyValueFactory<>("date"));
        tableTime.setCellValueFactory(new PropertyValueFactory<>("time"));
        tableLocation.setCellValueFactory(new PropertyValueFactory<>("location"));
        tableviwe.getItems().addAll(eventList);
    }

    @javafx.fxml.FXML
    public void join(ActionEvent actionEvent) throws IOException {
        if ((eventNameTextfild.getText().isEmpty()) ||
                (datepicker.getValue() == null)) {
            lable.setText("Please fill-up all the input fields!");
            return;
        }
        tableviwe.getItems().clear();
        for (Event x : eventList){
            if (eventNameTextfild.getText().equals(x.getTitle()) || (datepicker.getValue().equals(x.getDate()))){
                tableviwe.getItems().add(x);
                return;
            }
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
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Fahim/BuyBook.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void next(ActionEvent actionEvent) throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Fahim/FindStall.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void Reset(ActionEvent actionEvent) {
        eventNameTextfild.clear();
        tableviwe.getItems().setAll(eventList);
        lable.setText("");
    }

    @javafx.fxml.FXML
    public void joinTable(ActionEvent actionEvent) {
        if (tableviwe.getSelectionModel().getSelectedItem() == null) {
            lable.setText("Please select an event from the table.");
            return;
        }
        if (joinList.contains(tableviwe.getSelectionModel().getSelectedItem())) {
            lable.setText("You have already joined: " + (tableviwe.getSelectionModel().getSelectedItem()).getTitle());
            return;

        }
        joinList.add(tableviwe.getSelectionModel().getSelectedItem());
        lable.setText("You have joined: " + tableviwe.getSelectionModel().getSelectedItem().getTitle());
    }
}
