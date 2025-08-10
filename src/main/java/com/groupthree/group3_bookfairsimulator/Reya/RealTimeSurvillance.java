package com.groupthree.group3_bookfairsimulator.Reya;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class RealTimeSurvillance
{
    @javafx.fxml.FXML
    private TableColumn<RealTimeSurvillance,String> locationCol;
    @javafx.fxml.FXML
    private TableColumn<realTimeSurvilance,String> dateCol;
    @javafx.fxml.FXML
    private ComboBox<String> accessCCTVcombo;
    @javafx.fxml.FXML
    private DatePicker datePicker;
    @javafx.fxml.FXML
    private TextField cameraTextField;
    @javafx.fxml.FXML
    private TextField descriptionTextField;
    @javafx.fxml.FXML
    private TableView<realTimeSurvilance> table;
    @javafx.fxml.FXML
    private TableColumn<realTimeSurvilance,String> caneraCol;

    @javafx.fxml.FXML
    public void initialize() {
        locationCol.setCellValueFactory(new PropertyValueFactory<>("location"));
        caneraCol.setCellValueFactory(new PropertyValueFactory<>("cameraId"));
        dateCol.setCellValueFactory(new PropertyValueFactory<>("date"));
        accessCCTVcombo.getItems().addAll("Bangla Academy Pavilion Zone","Suhrawardy Udyan Stalls Zone","Little Magazine Corner Zone","Children's Corner","TSC","Doyel Chattar","Food Court");

    }

    @javafx.fxml.FXML
    public void flagButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void dashboardButton(ActionEvent actionEvent) {
    }
}