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
    private TableView bookTableView;

    @javafx.fxml.FXML
    public void initialize() {
        titleCol.setCellValueFactory(new PropertyValueFactory<>("title"));
        authorCol.setCellValueFactory(new PropertyValueFactory<>("author"));
        priceCol.setCellValueFactory(new PropertyValueFactory<>("price"));

        bookTableView.getItems().addAll(bookList);
    }

    @javafx.fxml.FXML
    public void apply(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void back(ActionEvent actionEvent) throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("AbdullahMohammadSadman/StallOwnerDashboard.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setScene(scene);
    }
}