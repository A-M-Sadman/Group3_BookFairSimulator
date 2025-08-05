package com.groupthree.group3_bookfairsimulator.Sami;

import com.groupthree.group3_bookfairsimulator.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class PublisherDashboardController
{
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void stallResevationButton(ActionEvent actionEvent)throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Sami/bookListingButton.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setTitle("Book Listing Done");
        HelloApplication.stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void logisticButton(ActionEvent actionEvent) throws IOException{
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Sami/bookListingButton.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setTitle("Book Listing Done");
        HelloApplication.stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void updatePublisherButton(ActionEvent actionEvent) throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Sami/bookListingButton.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setTitle("Book Listing Done");
        HelloApplication.stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void uploadBookButton(ActionEvent actionEvent) throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Sami/bookListingButton.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setTitle("Book Listing Done");
        HelloApplication.stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void visitorInqueryButton(ActionEvent actionEvent) throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Sami/bookListingButton.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setTitle("Book Listing Done");
        HelloApplication.stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void cancelStallBookingButton(ActionEvent actionEvent) throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Sami/bookListingButton.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setTitle("Book Listing Done");
        HelloApplication.stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void trackSaleButton(ActionEvent actionEvent) throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Sami/bookListingButton.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setTitle("Book Listing Done");
        HelloApplication.stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void visitorComplaints(ActionEvent actionEvent) throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Sami/bookListingButton.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setTitle("Book Listing Done");
        HelloApplication.stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void logOutButton(ActionEvent actionEvent) throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Login.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setScene(scene);
    }
}