package com.groupthree.group3_bookfairsimulator.Sami;

import com.groupthree.group3_bookfairsimulator.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;

public class UploadBook
{
    @javafx.fxml.FXML
    private TextField genreTextField;
    @javafx.fxml.FXML
    private TextField priceTextField;
    @javafx.fxml.FXML
    private TextField titletEXTfIELD;
    @javafx.fxml.FXML
    private TextField authorTextField;
    @javafx.fxml.FXML
    private ImageView imageview;
    @javafx.fxml.FXML
    private Label upLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void uploadBookOnaction(ActionEvent actionEvent) {
        if (titletEXTfIELD.getText().isEmpty()){
            upLabel.setText("Please provide book Title");
            return;



        }
        if (authorTextField.getText().isEmpty()){
            upLabel.setText("Please provide the author name");
            return;
        }
        if (genreTextField.getText().isEmpty()){
            upLabel.setText("Please provide genre");
            return;
        }
        if (priceTextField.getText().isEmpty()){
            upLabel.setText("Please provide the price");
            return;
        }
        if (imageview.getImage() == null){
            upLabel.setText("Please upload the image");
            return;
        }
        titletEXTfIELD.clear();
        authorTextField.clear();
        genreTextField.clear();
        priceTextField.clear();
        imageview.setImage(null);
        upLabel.setText("Successful");
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent)throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Sami/PublisherDashboard.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void uploadImageButton(ActionEvent actionEvent)throws IOException {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Select Image");


        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("Image Files", "*.png", "*.jpg", "*.jpeg", "*.gif")
        );

        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        File file = fileChooser.showOpenDialog(stage);

        if (file != null) {
            Image image = new Image(file.toURI().toString());
            imageview.setImage(image);
        }
    }












}