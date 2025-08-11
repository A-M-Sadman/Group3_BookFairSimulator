package com.groupthree.group3_bookfairsimulator.Sami;

import com.groupthree.group3_bookfairsimulator.AbdullahMohammadSadman.Book;
import com.groupthree.group3_bookfairsimulator.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class BookListingController
{
    @javafx.fxml.FXML
    private TextField titleTextField;
    @javafx.fxml.FXML
    private TableColumn<bookListing,String> titleCol;
    @javafx.fxml.FXML
    private TableView<bookListing> bookListingTableView;
    @javafx.fxml.FXML
    private ComboBox<String> genreCombo;
    @javafx.fxml.FXML
    private TextField bookIdTextField;
    @javafx.fxml.FXML
    private TableColumn<Book,String> genreeCol;
    @javafx.fxml.FXML
    private Label messageLabel;
    @javafx.fxml.FXML
    private TableColumn<bookListing,String> bookIDCol;
    private static final String DATA_FILE_NAME = "data/booklist.bin";


    static ArrayList<bookListing> getBookList() {
        ArrayList<bookListing> bookList = new ArrayList<>();

        File file = new File(DATA_FILE_NAME);
        if (!file.exists()) {
            return bookList;
        }

        try (ObjectInputStream stream = new ObjectInputStream(
                new FileInputStream(file)
        )) {
            bookList = (ArrayList<bookListing>) stream.readObject();
        } catch (EOFException e) {


        } catch (InvalidClassException | ClassNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException("Invalid file format please delete file and try again.");
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Error reading book list from file!");
        }

        return bookList;
    }

    public static void saveBookList(List<bookListing> bookList) {
        try (ObjectOutputStream stream = new ObjectOutputStream(
                new FileOutputStream(DATA_FILE_NAME)
        )) {
            stream.writeObject(new ArrayList<>(bookList));
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Could not save book list to file!");
        }
    }




    @javafx.fxml.FXML
    public void initialize() {
        titleCol.setCellValueFactory(new PropertyValueFactory<>("title"));
        bookIDCol.setCellValueFactory(new PropertyValueFactory<>("bookID"));
        genreeCol.setCellValueFactory(new PropertyValueFactory<>("genre"));

        genreCombo.getItems().addAll("Fantasy","Science Fiction", "Mystery", "Thriller", "Horror","Poetry","Romance","History");

    }
    public void next(ActionEvent actionEvent) throws IOException{
        Parent root = FXMLLoader.load(HelloApplication.class.getResource("BookListing.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage)((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void bookListingButton(ActionEvent actionEvent) {

        String title = titleTextField.getText();
        String bookID = bookIdTextField.getText();
        String genre = genreCombo.getValue();
        bookListing s = bookListingTableView.getSelectionModel().getSelectedItem();
        if (titleTextField.getText().isEmpty()){
            messageLabel.setText("Please Give the Title");
            return;
        }
        if (bookIdTextField.getText().isEmpty()){
            messageLabel.setText("Please Give the bookID");
            return;
        }
        if (genreCombo.getValue() == null){
            messageLabel.setText("Please Fill up the genre");
            return;


        }
        bookListing newBook = new bookListing(title, bookID, genre);



        bookListingTableView.getItems().add(newBook);


        titleTextField.clear();
        bookIdTextField.clear();
        genreCombo.getSelectionModel().clearSelection();
        messageLabel.setText("Book added successfully!");



    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent)throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Sami/AuthorDashboard.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setScene(scene);

    }



    @javafx.fxml.FXML
    public void saveButton(ActionEvent actionEvent) {
        try {
            saveBookList(bookListingTableView.getItems());
            messageLabel.setText("Data saved successfully!");
        } catch (RuntimeException e) {
            messageLabel.setText(e.getMessage());
        }






    }

}