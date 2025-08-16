package com.groupthree.group3_bookfairsimulator.Reya;

import com.groupthree.group3_bookfairsimulator.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class HelpDeskOfficerDasboardController
{
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void visitorFeedBackButton(ActionEvent actionEvent)throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Reya/visitorFeedBack.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setTitle("Done");
        HelloApplication.stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void provideDirectionButton(ActionEvent actionEvent)throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Reya/provideDirection.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setTitle("Book Listing Done");
        HelloApplication.stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void officerLoginButton(ActionEvent actionEvent)throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Reya/officerLogin.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setTitle("Book Listing Done");
        HelloApplication.stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void dailyReportButton(ActionEvent actionEvent)throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Reya/dailyReport.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setTitle("Book Listing Done");
        HelloApplication.stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void eventScheduleUpdate(ActionEvent actionEvent)throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Reya/event.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setTitle("Book Listing Done");
        HelloApplication.stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void coorDinateButton(ActionEvent actionEvent)throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Reya/coordinate.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setTitle("Book Listing Done");
        HelloApplication.stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void volunteerCoordinateButton(ActionEvent actionEvent)throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Reya/volunteerCoordinate.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setTitle("Book Listing Done");
        HelloApplication.stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void lostandFoundButton(ActionEvent actionEvent)throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Reya/lostandFound.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setTitle("Book Listing Done");
        HelloApplication.stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void logOutButton(ActionEvent actionEvent)throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Login.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setScene(scene);
    }
}