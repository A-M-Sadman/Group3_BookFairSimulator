package com.groupthree.group3_bookfairsimulator.Sami;

import com.groupthree.group3_bookfairsimulator.HelloApplication;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class AuthorDashboardController
{
    @javafx.fxml.FXML
    public void initialize() {
    }

    @Deprecated
    public void boo(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void bookListingButton(Event event) throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Sami/bookListing.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setTitle("Book Listing Done");
        HelloApplication.stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void eventManagementButton(ActionEvent actionEvent) throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Sami/eventManagement.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setTitle("Event Management Maintainance Done");
        HelloApplication.stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void promotionalSupportButton(ActionEvent actionEvent) throws IOException{
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Sami/promotionalSupportButton.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setTitle("Promotion Done");
        HelloApplication.stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void visitorFeedbackButton(ActionEvent actionEvent) throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Sami/visitorFeedback.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setTitle("Done");
        HelloApplication.stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void updateProfileButton(ActionEvent actionEvent) throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Sami/updateProfile.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setTitle("Profile Update Done");
        HelloApplication.stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void salesDashboardButton(ActionEvent actionEvent) throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Sami/salesDashboard.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setTitle("Sales DashBoard");
        HelloApplication.stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void cancelStallBookingButton(ActionEvent actionEvent) throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Sami/cancelStallBooking.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setTitle("Stalll Booking Cancelation Done");
        HelloApplication.stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void bookSigningEventButton(ActionEvent actionEvent) throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Sami/bookSigningEvent.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setTitle("Book Signing event done");
        HelloApplication.stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void logOutButton(ActionEvent actionEvent) throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Login.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setScene(scene);
    }
}