package com.groupthree.group3_bookfairsimulator.Fahim;

import com.groupthree.group3_bookfairsimulator.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class CancelanEventController
{
    @javafx.fxml.FXML
    private TableView tableviwe;
    @javafx.fxml.FXML
    private TableColumn timecoloum;
    @javafx.fxml.FXML
    private TextField titleTextFild;
    @javafx.fxml.FXML
    private Label lable;
    @javafx.fxml.FXML
    private TableColumn titlecoloum;
    @javafx.fxml.FXML
    private TableColumn location;
    @javafx.fxml.FXML
    private DatePicker datepicker;
    @javafx.fxml.FXML
    private ComboBox combobox;
    @javafx.fxml.FXML
    private TableColumn datecoloum;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void filter(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void resetfilter(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void dashbord(ActionEvent actionEvent) throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Fahim/EventManager.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void back(ActionEvent actionEvent) throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Fahim/CheckVisitorFeedback.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setScene(scene);
    }
}