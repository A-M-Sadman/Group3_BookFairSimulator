package com.groupthree.group3_bookfairsimulator.Fahim;

import com.groupthree.group3_bookfairsimulator.AbdullahMohammadSadman.Book;
import com.groupthree.group3_bookfairsimulator.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

import static com.groupthree.group3_bookfairsimulator.AbdullahMohammadSadman.Book.bookList;

public class SeeBookListController
{
    @javafx.fxml.FXML
    private Label lable;
    @javafx.fxml.FXML
    private Label favoriteLable;
    @javafx.fxml.FXML
    private TableView<Book> bookTableViwe;
    @javafx.fxml.FXML
    private TableColumn<Book, String> titleCol;
    @javafx.fxml.FXML
    private TableColumn<Book,String> authorCol;
    @javafx.fxml.FXML
    private TableColumn genercoloum;

    @javafx.fxml.FXML
    public void initialize() {
        titleCol.setCellValueFactory(new PropertyValueFactory<>("title"));
        authorCol.setCellValueFactory(new PropertyValueFactory<>("author"));
        genercoloum.setCellValueFactory(new PropertyValueFactory<>("genre"));

        bookTableViwe.getItems().addAll(bookList);
    }

    @javafx.fxml.FXML
    public void viweDetails(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void addFavorite(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void buyBook(ActionEvent actionEvent) throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Fahim/BuyBook.fxml"));
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
    public void next(ActionEvent actionEvent) throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Fahim/BuyBook.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setScene(scene);
    }
}