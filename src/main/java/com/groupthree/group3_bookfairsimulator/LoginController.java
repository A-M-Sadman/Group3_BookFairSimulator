package com.groupthree.group3_bookfairsimulator;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class LoginController
{
    @javafx.fxml.FXML
    private PasswordField newPassInput;
    @javafx.fxml.FXML
    private PasswordField checkNewPass;
    @javafx.fxml.FXML
    private CheckBox showPass;
    @javafx.fxml.FXML
    private TextField newUserInput;
    @javafx.fxml.FXML
    private Label createAccountLabel;
    @javafx.fxml.FXML
    private ComboBox userInput;
    @javafx.fxml.FXML
    private Label loginLabel;
    @javafx.fxml.FXML
    private PasswordField passInput;

    @javafx.fxml.FXML
    public void initialize() {
        userInput.getItems().addAll("Author", "Publisher", "Visitor", "Event Manager", "Stall Owner", "Maintenance Officer", "Security Officer", "Help Desk Officer");
    }

    @javafx.fxml.FXML
    public void createAccount(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void login(ActionEvent actionEvent) throws IOException {
        if ((userInput.getValue() == null) || (passInput.getText().isEmpty())){
            loginLabel.setText("Choose user and enter password!");
            return;
        }

        if ((userInput.getValue().equals("Stall Owner")) && (passInput.getText().equals("2330322"))){
            AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("AbdullahMohammadSadman/StallOwnerDashboard.fxml"));
            Scene scene = new Scene(root);
            HelloApplication.stage.setScene(scene);
        }

        if ((userInput.getValue().equals("Maintenance Officer")) && (passInput.getText().equals("2330322"))){
            AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("AbdullahMohammadSadman/MaintenanceOfficerDashboard.fxml"));
            Scene scene = new Scene(root);
            HelloApplication.stage.setScene(scene);
        }

    }

    @javafx.fxml.FXML
    public void forgotPass(ActionEvent actionEvent) {
        loginLabel.setText("Try to remember your password!");
    }

    @javafx.fxml.FXML
    public void showPassword(ActionEvent actionEvent) {
        if (showPass.isSelected()){
            if (passInput.getText().isEmpty()){
                loginLabel.setText("Enter Password!");
                return;
            }
            loginLabel.setText(passInput.getText());
        } else {
            loginLabel.setText("");
        }
    }
}