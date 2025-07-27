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
    public void meetAuthor(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void seeBookList(ActionEvent actionEvent) throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("SeeBookList.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void checkNews(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void giveFeedback(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void buyBook(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void makeMySchedule(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void findStall(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void joinEvent(ActionEvent actionEvent) {
    }
}