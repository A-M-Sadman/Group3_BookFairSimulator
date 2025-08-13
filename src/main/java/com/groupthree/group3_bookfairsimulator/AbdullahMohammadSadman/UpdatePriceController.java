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

import static com.groupthree.group3_bookfairsimulator.AbdullahMohammadSadman.BookManager.bookList;

public class UpdatePriceController
{
    @javafx.fxml.FXML
    private TableColumn<Book, String> titleCol;
    @javafx.fxml.FXML
    private TextField newPriceInput;
    @javafx.fxml.FXML
    private Label updatePriceLabel;
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

//        bookTableView.getItems().addAll(bookList);
        try {
            bookTableView.getItems().addAll(bookList);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }



    @javafx.fxml.FXML
    public void back(ActionEvent actionEvent) throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("AbdullahMohammadSadman/StallOwnerDashboard.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void updatePrice(ActionEvent actionEvent) {
//        if (bookTableView.getItems().isEmpty()){
//            updatePriceLabel.setText("There are no books in the inventory!");
//            return;
//        }

        Book book = bookTableView.getSelectionModel().getSelectedItem();

        if (book == null){
            updatePriceLabel.setText("Please select a book from the table!");
            return;
        }

        double uPrice;
        try {
            uPrice = Double.parseDouble(newPriceInput.getText());
            if ((newPriceInput.getText().isEmpty()) || (uPrice < 0)) {
                updatePriceLabel.setText("Enter a positive number as price!");
                return;
            }
        } catch (NumberFormatException e) {
            throw new RuntimeException(e);
        }

        if (book.getQuantity() == 0) {
            updatePriceLabel.setText("Book is not available now!");
            return;
        }

        book.setPrice(uPrice);
//        bookTableView.getItems().clear();
//        bookTableView.getItems().addAll(bookList);

        try {
            BookManager.saveBookList();
            updatePriceLabel.setText("Price updated successfully");
        } catch (Exception e) {
            throw new RuntimeException("Couldn't update the price");
        }
        bookTableView.refresh();
    }
}