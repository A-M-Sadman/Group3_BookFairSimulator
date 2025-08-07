package com.groupthree.group3_bookfairsimulator.Fahim;

import com.groupthree.group3_bookfairsimulator.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

import static com.groupthree.group3_bookfairsimulator.Fahim.feedBack.feedbackList;

public class CheckVisitorFeedbackController
{
    @javafx.fxml.FXML
    private TableColumn<feedBack, String> namecoloum;
    @javafx.fxml.FXML
    private TextField nameTextfILD;
    @javafx.fxml.FXML
    private TableView<feedBack> tableviwe;
    @javafx.fxml.FXML
    private TableColumn<feedBack, String> combocoloum;
    @javafx.fxml.FXML
    private Label lable;
    @javafx.fxml.FXML
    private ComboBox<String> combobox;
    @javafx.fxml.FXML
    private TableColumn<feedBack,String> stallnamecol;
    @javafx.fxml.FXML
    private TableColumn<feedBack,String> ratingCol;
    @javafx.fxml.FXML
    private TableColumn<feedBack,String> booknamecol;

    @javafx.fxml.FXML
    public void initialize() {
        combobox.getItems().addAll("Stall Experience","Author Session","Event Management","Book Collection","Security","Volunteers’ Help","Overall Experience","Other");
        namecoloum.setCellValueFactory(new PropertyValueFactory<>("visitorName"));
        booknamecol.setCellValueFactory(new PropertyValueFactory<>("bookName"));
        stallnamecol.setCellValueFactory(new PropertyValueFactory<>("stallName"));
        combocoloum.setCellValueFactory(new PropertyValueFactory<>("type"));
        ratingCol.setCellValueFactory(new PropertyValueFactory<>("rating"));

        tableviwe.getItems().addAll(feedbackList);
    }

    @javafx.fxml.FXML
    public void next(ActionEvent actionEvent) throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Fahim/CancelanEvent.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setScene(scene);
    }

    @FXML
    public void viweDetailes(ActionEvent actionEvent) {
        if (nameTextfILD.getText().isEmpty() && (combobox.getValue() == null)){
            lable.setText("Please Fill all the input");
            return;
        }
        tableviwe.getItems().clear();
        for (feedBack a : feedbackList){
            if (a.getVisitorName().equals(nameTextfILD.getText()) || (a.getType().equals(combobox.getValue()))){
                tableviwe.getItems().add(a);
            }
        }
        lable.setText("");
    }

    @javafx.fxml.FXML
    public void dashbord(ActionEvent actionEvent) throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Fahim/EventManager.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void back(ActionEvent actionEvent) throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Fahim/TalkwithStallOwners.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void viweAllDetails(ActionEvent actionEvent) {
        tableviwe.getItems().clear();
        tableviwe.getItems().addAll(feedbackList);
    }
}