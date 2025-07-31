package com.groupthree.group3_bookfairsimulator.AbdullahMohammadSadman;

import com.groupthree.group3_bookfairsimulator.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

import static com.groupthree.group3_bookfairsimulator.AbdullahMohammadSadman.Book.bookList;

public class RecordPurchaseController
{
    @javafx.fxml.FXML
    private TableColumn<Book, String> titleCol;
    @javafx.fxml.FXML
    private Label recordLabel;
    @javafx.fxml.FXML
    private TextField quantityToSell;
    @javafx.fxml.FXML
    private TableColumn<Book, String> authorCol;
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
    public void record(ActionEvent actionEvent) {
        if (bookList.isEmpty()){
            recordLabel.setText("There is no book to sell");
            return;
        }
        if ((quantityToSell.getText().isEmpty()) || (Integer.parseInt(quantityToSell.getText()) < 1)){
            recordLabel.setText("Enter a positive integer number as quantity");
            return;
        }
        int q = Integer.parseInt(quantityToSell.getText());
        Book book = bookTableView.getSelectionModel().getSelectedItem();
        if (book == null){
            recordLabel.setText("Select a book from the list");
        }
        if (q > book.getQuantity()){
            recordLabel.setText("The stock is insufficient!");
            return;
        }
        book.setQuantity(book.getQuantity() - q);
        book.setTotalSales(book.getTotalSales() + q);
        recordLabel.setText("Total price is: " + book.getPrice()*q + "\n" + "Recorded to the inventory successfully!");
        bookTableView.refresh();
    }

    @javafx.fxml.FXML
    public void back(ActionEvent actionEvent) throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("AbdullahMohammadSadman/StallOwnerDashboard.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setScene(scene);
    }
}