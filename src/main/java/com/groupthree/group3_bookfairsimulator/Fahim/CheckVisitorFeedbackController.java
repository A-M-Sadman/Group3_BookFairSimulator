package com.groupthree.group3_bookfairsimulator.Fahim;

import com.groupthree.group3_bookfairsimulator.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class CheckVisitorFeedbackController
{
    @javafx.fxml.FXML
    private TableColumn namecoloum;
    @javafx.fxml.FXML
    private TextField nameTextfILD;
    @javafx.fxml.FXML
    private TableView tableviwe;
    @javafx.fxml.FXML
    private TableColumn combocoloum;
    @javafx.fxml.FXML
    private Label lable;
    @javafx.fxml.FXML
    private TableColumn ratingcoloum;
    @javafx.fxml.FXML
    private TableColumn idcoloum;
    @javafx.fxml.FXML
    private TableColumn commentcoloum;
    @javafx.fxml.FXML
    private ComboBox combobox;
    @javafx.fxml.FXML
    private TextField iDtEXTFILD;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void next(ActionEvent actionEvent) throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Fahim/CancelanEvent.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void viweDetailes(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void dashbord(ActionEvent actionEvent) throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Fahim/EventManager.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void back(ActionEvent actionEvent) throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Fahim/TalkwithStallOwners.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void viweAllDetails(ActionEvent actionEvent) {
    }
}