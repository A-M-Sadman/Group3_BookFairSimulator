package com.groupthree.group3_bookfairsimulator.Fahim;

import com.groupthree.group3_bookfairsimulator.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class JoinEventController
{
    @javafx.fxml.FXML
    private Label lable;
    @javafx.fxml.FXML
    private TableColumn tableTime;
    @javafx.fxml.FXML
    private TableColumn tableEvantName;
    @javafx.fxml.FXML
    private TableColumn tableLocation;
    @javafx.fxml.FXML
    private TextField eventTimeTextfild;
    @javafx.fxml.FXML
    private TableView tableviwe;
    @javafx.fxml.FXML
    private TextField eventNameTextfild;
    @javafx.fxml.FXML
    private DatePicker datepicker;
    @javafx.fxml.FXML
    private TableColumn tableDate;
    @javafx.fxml.FXML
    private TextField eventLocationTextfild;

    @javafx.fxml.FXML
    public void initialize() {

    }

    @Deprecated
    public void myEvent(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void join(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void dashbord(ActionEvent actionEvent) throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Fahim/visitor.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void back(ActionEvent actionEvent) throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Fahim/BuyBook.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void next(ActionEvent actionEvent) throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Fahim/FindStall.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setScene(scene);
    }
}