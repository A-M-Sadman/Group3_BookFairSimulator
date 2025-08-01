package com.groupthree.group3_bookfairsimulator.AbdullahMohammadSadman;

import com.groupthree.group3_bookfairsimulator.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

import static com.groupthree.group3_bookfairsimulator.AbdullahMohammadSadman.Facility.facilityList;

public class UpdateFacilityStatusController
{
    @javafx.fxml.FXML
    private TableColumn<Facility, String> facilityCol;
    @javafx.fxml.FXML
    private ComboBox<String> statusInput;
    @javafx.fxml.FXML
    private ComboBox<String> facilityInput;
    @javafx.fxml.FXML
    private TableColumn<Facility, String> statusCol;
    @javafx.fxml.FXML
    private TableView<Facility> facilityTableView;

    @javafx.fxml.FXML
    public void initialize() {
        facilityCol.setCellValueFactory(new PropertyValueFactory<>("facility"));
        statusCol.setCellValueFactory(new PropertyValueFactory<>("status"));

        statusInput.getItems().addAll("Operational", "Closed");
        facilityInput.getItems().addAll("Restroom", "Medical Room", "Entrance");
    }

    @javafx.fxml.FXML
    public void back(ActionEvent actionEvent) throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("AbdullahMohammadSadman/MaintenanceOfficerDashboard.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void update(ActionEvent actionEvent) {
        Facility facility = new Facility(facilityInput.getValue(), statusInput.getValue());
        facilityList.add(facility);
        facilityTableView.getItems().addAll(facilityList);
    }
}