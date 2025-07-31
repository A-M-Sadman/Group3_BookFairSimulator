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

        bookTableView.getItems().addAll(bookList);
    }



    @javafx.fxml.FXML
    public void back(ActionEvent actionEvent) throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("AbdullahMohammadSadman/StallOwnerDashboard.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void updatePrice(ActionEvent actionEvent) {
        if (bookList.isEmpty()){
            updatePriceLabel.setText("There is no book to update price!");
        }
        Book book = bookTableView.getSelectionModel().getSelectedItem();
        if ((bookTableView.getSelectionModel().getSelectedItems()) == null){
            updatePriceLabel.setText("Please select a book from the table!");
            return;
        }

        if ((newPriceInput.getText().isEmpty()) || (Double.parseDouble(newPriceInput.getText()) < 0)) {
            updatePriceLabel.setText("Enter a positive number as price!");
            return;
        }

        if (book.getQuantity() == 0) {
            updatePriceLabel.setText("Book is not available now!");
            return;
        }

        book.setPrice(Double.parseDouble(newPriceInput.getText()));
        bookTableView.getItems().clear();
        bookTableView.getItems().addAll(bookList);

        updatePriceLabel.setText("Price updated successfully");
    }
}