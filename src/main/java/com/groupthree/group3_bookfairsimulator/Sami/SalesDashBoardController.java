package com.groupthree.group3_bookfairsimulator.Sami;

import com.groupthree.group3_bookfairsimulator.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SalesDashBoardController
{
    @javafx.fxml.FXML
    private TableColumn<SalesModelclass,String> bookTitleCol;
    @javafx.fxml.FXML
    private Label salesLabel;
    @javafx.fxml.FXML
    private TableView<SalesModelclass> tableView;
    @javafx.fxml.FXML
    private TextField revenueTextField;
    @javafx.fxml.FXML
    private TextField copiesTextField;
    @javafx.fxml.FXML
    private TableColumn<SalesModelclass,String> revenueCol;
    @javafx.fxml.FXML
    private TextField bookTitleTextField;
    @javafx.fxml.FXML
    private TableColumn<Stallreservation,String> copiesSoldCol;
    @javafx.fxml.FXML
    private BarChart<String,Number> xyChart;

    @javafx.fxml.FXML
    public void initialize() {
        bookTitleCol.setCellValueFactory(new PropertyValueFactory<>("title"));
        copiesSoldCol.setCellValueFactory(new PropertyValueFactory<>("copies"));
        revenueCol.setCellValueFactory(new PropertyValueFactory<>("revenue"));
        //topSellingCol.setCellValueFactory(new PropertyValueFactory<>("topSelling"));


    }

    @javafx.fxml.FXML
    public void salesButton(ActionEvent actionEvent){
        String title = bookTitleTextField.getText();
        String copies  = copiesTextField.getText();
        String revenue = revenueTextField.getText();
        SalesModelclass s = tableView.getSelectionModel().getSelectedItem();
        if (bookTitleTextField.getText().isEmpty()){
            salesLabel.setText("Please add bookTite");
            return;
        }
        if (copiesTextField.getText().isEmpty()){
            salesLabel.setText("Please add bookTite");
            return;
        }
        if (revenueTextField.getText().isEmpty()){
            salesLabel.setText("Please add bookTite");
            return;
        }
        SalesModelclass newBook = new SalesModelclass(title, copies, revenue);



        tableView.getItems().add(newBook);


        bookTitleTextField.clear();
        copiesTextField.clear();
        revenueTextField.clear();
        salesLabel.setText("Book added successfully!");


    }



    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent)throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Sami/PublisherDashboard.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setScene(scene);
    }


    @javafx.fxml.FXML
    public void loadButton(ActionEvent actionEvent) {
    }
}