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
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Sami/stallResevationButton.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setTitle("Stall Reservation  Done");
        HelloApplication.stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void logisticButton(ActionEvent actionEvent) throws IOException{
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Sami/logisticButton.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setTitle("Done");
        HelloApplication.stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void updatePublisherButton(ActionEvent actionEvent) throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Sami/updatePublisherButton.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setTitle("Publisher Update Done");
        HelloApplication.stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void uploadBookButton(ActionEvent actionEvent) throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Sami/uploadBookButton.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setTitle("Book Upload Done");
        HelloApplication.stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void visitorInqueryButton(ActionEvent actionEvent) throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Sami/visitorInqueryButton.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setTitle("FAQ");
        HelloApplication.stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void cancelStallBookingButton(ActionEvent actionEvent) throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Sami/cancelStallBookingButton.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setTitle("Done");
        HelloApplication.stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void trackSaleButton(ActionEvent actionEvent) throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Sami/trackSaleButton.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setTitle("Done");
        HelloApplication.stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void visitorComplaints(ActionEvent actionEvent) throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Sami/visitorComplaints.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setTitle("FAQ");
        HelloApplication.stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void logOutButton(ActionEvent actionEvent) throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Login.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setScene(scene);
    }
}