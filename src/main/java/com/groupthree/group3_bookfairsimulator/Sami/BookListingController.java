package com.groupthree.group3_bookfairsimulator.Sami;

import com.groupthree.group3_bookfairsimulator.AbdullahMohammadSadman.Book;
import com.groupthree.group3_bookfairsimulator.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class BookListingController
{
    @javafx.fxml.FXML
    private TextField titleTextField;
    @javafx.fxml.FXML
    private TableColumn<bookListing,String> titleCol;
    @javafx.fxml.FXML
    private TableView<bookListing> bookListingTableView;
    @javafx.fxml.FXML
    private ComboBox<String> genreCombo;
    @javafx.fxml.FXML
    private TextField bookIdTextField;
    @javafx.fxml.FXML
    private TableColumn<Book,String> genreeCol;
    @javafx.fxml.FXML
    private Label messageLabel;
    @javafx.fxml.FXML
    private TableColumn<bookListing,String> bookIDCol;

    @javafx.fxml.FXML
    public void initialize() {
        titleCol.setCellValueFactory(new PropertyValueFactory<>("title"));
        bookIDCol.setCellValueFactory(new PropertyValueFactory<>("bookID"));
        genreeCol.setCellValueFactory(new PropertyValueFactory<>("genre"));

        genreCombo.getItems().addAll("Fantasy","Science Fiction", "Mystery", "Thriller", "Horror","Poetry","Romance","History");

    }

    @javafx.fxml.FXML
    public void bookListingButton(ActionEvent actionEvent) {
        String title = titleTextField.getText();
        String bookID = bookIdTextField.getText();
        String genre = genreCombo.getValue();
        bookListing s = bookListingTableView.getSelectionModel().getSelectedItem();
        if (titleTextField.getText().isEmpty()){
            messageLabel.setText("Please Give the Title");
            return;
        }
        if (bookIdTextField.getText().isEmpty()){
            messageLabel.setText("Please Give the bookID");
            return;
        }
        if (genreCombo == null){
            messageLabel.setText("Please Fill up the genre");
            return;


        }
        bookListing newBook = new bookListing(title, bookID, genre);

        bookListingTableView.getItems().add(newBook); // ✅ Add to TableView

        // Clear inputs
        titleTextField.clear();
        bookIdTextField.clear();
        genreCombo.getSelectionModel().clearSelection();
        messageLabel.setText("Book added successfully!");



    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent)throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Sami/AuthorDashboard.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setScene(scene);

    }
}