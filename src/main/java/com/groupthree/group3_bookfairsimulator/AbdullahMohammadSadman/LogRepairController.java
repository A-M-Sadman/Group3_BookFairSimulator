package com.groupthree.group3_bookfairsimulator.AbdullahMohammadSadman;

import com.groupthree.group3_bookfairsimulator.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class LogRepairController
{
    @javafx.fxml.FXML
    private Label submitLabel;
    @javafx.fxml.FXML
    private TextArea reportInput;
    @javafx.fxml.FXML
    private ComboBox<String> locationInput;
    @javafx.fxml.FXML
    private ComboBox<String> urgencyLevelInput;
    @javafx.fxml.FXML
    private TextField nameInput;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void submit(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void back(ActionEvent actionEvent) throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("AbdullahMohammadSadman/MaintenanceOfficerDashboard.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setScene(scene);
    }
}