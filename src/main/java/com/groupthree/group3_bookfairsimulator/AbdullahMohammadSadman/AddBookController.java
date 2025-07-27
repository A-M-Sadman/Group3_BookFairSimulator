package com.groupthree.group3_bookfairsimulator.AbdullahMohammadSadman;

import com.groupthree.group3_bookfairsimulator.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.util.ArrayList;

public class AddBookController
{
    @javafx.fxml.FXML
    private TextField priceInput;
    @javafx.fxml.FXML
    private TextField titleInput;
    @javafx.fxml.FXML
    private ComboBox genreInput;
    @javafx.fxml.FXML
    private TextField authorInput;
    @javafx.fxml.FXML
    private Label addBookLabel;
    @javafx.fxml.FXML
    private TextField quantityInput;

    @javafx.fxml.FXML
    public void initialize() {
        genreInput.getItems().addAll("Action", "Romance", "Thriller", "Horror");
    }

    ArrayList<Book> bookList = new ArrayList<>();

    @javafx.fxml.FXML
    public void back(ActionEvent actionEvent) throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("AbdullahMohammadSadman/StallOwnerDashboard.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void addBook(ActionEvent actionEvent) {
        if ((titleInput.getText().isEmpty()) || (authorInput.getText().isEmpty()) || (priceInput.getText().isEmpty()) || (quantityInput.getText().isEmpty()) || (genreInput.getValue() == null)){
            addBookLabel.setText("Please fill-up all the input fields!");
            return;
        }
        Book book = new Book(
                titleInput.getText(),
                authorInput.getText(),
                Double.parseDouble(priceInput.getText()),
                Integer.parseInt(quantityInput.getText()),
                genreInput.getValue().toString()
        );

        bookList.add(book);

        addBookLabel.setText("Book successfully added to the inventory!");
    }
}