package com.groupthree.group3_bookfairsimulator.Sami;

import com.groupthree.group3_bookfairsimulator.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import javax.swing.text.Document;
import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;

public class StallResevationController {
    @javafx.fxml.FXML
    private ComboBox<String> selectStallCombo;
    @javafx.fxml.FXML
    private TableView<Stallreservation> stallTable;
    @javafx.fxml.FXML
    private ComboBox<String> stallSizeCombo;
    @javafx.fxml.FXML
    private TableColumn<Stallreservation, String> costCol1;
    @javafx.fxml.FXML
    private TableColumn<Stallreservation, String> ContacTCol;
    @javafx.fxml.FXML
    private TextField contactNumberTextField;
    @javafx.fxml.FXML
    private ComboBox<String> costCombo;
    @javafx.fxml.FXML
    private Label stallLabel;
    @javafx.fxml.FXML
    private TableColumn<Stallreservation, String> stallSizeCol;
    @javafx.fxml.FXML
    private TableColumn<Stallreservation, String> selectStallCol;

    @javafx.fxml.FXML
    public void initialize() {
        selectStallCol.setCellValueFactory(new PropertyValueFactory<>("stallNumber"));
        stallSizeCol.setCellValueFactory(new PropertyValueFactory<>("size"));
        ContacTCol.setCellValueFactory(new PropertyValueFactory<>("contactNumber"));
        costCol1.setCellValueFactory(new PropertyValueFactory<>("cost"));
        selectStallCombo.getItems().addAll("");
        for (int i = 1; i <= 150; i++) {
            selectStallCombo.getItems().add(String.valueOf(i));
        }

        stallSizeCombo.getItems().addAll("Small Stall(50 sq.ft)", "Medium Stall(100sq.ft", "Large Stall(140 sq.ft", "Premium pavilion(200 sq.ft");
        costCombo.getItems().addAll("Small Stall (50 sq.ft) - 50000 BDT",
                "Medium Stall (100 sq.ft) - 80000 BDT",
                "Large Stall (140 sq.ft) - 120000 BDT",
                "Premium Pavilion (200 sq.ft) - 200000 BDT");


    }


    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Sami/AuthorDashboard.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setScene(scene);
    }

    @Deprecated
    public void showStallDetailsButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void confirmButton(ActionEvent actionEvent) {
        String stallNumber = selectStallCombo.getValue();
        String contactNumber = contactNumberTextField.getText();
        String size = stallSizeCombo.getValue();
        String cost = costCombo.getValue();
        Stallreservation s = stallTable.getSelectionModel().getSelectedItem();

        if (selectStallCombo.getValue() == null) {
            stallLabel.setText("Please select the stall number");
            return;
        }
        if (stallSizeCombo.getValue() == null) {
            stallLabel.setText("Please select the stall size");
            return;
        }
        if (contactNumberTextField.getText().isEmpty()) {
            stallLabel.setText("Please provide your contact number");
            return;
        }
        if (costCombo.getValue().isEmpty()) {
            stallLabel.setText("Please provide cost");
            return;
        }

        Stallreservation stall = new Stallreservation(stallNumber, contactNumber, size, cost);


        stallTable.getItems().add(stall);


        selectStallCombo.getSelectionModel().clearSelection();
        stallSizeCombo.getSelectionModel().clearSelection();
        contactNumberTextField.getText();
        costCombo.getSelectionModel().clearSelection();
        stallLabel.setText(" successful!");
    }

    @javafx.fxml.FXML
    public void pdfButton(ActionEvent actionEvent) {
    }
}