package com.groupthree.group3_bookfairsimulator.Reya;

import com.groupthree.group3_bookfairsimulator.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class VisitorEntry
{
    @javafx.fxml.FXML
    private TableColumn<Visitormodelclass,String> visitorNameCol;
    @javafx.fxml.FXML
    private TableView<Visitormodelclass> visitorEntryTableView;
    @javafx.fxml.FXML
    private TableColumn<Visitormodelclass,String> gateNumberNameCol;
    @javafx.fxml.FXML
    private TextField gateNumberTextField;
    @javafx.fxml.FXML
    private TextField contactNumberTextField;
    @javafx.fxml.FXML
    private TableColumn<Visitormodelclass,String> ticketNameCol;
    @javafx.fxml.FXML
    private ComboBox<String> ticketNumberCombo;
    @javafx.fxml.FXML
    private TableColumn<Visitormodelclass,String> contactNameCol;
    @javafx.fxml.FXML
    private TextField visitorNameTextField;
    @javafx.fxml.FXML
    private Label visitorEntryLabel;

    @javafx.fxml.FXML
    public void initialize() {
        visitorNameCol.setCellValueFactory(new PropertyValueFactory<>("visitorName"));
        ticketNameCol.setCellValueFactory(new PropertyValueFactory<>("ticketNumber"));
        contactNameCol.setCellValueFactory(new PropertyValueFactory<>("contactNumber"));
        gateNumberNameCol.setCellValueFactory(new PropertyValueFactory<>("gateNumber"));
        ticketNumberCombo.getItems().addAll("");
        for (int i = 1; i <= 2000; i++) {
            ticketNumberCombo.getItems().add(String.valueOf(i));
        }



    }

    @javafx.fxml.FXML
    public void visitorEntryButton(ActionEvent actionEvent) {
        String name = visitorNameTextField.getText();
        String ticket = ticketNumberCombo.getValue();
        String date = contactNumberTextField.getText();
        Integer gateNumber = Integer.valueOf(gateNumberTextField.getText());



        Visitormodelclass s = visitorEntryTableView.getSelectionModel().getSelectedItem();
        if (visitorNameTextField.getText().isEmpty()){
            visitorEntryLabel.setText("Fill up the Visitor name");
            return;
        }
        if (ticketNumberCombo.getValue() == null){
            visitorEntryLabel.setText("Ticket number will randomly generate");
            return;
        }
        if (contactNumberTextField.getText().isEmpty()){
            visitorEntryLabel.setText("Please provide the Contact number");
            return;
        }
        if (gateNumberTextField.getText().isEmpty()){
            visitorEntryLabel.setText("Please provide gate Number ");
            return;
        }
        Visitormodelclass addTable = new Visitormodelclass(name,ticket,date,gateNumber);


        visitorEntryTableView.getItems().add(addTable);

        // Clear input
        ticketNumberCombo.getSelectionModel().clearSelection();
        visitorNameTextField.clear();
        contactNumberTextField.getText();
        gateNumberTextField.clear();
        visitorEntryLabel.setText("Successful!");



    }

    @javafx.fxml.FXML
    public void dashBoardButton(ActionEvent actionEvent)throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Reya/securityOfficerDashboard.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setScene(scene);


    }
}