package com.groupthree.group3_bookfairsimulator.Fahim;

import com.groupthree.group3_bookfairsimulator.AbdullahMohammadSadman.Book;
import com.groupthree.group3_bookfairsimulator.HelloApplication;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

import static com.groupthree.group3_bookfairsimulator.AbdullahMohammadSadman.BookManager.bookList;
import static com.groupthree.group3_bookfairsimulator.AbdullahMohammadSadman.Book.favBooklist;

public class BuyBookController
{
    @javafx.fxml.FXML
    private TableColumn<Book, String> titlecol;
    @javafx.fxml.FXML
    private TableColumn<Book,String> authorcol;
    @javafx.fxml.FXML
    private TableView<Book> tableviwe;
    @javafx.fxml.FXML
    private ComboBox<String> combobox;
    @javafx.fxml.FXML
    private TableColumn<Book,Double> pricecol;
    @javafx.fxml.FXML
    private Label lable;

    @javafx.fxml.FXML
    public void initialize() {
        combobox.getItems().addAll("Cash","Card","Online");
        titlecol.setCellValueFactory(new PropertyValueFactory<>("title"));
        authorcol.setCellValueFactory(new PropertyValueFactory<>("author"));
        pricecol.setCellValueFactory(new PropertyValueFactory<>("price"));

        tableviwe.getItems().addAll(bookList);


    }

    @javafx.fxml.FXML
    public void checkOut(ActionEvent actionEvent) {
        Book x = tableviwe.getSelectionModel().getSelectedItem();
        if (x == null) {
            lable.setText("Please select a book.");
            return;
        }

        if (combobox.getValue() == null){
            lable.setText("select Payment Mathod");
            return;
        }
        lable.setText("Purchased " + x.getTitle() );
    }


    @Deprecated
    public void checkoutlable(Event event) {
    }

    @javafx.fxml.FXML
    public void dashbord(ActionEvent actionEvent) throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Fahim/visitor.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void back(ActionEvent actionEvent) throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Fahim/SeeBookList.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void next(ActionEvent actionEvent) throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Fahim/JoinEvent.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setScene(scene);
    }
}