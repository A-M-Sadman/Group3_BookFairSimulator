package com.groupthree.group3_bookfairsimulator.Sami;

import com.groupthree.group3_bookfairsimulator.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class BookSigningEventController
{
    @javafx.fxml.FXML
    private DatePicker datePickerS;
    @javafx.fxml.FXML
    private TextField eventTimeTextField;
    @javafx.fxml.FXML
    private TextField durationTextField;
    @javafx.fxml.FXML
    private ComboBox<String> stallNumberCombo;
    @javafx.fxml.FXML
    private TextField bookTitleTextField;
    @javafx.fxml.FXML
    private Label bookSigningEventName;

    @javafx.fxml.FXML
    public void initialize() {
        stallNumberCombo.getItems().addAll("");
        for (int i = 1; i <= 100; i++) {
            stallNumberCombo.getItems().add(String.valueOf(i));
        }




    }

    @javafx.fxml.FXML
    public void confirmButton(ActionEvent actionEvent) {
        String title = eventTimeTextField.getText();
        String bookID = stallNumberCombo.getValue();
        String genre = datePickerS.getValue().toString();
        String bookTitle = bookTitleTextField.getText();
        String duration = durationTextField.getText();

        if (eventTimeTextField.getText().isEmpty()){
            bookSigningEventName.setText("Please provide the time");
            return;
        }
        if(stallNumberCombo.getValue() == null){
            bookSigningEventName.setText("Please provide the stall number");
            return;
        }
        if(datePickerS.getValue() == null){
            bookSigningEventName.setText("Provide the date");
            return;
        }
        //bookListing newBook = new bookListing(title, bookID, genre);




        eventTimeTextField.clear();
        durationTextField.clear();
        datePickerS.setValue(null);
        bookTitleTextField.clear();
        durationTextField.clear();




    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent)throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Sami/AuthorDashboard.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setScene(scene);
    }
}