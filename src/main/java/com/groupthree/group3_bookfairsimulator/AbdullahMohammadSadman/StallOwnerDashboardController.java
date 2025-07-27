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
    public void customerQueries(ActionEvent actionEvent) throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("AbdullahMohammadSadman/CustomerQueries.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setTitle("FAQs");
        HelloApplication.stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void recordPurchase(ActionEvent actionEvent) throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("AbdullahMohammadSadman/RecordPurchase.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setTitle("Purchase Record");
        HelloApplication.stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void viewCatalog(ActionEvent actionEvent) throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("AbdullahMohammadSadman/ViewCatalog.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setTitle("Catalogue");
        HelloApplication.stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void addBook(ActionEvent actionEvent) throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("AbdullahMohammadSadman/AddBook.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void checkStock(ActionEvent actionEvent) throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("AbdullahMohammadSadman/CheckStock.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setTitle("Check Stock Quantity");
        HelloApplication.stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void applyDiscount(ActionEvent actionEvent) throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("AbdullahMohammadSadman/ApplyDiscount.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setTitle("Apply Discount");
        HelloApplication.stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void viewSales(ActionEvent actionEvent) throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("AbdullahMohammadSadman/ViewSales.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setTitle("View Sales");
        HelloApplication.stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void updatePrice(ActionEvent actionEvent) throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("AbdullahMohammadSadman/UpdatePrice.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setTitle("Update Price");
        HelloApplication.stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void logout(ActionEvent actionEvent) throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Login.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setScene(scene);
    }
}