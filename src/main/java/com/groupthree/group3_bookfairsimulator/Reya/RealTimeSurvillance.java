package com.groupthree.group3_bookfairsimulator.Reya;

import com.groupthree.group3_bookfairsimulator.HelloApplication;
import com.groupthree.group3_bookfairsimulator.Sami.Eventmanagement;
import com.groupthree.group3_bookfairsimulator.Sami.bookListing;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Camera;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

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
    private Label realTimeSurvillanceLabel;

    @javafx.fxml.FXML
    public void initialize() {
        locationCol.setCellValueFactory(new PropertyValueFactory<>("location"));
        caneraCol.setCellValueFactory(new PropertyValueFactory<>("cameraId"));
        dateCol.setCellValueFactory(new PropertyValueFactory<>("date"));
        accessCCTVcombo.getItems().addAll("Bangla Academy Pavilion Zone","Suhrawardy Udyan Stalls Zone","Little Magazine Corner Zone","Children's Corner","TSC","Doyel Chattar","Food Court");

    }

    @javafx.fxml.FXML
    public void flagButton(ActionEvent actionEvent) {
        String CCTV = accessCCTVcombo.getValue();
        String cameraID = cameraTextField.getText();
        String date = String.valueOf(datePicker.getValue());
        String description = descriptionTextField.getText();


        realTimeSurvilance s = table.getSelectionModel().getSelectedItem();
        if (accessCCTVcombo.getValue() == null){
            realTimeSurvillanceLabel.setText("Set the CCTV access");
            return;

        }
        if (cameraTextField.getText().isEmpty()){
            realTimeSurvillanceLabel.setText("Please provide the camera ID");
            return;
        }
        if (datePicker.getValue() == null){
            realTimeSurvillanceLabel.setText("Please select the date");
            return;
        }
        if (descriptionTextField.getText().isEmpty()){
            realTimeSurvillanceLabel.setText("Please write the description");
            return;
        }
        realTimeSurvilance addTable = new realTimeSurvilance(CCTV,cameraID,date,description);


        table.getItems().add(addTable);

        // Clear input
        accessCCTVcombo.getSelectionModel().clearSelection();
        cameraTextField.clear();
        datePicker.setValue(null);
        descriptionTextField.clear();
        realTimeSurvillanceLabel.setText("Successful!");



    }

    @javafx.fxml.FXML
    public void dashboardButton(ActionEvent actionEvent)throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Reya/securityOfficerDashboard.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setScene(scene);

    }
}