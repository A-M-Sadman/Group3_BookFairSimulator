package com.groupthree.group3_bookfairsimulator.Sami;

import com.groupthree.group3_bookfairsimulator.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class offer
{
    @javafx.fxml.FXML
    private TextField applicableDiscountTextfield;
    @javafx.fxml.FXML
    private TextField offerTextField;
    @javafx.fxml.FXML
    private Label offerandDiscountlabel;
    @javafx.fxml.FXML
    private TextField bookNameTextField;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void dashBoardButton(ActionEvent actionEvent)throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Sami/PublisherDashboard.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setScene(scene);

    }

    @javafx.fxml.FXML
    public void confirmButton(ActionEvent actionEvent) {
        if (bookNameTextField.getText().isEmpty()){
            offerandDiscountlabel.setText("Provide book name");
            return;
        }
        if (applicableDiscountTextfield.getText().isEmpty()){
            offerandDiscountlabel.setText("Please provide discount");
            return;


        }
        if (offerTextField.getText().isEmpty()){
            offerandDiscountlabel.setText("Provide offer Information");
            return;
        }

        bookNameTextField.clear();
        applicableDiscountTextfield.clear();
        offerTextField.clear();
        offerandDiscountlabel.setText("Successful");
    }
}