package com.groupthree.group3_bookfairsimulator.Reya;

import com.groupthree.group3_bookfairsimulator.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class VisitorFeddback
{
    @javafx.fxml.FXML
    private TextField commentTextField;
    @javafx.fxml.FXML
    private TextField visitorNameTextField;
    @javafx.fxml.FXML
    private TextField visitorId;
    @javafx.fxml.FXML
    private ComboBox<String> ratingComboBox;

    @javafx.fxml.FXML
    public void initialize() {
        ratingComboBox.getItems().addAll("1","2","3","4","5","6","7","8","9","10");
    }

    @javafx.fxml.FXML
    public void addFeedbackButton(ActionEvent actionEvent) {
        if (visitorNameTextField.getText().isEmpty()){
            return;
        }
        if (visitorId.getText().isEmpty()){
            return;
        }
        if (commentTextField.getText().isEmpty()){
            return;
        }
        if (ratingComboBox.getValue() == null){
            return;
        }
        visitorNameTextField.clear();
        visitorId.clear();
        commentTextField.clear();
        ratingComboBox.getSelectionModel().clearSelection();
    }

    @javafx.fxml.FXML
    public void backFeedBackbutton(ActionEvent actionEvent)throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Reya/HelpDeskOfficerDasboard.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setScene(scene);

    }
}