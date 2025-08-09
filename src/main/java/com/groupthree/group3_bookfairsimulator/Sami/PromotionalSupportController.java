package com.groupthree.group3_bookfairsimulator.Sami;

import com.groupthree.group3_bookfairsimulator.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

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
    public void initialize() {
        bookIdCol.setCellValueFactory(new PropertyValueFactory<>("bookID"));
        bookTitlecol.setCellValueFactory(new PropertyValueFactory<>("bookTitle"));
        promotionCol.setCellValueFactory(new PropertyValueFactory<>("PromotionalType"));

        promotionTypeCombo.getItems().addAll("X banner","Seminar","Facebook Marketing");

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

        promotionTableView.getItems().add(addBook);


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
}