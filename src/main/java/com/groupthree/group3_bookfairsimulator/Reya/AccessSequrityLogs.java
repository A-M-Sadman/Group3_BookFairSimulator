package com.groupthree.group3_bookfairsimulator.Reya;

import com.groupthree.group3_bookfairsimulator.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class AccessSequrityLogs
{
    @javafx.fxml.FXML
    private DatePicker date;
    @javafx.fxml.FXML
    private TextField logIdTextField;
    @javafx.fxml.FXML
    private TextField nameTextField;
    @javafx.fxml.FXML
    private TextField locationTextField;
    @javafx.fxml.FXML
    private TableView<AccessSequrityLogsModelClass> accessTableview;
    @javafx.fxml.FXML
    private TableColumn<AccessSequrityLogsModelClass,String> locationCol;
    @javafx.fxml.FXML
    private TableColumn<AccessSequrityLogsModelClass,String> datecol;
    @javafx.fxml.FXML
    private TableColumn<AccessSequrityLogsModelClass,String> nameCol;
    @javafx.fxml.FXML
    private TableColumn<AccessSequrityLogsModelClass,String> logIdCol;
    @javafx.fxml.FXML
    private Label accessSequrityLogsLabel;

    @javafx.fxml.FXML
    public void initialize() {
        nameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
        logIdCol.setCellValueFactory(new PropertyValueFactory<>("logId"));
        locationCol.setCellValueFactory(new PropertyValueFactory<>("location"));
        datecol.setCellValueFactory(new PropertyValueFactory<>("date"));



    }

    @javafx.fxml.FXML
    public void addLogButton(ActionEvent actionEvent) {
        String name = nameTextField.getText();
        String logId = logIdTextField.getText();
        String date1 = String.valueOf(date.getValue());
        String location = locationTextField.getText();



        AccessSequrityLogsModelClass s = accessTableview.getSelectionModel().getSelectedItem();

        if (nameTextField.getText().isEmpty()) {
            accessSequrityLogsLabel.setText("Pleaea provide your name");
            return;

        }
        if (logIdTextField.getText().isEmpty()) {
            accessSequrityLogsLabel.setText("Please provide your Id");
            return;
        }
        if (locationTextField.getText().isEmpty()){
            accessSequrityLogsLabel.setText("Provide location");
            return;
        }
        if (date.getValue() == null){
            accessSequrityLogsLabel.setText("Provide date");
            return;
        }

        AccessSequrityLogsModelClass addTable = new AccessSequrityLogsModelClass(name,logId,location,date1);


        accessTableview.getItems().add(addTable);

        // Clear input
        logIdTextField.clear();
        nameTextField.clear();
        date.setValue(null);
        locationTextField.clear();
        accessSequrityLogsLabel.setText("Successful!");
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent)throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Reya/securityOfficerDashboard.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setScene(scene);
    }
}