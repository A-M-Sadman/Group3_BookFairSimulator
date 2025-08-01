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

import static com.groupthree.group3_bookfairsimulator.AbdullahMohammadSadman.Book.bookList;

public class CheckStockController
{
    @javafx.fxml.FXML
    private TableColumn<Book, String> titleCol;
    @javafx.fxml.FXML
    private TableColumn<Book, String> authorCol;
    @javafx.fxml.FXML
    private Label showStockLabel;
    @javafx.fxml.FXML
    private TableView<Book> bookTableView;
    @javafx.fxml.FXML
    private TableColumn<Book, Double> priceCol;

    @javafx.fxml.FXML
    public void initialize() {
        titleCol.setCellValueFactory(new PropertyValueFactory<>("title"));
        authorCol.setCellValueFactory(new PropertyValueFactory<>("author"));
        priceCol.setCellValueFactory(new PropertyValueFactory<>("price"));

        bookTableView.getItems().addAll(bookList);
    }

    @javafx.fxml.FXML
    public void back(ActionEvent actionEvent) throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("AbdullahMohammadSadman/StallOwnerDashboard.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void showStock(ActionEvent actionEvent) {
        if (bookList.isEmpty()) {
            showStockLabel.setText("There is no book available");
            return;
        }
        Book book = bookTableView.getSelectionModel().getSelectedItem();
        if (book == null){
            showStockLabel.setText("Select a book from table");
            return;
        }
        showStockLabel.setText("Stock for " + book.getTitle() + ": " + book.getQuantity());
    }
}