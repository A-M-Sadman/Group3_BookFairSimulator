package com.groupthree.group3_bookfairsimulator.Reya;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;

public class ActiveAlems
{
    @javafx.fxml.FXML
    private TableColumn locationCol;
    @javafx.fxml.FXML
    private TableColumn dateCol;
    @javafx.fxml.FXML
    private TableColumn incidentTypeCol;
    @javafx.fxml.FXML
    private TableColumn alarmId;
    @javafx.fxml.FXML
    private ComboBox incidentTypeXombo;
    @javafx.fxml.FXML
    private TextField alarmIdtetField;
    @javafx.fxml.FXML
    private TextField locationTextfield;
    @javafx.fxml.FXML
    private DatePicker datePICKER;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void startAlerm(ActionEvent actionEvent) {
    }
}