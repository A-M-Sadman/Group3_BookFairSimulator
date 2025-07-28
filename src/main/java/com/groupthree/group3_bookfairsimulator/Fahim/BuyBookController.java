package com.groupthree.group3_bookfairsimulator.Fahim;

import com.groupthree.group3_bookfairsimulator.HelloApplication;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class BuyBookController
{
    @javafx.fxml.FXML
    private Label cartlable;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void checkOut(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void cart(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void checkoutlable(Event event) {
    }

    @javafx.fxml.FXML
    public void dashbord(ActionEvent actionEvent) throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Fahim/visitor.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void back(ActionEvent actionEvent) throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Fahim/SeeBookList.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setScene(scene);
    }
}