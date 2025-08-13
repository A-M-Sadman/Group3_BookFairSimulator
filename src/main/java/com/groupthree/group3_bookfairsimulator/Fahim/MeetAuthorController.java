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
import java.time.LocalDate;

import static com.groupthree.group3_bookfairsimulator.Fahim.meetAuthorManager.meetauthorList;
import static com.groupthree.group3_bookfairsimulator.Fahim.meetAuthorManager.registerlist;

public class MeetAuthorController {
    @FXML
    private Label registerLable;
    @FXML
    private TableColumn<meetAuthor, LocalDate> dateCol;
    @FXML
    private TableColumn<meetAuthor, String> nameCol;
    @FXML
    private TableView<meetAuthor> tableview;
    @FXML
    private TextField nametext;
    @FXML
    private TableColumn<meetAuthor, String> timeCol;
    @FXML
    private ComboBox<String> comboBox;
    @FXML
    private CheckBox checkBox;

    @FXML
    public void initialize() {

        nameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
        timeCol.setCellValueFactory(new PropertyValueFactory<>("time"));
        dateCol.setCellValueFactory(new PropertyValueFactory<>("date"));

        comboBox.getItems().addAll("10:00 AM", "11:00 AM", "12:00 PM", "2:00 PM", "3:00 PM", "4:00 PM");

        if (meetauthorList.isEmpty()) {
            meetauthorList.add(new meetAuthor("Humayun Ahmed", "10:00 AM", LocalDate.of(2025, 2, 1)));
            meetauthorList.add(new meetAuthor("Selina Hossain", "11:00 AM", LocalDate.of(2025, 2, 2)));
            meetauthorList.add(new meetAuthor("Anisul Hoque", "12:00 PM", LocalDate.of(2025, 2, 3)));
            meetauthorList.add(new meetAuthor("Muhammed Zafar Iqbal", "2:00 PM", LocalDate.of(2025, 2, 4)));
            meetauthorList.add(new meetAuthor("Syed Manzoorul Islam", "3:00 PM", LocalDate.of(2025, 2, 5)));
            meetauthorList.add(new meetAuthor("Taslima Nasrin", "4:00 PM", LocalDate.of(2025, 2, 6)));
        }

        tableview.getItems().addAll(meetauthorList);
        registerLable.setText("For Register, please select a row from the table");
    }

    @FXML
    public void next(ActionEvent actionEvent) throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Fahim/CheckNews.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setScene(scene);
    }

    @FXML
    public void seeMySchdule(ActionEvent actionEvent) {
        tableview.getItems().clear();

        if (checkBox.isSelected()) {
            tableview.getItems().addAll(registerlist);
            registerLable.setText("Showing all registered authors");
        } else {
            for (meetAuthor a : registerlist) {
                if (a.getName().equals(nametext.getText()) && a.getTime().equals(comboBox.getValue())) {
                    tableview.getItems().add(a);
                }
            }
            if (tableview.getItems().isEmpty()) {
                registerLable.setText("No schedule found for the given input");
            } else {
                registerLable.setText("Showing your registered authors");
            }
        }
    }

    @FXML
    public void dashbord(ActionEvent actionEvent) throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Fahim/visitor.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setScene(scene);
    }

    @FXML
    public void back(ActionEvent actionEvent) throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Fahim/MakeMySchedule.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setScene(scene);
    }

    @FXML
    public void register(ActionEvent actionEvent) {
        meetAuthor selected = tableview.getSelectionModel().getSelectedItem();
        if (selected == null) {
            registerLable.setText("Please select a row");
            return;
        }

        registerlist.add(selected);
        meetauthorList.remove(selected);
        registerLable.setText("You have registered for " + selected.getName());

        try {
            meetAuthorManager.saveregisterList();   // Save registered participants
            meetAuthorManager.savemeetAuthorList();  // Save remaining authors
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    public void reset(ActionEvent actionEvent) {
        tableview.getItems().clear();
        tableview.getItems().addAll(meetauthorList);
        registerLable.setText("For Register, please select a row from the table");
    }
}
