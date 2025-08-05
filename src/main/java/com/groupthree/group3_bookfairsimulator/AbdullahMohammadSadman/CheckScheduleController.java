package com.groupthree.group3_bookfairsimulator.AbdullahMohammadSadman;

import com.groupthree.group3_bookfairsimulator.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.time.LocalDate;

import static com.groupthree.group3_bookfairsimulator.AbdullahMohammadSadman.Task.taskList;

public class CheckScheduleController
{
    @javafx.fxml.FXML
    private ComboBox<String> zoneInput;
    @javafx.fxml.FXML
    private TableColumn<Task, String> taskCol;
    @javafx.fxml.FXML
    private TableColumn<Task, LocalDate> dateCol;
    @javafx.fxml.FXML
    private Label notifyStaffLabel;
    @javafx.fxml.FXML
    private TableView<Task> taskTableView;
    @javafx.fxml.FXML
    private ComboBox<String> staffNameInput;
    @javafx.fxml.FXML
    private TableColumn<Task, String> zoneCol;
    @javafx.fxml.FXML
    private TableColumn<Task, String> staffNameCol;
    @javafx.fxml.FXML
    private DatePicker dateInput;
    @javafx.fxml.FXML
    private Label assignDutyLabel;
    @javafx.fxml.FXML
    private TableColumn<Task, String> typeCol;
    @javafx.fxml.FXML
    private TableColumn<Task, String> statusCol;
    @javafx.fxml.FXML
    private ComboBox<String> typeInput;
    @javafx.fxml.FXML
    private CheckBox statusInput;
    @javafx.fxml.FXML
    private TextArea taskInput;

    @javafx.fxml.FXML
    public void initialize() {
        staffNameCol.setCellValueFactory(new PropertyValueFactory<>("taskName"));
        taskCol.setCellValueFactory(new PropertyValueFactory<>("description"));
        zoneCol.setCellValueFactory(new PropertyValueFactory<>("zone"));
        statusCol.setCellValueFactory(new PropertyValueFactory<>("status"));
        typeCol.setCellValueFactory(new PropertyValueFactory<>("type"));
        dateCol.setCellValueFactory(new PropertyValueFactory<>("date"));

        staffNameInput.getItems().addAll("Mokhles", "Joshim", "Masud", "Rasel");
        typeInput.getItems().addAll("Cleaning", "Repair", "Inspection", "Upgrade");
        zoneInput.getItems().addAll("Zone 1", "Zone 2", "Zone 3", "Zone 4");

        taskTableView.getItems().addAll(taskList);
    }

    @javafx.fxml.FXML
    public void back(ActionEvent actionEvent) throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("AbdullahMohammadSadman/MaintenanceOfficerDashboard.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void assignDuty(ActionEvent actionEvent) {
        if ((staffNameInput.getValue() == null) || (taskInput.getText().isEmpty()) || (zoneInput.getValue() == null) || (typeInput.getValue() == null) || (dateInput.getValue() == null)){
            assignDutyLabel.setText("Please fillup all fields!");
            return;
        }
        for (Task t:taskList) {
            if ((t.getDate() == dateInput.getValue()) && (t.getZone().equals(zoneInput.getValue()))){
                assignDutyLabel.setText("Zone and time clashes!");
                return;
            }
        }

        String st = "Pending";
        if (statusInput.isSelected()){
            st = "Complete";
        }
        Task task = new Task(
                staffNameInput.getValue(),
                taskInput.getText(),
                zoneInput.getValue(),
                st,
                typeInput.getValue(),
                dateInput.getValue()
        );
        taskList.add(task);
        taskTableView.getItems().clear();
        taskTableView.getItems().addAll(taskList);
        assignDutyLabel.setText("Assigned duty succssfully");
    }

    @javafx.fxml.FXML
    public void notifyStaff(ActionEvent actionEvent) {
        if (taskList.isEmpty()){
            notifyStaffLabel.setText("Assign a task to nofity!");
            return;
        }
        Task t = taskTableView.getSelectionModel().getSelectedItem();
        if (t == null) {
            notifyStaffLabel.setText("Select a staff to notify from the table!");
            return;
        }
        notifyStaffLabel.setText("Notified staff: " + staffNameInput.getValue());
    }
}