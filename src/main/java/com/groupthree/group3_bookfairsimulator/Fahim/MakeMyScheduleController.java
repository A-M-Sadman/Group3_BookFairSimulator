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
import static com.groupthree.group3_bookfairsimulator.Fahim.EventManager.joinList;

public class MakeMyScheduleController {
    @javafx.fxml.FXML
    private Label lable;
    @javafx.fxml.FXML
    private TableColumn<Event, String> locationcol;
    @javafx.fxml.FXML
    private TableColumn<Event, String> titlecol;
    @javafx.fxml.FXML
    private TableColumn<Event, LocalDate> datecol;
    @javafx.fxml.FXML
    private TextField titleText;
    @javafx.fxml.FXML
    private DatePicker localdate;
    @javafx.fxml.FXML
    private TableView<Event> tableview;
    @javafx.fxml.FXML
    private TableColumn<Event, String> timecol;

    @javafx.fxml.FXML
    public void initialize() {
        titlecol.setCellValueFactory(new PropertyValueFactory<>("title"));
        datecol.setCellValueFactory(new PropertyValueFactory<>("date"));
        timecol.setCellValueFactory(new PropertyValueFactory<>("time"));
        locationcol.setCellValueFactory(new PropertyValueFactory<>("location"));

        tableview.getItems().addAll(joinList);

        lable.setText("Click 'Add My Schedule' to view all events.\nThen select an event and click again to add it.\nClick again on another event to update.");
    }


    private int clickCount = 0;

    @javafx.fxml.FXML
    public void addmySchdule(ActionEvent actionEvent) {
        clickCount++;

        if (clickCount == 1) {
            tableview.getItems().clear();
            tableview.getItems().addAll(eventList);
            lable.setText("Select an event from the list and click again to add it.");
            return;
        }

        Event s = tableview.getSelectionModel().getSelectedItem();

        if (s != null) {
            for (Event e : joinList) {
                if (e.getTitle().equals(s.getTitle()) && e.getDate().equals(s.getDate()) && e.getTime().equals(s.getTime())) {
                    lable.setText("This event is already in your schedule.");
                    tableview.getItems().clear();
                    tableview.getItems().addAll(joinList);
                    clickCount = 0;
                    return;
                }
            }

            joinList.add(s);
            eventList.remove(s);
            lable.setText("New Event added to your schedule.");
            tableview.getItems().clear();
            tableview.getItems().addAll(joinList);
        } else {
            lable.setText("Please select an event to add.");
        }

        clickCount = 0;
    }



    @javafx.fxml.FXML
    public void viweSchedule(ActionEvent actionEvent) {
        tableview.getItems().clear();
        tableview.getItems().addAll(joinList);
    }

    @javafx.fxml.FXML
    public void filter(ActionEvent actionEvent) {
        tableview.getItems().clear();
        for (Event b : joinList){
            if (b.getTitle().equals(titleText.getText()) || (b.getDate().equals(localdate.getValue()))){
                tableview.getItems().add(b);
            }
        }
    }

    @javafx.fxml.FXML
    public void next(ActionEvent actionEvent) throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Fahim/MeetAuthor.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void dashbord(ActionEvent actionEvent) throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Fahim/visitor.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void back(ActionEvent actionEvent) throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Fahim/GiveFeedback.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setScene(scene);
    }
}
