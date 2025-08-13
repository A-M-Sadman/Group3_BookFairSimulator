package com.groupthree.group3_bookfairsimulator.Fahim;

import com.groupthree.group3_bookfairsimulator.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

import static com.groupthree.group3_bookfairsimulator.Fahim.feedbackManager.feedbackList;

public class GiveFeedbackController
{
    @javafx.fxml.FXML
    private Label lable;
    @javafx.fxml.FXML
    private TextField visitorName;
    @javafx.fxml.FXML
    private ComboBox<String> ratingcomboBox;
    @javafx.fxml.FXML
    private TextField stallname;
    @javafx.fxml.FXML
    private TextField bookname;
    @javafx.fxml.FXML
    private ComboBox<String> comboBox;

    @javafx.fxml.FXML
    public void initialize() {
        comboBox.getItems().addAll("Stall Experience","Author Session","Event Management","Book Collection","Security","Volunteers’ Help","Overall Experience","Other");
        ratingcomboBox.getItems().addAll("★☆☆☆☆ - Very Poor","★★☆☆☆ - Poor","★★★☆☆ - Average","★★★★☆ - Good","★★★★★ - Excellent");
    }

    @javafx.fxml.FXML
    public void next(ActionEvent actionEvent) throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Fahim/MakeMySchedule.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void dashbord(ActionEvent actionEvent) throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Fahim/visitor.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void back(ActionEvent actionEvent) throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Fahim/FindStall.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void submit(ActionEvent actionEvent) {
        if (visitorName.getText().isEmpty() || comboBox.getValue() == null || ratingcomboBox.getValue() == null) {
            lable.setText("Please fill in all required fields.");
            return;
        }

        if (comboBox.getValue().equals("Stall Experience") && stallname.getText().isEmpty()) {
            lable.setText("Please enter Stall Name for Stall Experience feedback.");
            return;
        }

        if (comboBox.getValue().equals("Book Collection") && bookname.getText().isEmpty()) {
            lable.setText("Please enter Book Name for Book Collection feedback.");
            return;
        }

        String stall = "";
        String book = "";

        if (comboBox.getValue().equals("Stall Experience")) {
            stall = stallname.getText();
        }

        if (comboBox.getValue().equals("Book Collection")) {
            book = bookname.getText();
        }
        for (feedBack f : feedbackList) {
            if (f.getVisitorName().equals(visitorName.getText()) && f.getType().equals(comboBox.getValue())) {
                lable.setText("You have already submitted this feedback.");
                return;
            }
        }

        feedbackList.add(new feedBack(visitorName.getText(),book,stall,comboBox.getValue(),ratingcomboBox.getValue()));

        lable.setText("Thank you " + visitorName.getText() + ". Your feedback on " + comboBox.getValue() + " has been submitted.");
    }



}