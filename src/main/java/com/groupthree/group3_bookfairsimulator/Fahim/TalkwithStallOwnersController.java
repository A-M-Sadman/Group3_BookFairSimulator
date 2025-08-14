package com.groupthree.group3_bookfairsimulator.Fahim;

import com.groupthree.group3_bookfairsimulator.AbdullahMohammadSadman.BookManager;
import com.groupthree.group3_bookfairsimulator.AbdullahMohammadSadman.CustomerQuery;
import com.groupthree.group3_bookfairsimulator.AbdullahMohammadSadman.CustomerQueryManager;
import com.groupthree.group3_bookfairsimulator.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

import static com.groupthree.group3_bookfairsimulator.AbdullahMohammadSadman.CustomerQueryManager.queryList;

public class TalkwithStallOwnersController {
    @javafx.fxml.FXML
    private TextField nameTextfild;
    @javafx.fxml.FXML
    private Label lable;
    @javafx.fxml.FXML
    private TextField staffnameTextfild1;
    @javafx.fxml.FXML
    private TextArea textarea;
    @javafx.fxml.FXML
    private TextArea sendertextarea;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void next(ActionEvent actionEvent) throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Fahim/CheckVisitorFeedback.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void dashbord(ActionEvent actionEvent) throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Fahim/EventManager.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void back(ActionEvent actionEvent) throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Fahim/SendNewstoVisitors.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setScene(scene);
    }


    @javafx.fxml.FXML
    public void send(ActionEvent actionEvent) {
        if (nameTextfild.getText().isEmpty() || staffnameTextfild1.getText().isEmpty()) {
            lable.setText("Please fill the input 1st!!!");
            return;
        }

        if (textarea.getText().isEmpty()) {
            lable.setText("Empty Message cannot be sent");
            return;
        }

        queryList.add(new CustomerQuery(nameTextfild.getText(), staffnameTextfild1.getText(), textarea.getText()));

        lable.setText("Message Sent Successfully");
        try {
            CustomerQueryManager.saveQueryList();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        nameTextfild.clear();
        staffnameTextfild1.clear();
        textarea.clear();
    }


    @javafx.fxml.FXML
    public void recive(ActionEvent actionEvent) {
        if (nameTextfild.getText().isEmpty() && staffnameTextfild1.getText().isEmpty()) {
            lable.setText("Please fill the input 1st!!!");
            return;
        }

        for (CustomerQuery a : queryList) {
            if (a.getCustomerName().equals(staffnameTextfild1.getText())) {
                textarea.setText(a.getMessage());
                lable.setText("Message Found");
                return;
            }
        }

        lable.setText("No message found for the given name");
        textarea.clear();


        nameTextfild.clear();
        staffnameTextfild1.clear();
    }

    @javafx.fxml.FXML
    public void senderDtails11(ActionEvent actionEvent) {
        sendertextarea.clear();
        lable.setText("");

        if (queryList.isEmpty()) {
            sendertextarea.setText("No messages yet.");
            return;
        }

        for (CustomerQuery q : queryList) {
            sendertextarea.appendText("Customer: " + q.getCustomerName() + " | Stall: " + q.getCustomerId() + "\n");
        }
    }
}