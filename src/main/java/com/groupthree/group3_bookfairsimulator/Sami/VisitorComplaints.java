package com.groupthree.group3_bookfairsimulator.Sami;

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

public class VisitorComplaints
{
    @javafx.fxml.FXML
    private TableColumn<VisitorComplaintsModelClass,String> visitorNameCol;
    @javafx.fxml.FXML
    private TextField visitorIdTextField;
    @javafx.fxml.FXML
    private TableColumn<VisitorComplaintsModelClass,String> visitorContactCol;
    @javafx.fxml.FXML
    private TextField visitorCntactTextField;
    @javafx.fxml.FXML
    private TableColumn<VisitorComplaintsModelClass,String> complaintsCol;
    @javafx.fxml.FXML
    private TableView<VisitorComplaintsModelClass> tableView;
    @javafx.fxml.FXML
    private TextField complaintsTextField;
    @javafx.fxml.FXML
    private TextField visitorNameTextField;
    @javafx.fxml.FXML
    private TableColumn<VisitorComplaintsModelClass,String> visitorIDCol;
    @javafx.fxml.FXML
    private Label visitorLabel;

    @javafx.fxml.FXML
    public void initialize() {
        visitorNameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
        visitorIDCol.setCellValueFactory(new PropertyValueFactory<>("id"));
        visitorContactCol.setCellValueFactory(new PropertyValueFactory<>("contact"));
        complaintsCol.setCellValueFactory(new PropertyValueFactory<>("complaints"));


    }

    @javafx.fxml.FXML
    public void visitorComplaintsButton(ActionEvent actionEvent) {

        String name = visitorNameTextField.getText();
        String id = visitorIdTextField.getText();
        String contact = visitorCntactTextField.getText();
        String complaints = complaintsTextField.getText();
        VisitorComplaintsModelClass s = tableView.getSelectionModel().getSelectedItem();
        if (visitorNameTextField.getText().isEmpty()){
            visitorLabel.setText("Please provide visitor name");
            return;
        }
        if (visitorIdTextField.getText().isEmpty()){
            visitorLabel.setText("Please provide ID");
            return;
        }
        if (visitorCntactTextField.getText().isEmpty()){
            visitorLabel.setText("Please provide your contact");
            return;
        }
        if (complaintsTextField.getText().isEmpty()){
            visitorLabel.setText("Please provide complaints");
            return;
        }

        VisitorComplaintsModelClass a = new VisitorComplaintsModelClass(name,id,contact,complaints);



        tableView.getItems().add(a);


        visitorNameTextField.clear();
        visitorIdTextField.clear();
        visitorCntactTextField.clear();
        complaintsTextField.clear();
        visitorLabel.setText("Successful");

    }

    @javafx.fxml.FXML
    public void dashBoardButton(ActionEvent actionEvent)throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Sami/AuthorDashboard.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setScene(scene);
    }
}