package com.groupthree.group3_bookfairsimulator.Sami;

import com.groupthree.group3_bookfairsimulator.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class VisitorFeedbackController {

    @FXML
    private TextField visitorIDtextField;
    @FXML
    private TextField boookTitleTextField;
    @FXML
    private TextField writeFeddbackTextField;
    @FXML
    private TextField visitornameTextFileld;
    @FXML
    private ComboBox<String> ratingCombo;
    @FXML
    private Label label;


    //private static List<VisitorFeedback> feedbackList = new ArrayList<>();

    @FXML
    public void initialize() {
        ratingCombo.getItems().addAll("1","2","3","4","5","6","7","8","9","10");
    }

    @FXML
    public void addFeedBackButton(ActionEvent actionEvent) {

        String visitorID = visitorIDtextField.getText();
        String visitorName = visitornameTextFileld.getText();
        String bookTitle = boookTitleTextField.getText();
        String feedback = writeFeddbackTextField.getText();
        String rating = ratingCombo.getSelectionModel().getSelectedItem();
        if (visitorIDtextField.getText().isEmpty()){
            label.setText("Fill up the visitor ID");
            return;
        }
        if(visitornameTextFileld.getText().isEmpty()){
            label.setText("Fill up the name");
            return;
        }
        if (boookTitleTextField.getText().isEmpty()){
            label.setText("Fill up the book title");
            return;
        }
        if (writeFeddbackTextField.getText().isEmpty()){
            label.setText("Fill up the feedback");
            return;
        }
        if(ratingCombo.getSelectionModel().getSelectedItem() == null){
            label.setText("Give the rating");
            return;
        }


        visitorFeedback newFeedback = new visitorFeedback(visitorID, visitorName, bookTitle, feedback, rating);

        label.setText("Feedback added successfully!");

        // Optionally clear fields after adding feedback
        visitorIDtextField.clear();
        visitornameTextFileld.clear();
        boookTitleTextField.clear();
        writeFeddbackTextField.clear();
        ratingCombo.getSelectionModel().clearSelection();
    }


    @FXML
    public void backButton(ActionEvent actionEvent)throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Sami/AuthorDashboard.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setScene(scene);

    }
}
