package com.groupthree.group3_bookfairsimulator.Fahim;

import com.groupthree.group3_bookfairsimulator.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class VisitorController
{
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void meetAuthor(ActionEvent actionEvent) throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Fahim/MeetAuthor.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void seeBookList(ActionEvent actionEvent) throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Fahim/SeeBookList.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void checkNews(ActionEvent actionEvent) throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Fahim/CheckNews.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void giveFeedback(ActionEvent actionEvent) throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Fahim/GiveFeedback.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void buyBook(ActionEvent actionEvent) throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Fahim/BuyBook.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void makeMySchedule(ActionEvent actionEvent) throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Fahim/MakeMySchedule.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void findStall(ActionEvent actionEvent) throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Fahim/FindStall.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void joinEvent(ActionEvent actionEvent) throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Fahim/JoinEvent.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setScene(scene);
    }
}