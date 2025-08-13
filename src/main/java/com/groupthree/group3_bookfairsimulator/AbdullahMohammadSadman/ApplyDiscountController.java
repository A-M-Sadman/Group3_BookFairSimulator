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

public class ApplyDiscountController
{
    @javafx.fxml.FXML
    private TableColumn<Book, String> titleCol;
    @javafx.fxml.FXML
    private TextField discountInput;
    @javafx.fxml.FXML
    private TableColumn<Book, String> authorCol;
    @javafx.fxml.FXML
    private Label applyLabel;
    @javafx.fxml.FXML
    private TableColumn<Book, Double> priceCol;
    @javafx.fxml.FXML
    private TableView<Book> bookTableView;

    @javafx.fxml.FXML
    public void initialize() {
        titleCol.setCellValueFactory(new PropertyValueFactory<>("title"));
        authorCol.setCellValueFactory(new PropertyValueFactory<>("author"));
        priceCol.setCellValueFactory(new PropertyValueFactory<>("price"));

        bookTableView.getItems().addAll(bookList);
    }

    @javafx.fxml.FXML
    public void apply(ActionEvent actionEvent) {
        if (bookList.isEmpty()){
            applyLabel.setText("There is no book to apply discount");
            return;
        }

        Book book = bookTableView.getSelectionModel().getSelectedItem();
        if (book == null){
            applyLabel.setText("Please select a book from the table!");
            return;
        }

        if ((discountInput.getText().isEmpty())) {
            applyLabel.setText("Enter a number to apply discount");
            return;
        }

        double d = Double.parseDouble(discountInput.getText());

        if (d < 0) {
            applyLabel.setText("Please enter a positive number!");
            return;
        }

        if (book.getQuantity() == 0) {
            applyLabel.setText("Book is not available now!");
            return;
        }

        double p = book.getPrice() - (book.getPrice() * (d / 100));
        book.setPrice(p);
//        bookTableView.getItems().clear();
//        bookTableView.getItems().addAll(bookList);
        bookTableView.refresh();

        applyLabel.setText("Applied discount successfully");

    }

    @javafx.fxml.FXML
    public void back(ActionEvent actionEvent) throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("AbdullahMohammadSadman/StallOwnerDashboard.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setScene(scene);
    }
}