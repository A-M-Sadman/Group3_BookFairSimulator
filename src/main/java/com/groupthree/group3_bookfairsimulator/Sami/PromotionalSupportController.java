package com.groupthree.group3_bookfairsimulator.Sami;

import com.groupthree.group3_bookfairsimulator.HelloApplication;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

import java.io.*;
import java.util.ArrayList;

public class PromotionalSupportController
{
    @javafx.fxml.FXML
    private ComboBox<String> promotionTypeCombo;
    @javafx.fxml.FXML
    private TextField bookIdTextField;
    @javafx.fxml.FXML
    private TextField bookTitle;
    @javafx.fxml.FXML
    private TableColumn<promotionSupport,String> bookTitlecol;
    @javafx.fxml.FXML
    private TableColumn<promotionSupport,String> promotionCol;
    @javafx.fxml.FXML
    private TableView<promotionSupport> promotionTableView;
    @javafx.fxml.FXML
    private TableColumn<promotionSupport,String> bookIdCol;
    @javafx.fxml.FXML
    private Label promotionLabel;
    @javafx.fxml.FXML
    private TableColumn<bookListing,String> bookIDCol;
    private static final String data = "Data/promotion.bin";

    public static final ArrayList<promotionSupport> promotionSupports = new ArrayList<>();

    private static ArrayList<promotionSupport> getPromotionList() {
        ArrayList<promotionSupport> promotionSupports = new ArrayList<>();

        File file = new File(data);
        if (!file.exists()) {
            return promotionSupports;
        }

        try (ObjectInputStream stream = new ObjectInputStream(
                new FileInputStream(file)
        )) {
            promotionSupports = (ArrayList<promotionSupport>) stream.readObject();
        } catch (EOFException e) {


        } catch (InvalidClassException | ClassNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException("Invalid file format please delete file and try again.");
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Error reading book list from file!");
        }

        return promotionSupports;
    }
    public static void savePromotions() {
        try (ObjectOutputStream stream = new ObjectOutputStream(
                new FileOutputStream(data)
        )) {
            stream.writeObject(new ArrayList<>(promotionSupports));
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Could not save book list to file!");
        }
    }

    @javafx.fxml.FXML
    public void initialize() {
        bookIdCol.setCellValueFactory(new PropertyValueFactory<>("bookID"));
        bookTitlecol.setCellValueFactory(new PropertyValueFactory<>("bookTitle"));
        promotionCol.setCellValueFactory(new PropertyValueFactory<>("PromotionalType"));

        promotionTypeCombo.getItems().addAll("X banner","Seminar","Facebook Marketing");

        try {
            promotionTableView.getItems().addAll(promotionSupports);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @javafx.fxml.FXML
    public void submitRequestButton(ActionEvent actionEvent) {
        String bookID = bookIdTextField.getText();
        String book = bookTitle.getText();
        String type = promotionTypeCombo.getValue();
        promotionSupport s = promotionTableView.getSelectionModel().getSelectedItem();
        if (bookIdTextField.getText().isEmpty()){
            promotionLabel.setText("Provide book ID");
            return;
        }
        if (bookTitle.getText().isEmpty()){
            promotionLabel.setText("Provide book Title");
            return;
        }
        if (promotionTypeCombo.getValue() == null){
            promotionLabel.setText("Add promotion");
            return;
        }
        promotionSupport addBook = new promotionSupport(bookID, book, type);

        promotionSupports.add(addBook);
        promotionTableView.getItems().clear();
        promotionTableView.getItems().addAll(promotionSupports);


        bookIdTextField.clear();
        bookTitle.clear();
        promotionTypeCombo.getSelectionModel().clearSelection();
        promotionLabel.setText("Book added successfully!");
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
            savePromotions();
            promotionLabel.setText("Data saved successfully!");
        } catch (RuntimeException e) {
            promotionLabel.setText(e.getMessage());
        }
    }
}