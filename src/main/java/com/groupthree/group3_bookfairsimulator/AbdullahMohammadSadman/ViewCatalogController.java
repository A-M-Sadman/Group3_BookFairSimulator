package com.groupthree.group3_bookfairsimulator.AbdullahMohammadSadman;

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

import static com.groupthree.group3_bookfairsimulator.AbdullahMohammadSadman.BookManager.bookList;

public class ViewCatalogController
{
    @javafx.fxml.FXML
    private TableColumn<Book, String> titleCol;
    @javafx.fxml.FXML
    private TableColumn<Book, String> genreCol;
    @javafx.fxml.FXML
    private TableColumn<Book, String> authorCol;
    @javafx.fxml.FXML
    private TableColumn<Book, Integer> quantityCol;
    @javafx.fxml.FXML
    private TableView<Book> bookTableView;
    @javafx.fxml.FXML
    private TableColumn<Book, Double> priceCol;
    @javafx.fxml.FXML
    private Label showLabel;

    @javafx.fxml.FXML
    public void initialize() {
        titleCol.setCellValueFactory(new PropertyValueFactory<>("title"));
        authorCol.setCellValueFactory(new PropertyValueFactory<>("author"));
        priceCol.setCellValueFactory(new PropertyValueFactory<>("price"));
        quantityCol.setCellValueFactory(new PropertyValueFactory<>("quantity"));
        genreCol.setCellValueFactory(new PropertyValueFactory<>("genre"));
    }

    @javafx.fxml.FXML
    public void show(ActionEvent actionEvent) {
        if (bookList.isEmpty()) {
            showLabel.setText("There is no book to show!");
            return;
        }
        try {
            bookTableView.getItems().addAll(bookList);
            showLabel.setText("Data loaded successfully");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
//        bookTableView.getItems().addAll(bookList);
    }

    @javafx.fxml.FXML
    public void back(ActionEvent actionEvent) throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("AbdullahMohammadSadman/StallOwnerDashboard.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setScene(scene);
    }
}