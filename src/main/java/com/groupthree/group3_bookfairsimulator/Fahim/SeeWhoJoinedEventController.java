package com.groupthree.group3_bookfairsimulator.Fahim;

import com.groupthree.group3_bookfairsimulator.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class SeeWhoJoinedEventController
{
    @javafx.fxml.FXML
    private TableColumn eventdatecoloum;
    @javafx.fxml.FXML
    private TableColumn pNamecoloum;
    @javafx.fxml.FXML
    private TextField nametextfild;
    @javafx.fxml.FXML
    private TableColumn eventnameColoum;
    @javafx.fxml.FXML
    private TableView tableviwe;
    @javafx.fxml.FXML
    private TextField eventtextfild;
    @javafx.fxml.FXML
    private TableColumn eventLocationcoloum;
    @javafx.fxml.FXML
    private Label lable;
    @javafx.fxml.FXML
    private TableColumn eventTimecoloum;
    @javafx.fxml.FXML
    private DatePicker datepicker;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void next(ActionEvent actionEvent) throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Fahim/SendNewstoVisitors.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void viweforspecific(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void dashbord(ActionEvent actionEvent) throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Fahim/EventManager.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void back(ActionEvent actionEvent) throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Fahim/ChangeEventTime.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setScene(scene);
    }
}