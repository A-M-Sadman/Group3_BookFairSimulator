package com.groupthree.group3_bookfairsimulator.Reya;

import com.groupthree.group3_bookfairsimulator.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;

public class LostandFound
{
    @javafx.fxml.FXML
    private DatePicker DATE;
    @javafx.fxml.FXML
    private TextField descriptionOflostTextField;
    @javafx.fxml.FXML
    private TextField descriptionFoundTextField;
    @javafx.fxml.FXML
    private TextField contactNumberTextField;
    @javafx.fxml.FXML
    private TextField visitorNameTextField;
    @javafx.fxml.FXML
    private TextField locationOfTextfIELD;
    @javafx.fxml.FXML
    private ImageView imageView;
    @javafx.fxml.FXML
    private Label lostAndFoundLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void uploadImageButton(ActionEvent actionEvent) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Select Image");


        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("Image Files", "*.png", "*.jpg", "*.jpeg", "*.gif")
        );

        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        File file = fileChooser.showOpenDialog(stage);

        if (file != null) {
            Image image = new Image(file.toURI().toString());
            imageView.setImage(image);
        }

    }

    @javafx.fxml.FXML
    public void addLostandFoundButton(ActionEvent actionEvent) {
        if (visitorNameTextField.getText().isEmpty()){
            lostAndFoundLabel.setText("Please Provide your name");
            return;

        }
        if (descriptionFoundTextField.getText().isEmpty()){
            lostAndFoundLabel.setText("Please Provide description");
            return;

        }
        if (descriptionOflostTextField.getText().isEmpty()){
            lostAndFoundLabel.setText("Please Provide lost information");
            return;

        }
        if (DATE.getValue() == null){
            lostAndFoundLabel.setText("Please Provide date");
            return;

        }
        if (contactNumberTextField.getText().isEmpty()){
            lostAndFoundLabel.setText("Please Provide your contact number");
            return;

        }
        if (locationOfTextfIELD.getText().isEmpty()){
            lostAndFoundLabel.setText("Please Provide location");
            return;

        }
        visitorNameTextField.clear();
        descriptionOflostTextField.clear();
        descriptionFoundTextField.clear();
        locationOfTextfIELD.clear();
        DATE.setValue(null);
        contactNumberTextField.clear();
    }

    @javafx.fxml.FXML
    public void dashBoardButton(ActionEvent actionEvent)throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Reya/securityOfficerDashboard.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setScene(scene);
    }
}