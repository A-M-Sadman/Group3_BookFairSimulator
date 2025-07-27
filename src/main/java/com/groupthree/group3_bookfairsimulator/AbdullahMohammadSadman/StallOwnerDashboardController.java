package com.groupthree.group3_bookfairsimulator.AbdullahMohammadSadman;

import com.groupthree.group3_bookfairsimulator.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class StallOwnerDashboardController
{
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void customerQueries(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void recordPurchase(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void viewCatalog(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void addBook(ActionEvent actionEvent) throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("AbdullahMohammadSadman/AddBook.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void checkStock(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void applyDiscount(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void viewSales(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void updatePrice(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void logout(ActionEvent actionEvent) throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Login.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setScene(scene);
    }
}