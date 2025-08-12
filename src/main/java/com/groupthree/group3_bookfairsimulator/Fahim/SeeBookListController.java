package com.groupthree.group3_bookfairsimulator.Fahim;

import com.groupthree.group3_bookfairsimulator.AbdullahMohammadSadman.Book;
import com.groupthree.group3_bookfairsimulator.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

import static com.groupthree.group3_bookfairsimulator.AbdullahMohammadSadman.BookManager.bookList;
import static com.groupthree.group3_bookfairsimulator.AbdullahMohammadSadman.Book.favBooklist;

public class SeeBookListController
{
    @javafx.fxml.FXML
    private Label lable;
    @javafx.fxml.FXML
    private TableView<Book> bookTableViwe;
    @javafx.fxml.FXML
    private TableColumn<Book, String> titleCol;
    @javafx.fxml.FXML
    private TableColumn<Book,String> authorCol;
    @javafx.fxml.FXML
    private TableColumn<Book, String> genercoloum;
    @javafx.fxml.FXML
    private TextField titleTextfild;
    @javafx.fxml.FXML
    private ComboBox<String> combobox;

    @javafx.fxml.FXML
    public void initialize() {
        combobox.getItems().addAll("Novel","literature","Story","Action","Thrill","Drama","Romance","Horror");
        titleCol.setCellValueFactory(new PropertyValueFactory<>("title"));
        authorCol.setCellValueFactory(new PropertyValueFactory<>("author"));
        genercoloum.setCellValueFactory(new PropertyValueFactory<>("genre"));

        bookTableViwe.getItems().addAll(bookList);
    }

    @javafx.fxml.FXML
    public void viweDetails(ActionEvent actionEvent) {
        bookTableViwe.getItems().clear();
        for (Book b : bookList){
            if (b.getTitle().equals(titleTextfild.getText()) &&  (b.getGenre().equals(combobox.getValue()))){
                bookTableViwe.getItems().add(b);
            }
        }
    }

    @javafx.fxml.FXML
    public void addFavorite(ActionEvent actionEvent) {
        Book x = bookTableViwe.getSelectionModel().getSelectedItem();
        if (x == null) {
            lable.setText("Please select a book to add to favorites.");
            return;}
        favBooklist.add(x);
        lable.setText(x.getTitle() + " added to Favorites.");
    }

    @javafx.fxml.FXML
    public void dashbord(ActionEvent actionEvent) throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Fahim/visitor.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void next(ActionEvent actionEvent) throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Fahim/BuyBook.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void resetviweDetails(ActionEvent actionEvent) {
        bookTableViwe.getItems().clear();
        bookTableViwe.getItems().addAll(bookList);
    }
}