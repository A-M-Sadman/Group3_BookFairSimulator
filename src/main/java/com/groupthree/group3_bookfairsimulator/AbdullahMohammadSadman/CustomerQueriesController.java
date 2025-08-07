package com.groupthree.group3_bookfairsimulator.AbdullahMohammadSadman;

import com.groupthree.group3_bookfairsimulator.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

import static com.groupthree.group3_bookfairsimulator.AbdullahMohammadSadman.CustomerQuery.queryList;

public class CustomerQueriesController
{
    @javafx.fxml.FXML
    private TableColumn<CustomerQuery, String> messageCol;
    @javafx.fxml.FXML
    private TableColumn<CustomerQuery, String> queryIdCol;
    @javafx.fxml.FXML
    private TableView<CustomerQuery> queryTableView;
    @javafx.fxml.FXML
    private Label replyLabel;
    @javafx.fxml.FXML
    private TableColumn<CustomerQuery, String> customerNameCol;
    @javafx.fxml.FXML
    private TextArea messageArea;
    @javafx.fxml.FXML
    private TextField replyInput;
    @javafx.fxml.FXML
    private TextField nameInput;

    @javafx.fxml.FXML
    public void initialize() {
        queryIdCol.setCellValueFactory(new PropertyValueFactory<>("customerId"));
        customerNameCol.setCellValueFactory(new PropertyValueFactory<>("customerName"));
        messageCol.setCellValueFactory(new PropertyValueFactory<>("message"));

        queryTableView.getItems().addAll(queryList);
    }

    @javafx.fxml.FXML
    public void back(ActionEvent actionEvent) throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("AbdullahMohammadSadman/StallOwnerDashboard.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void reply(ActionEvent actionEvent) {
        if (queryList.isEmpty()){
            replyLabel.setText("There are no queries!");
            return;
        }
        CustomerQuery c = queryTableView.getSelectionModel().getSelectedItem();
        if (c == null) {
            replyLabel.setText("Please select a query to answer");
            return;
        }
        replyLabel.setText("Reply sent successfully");
        queryList.remove(c);
        replyInput.clear();
        queryTableView.getItems().clear();
        queryTableView.getItems().addAll(queryList);
    }

    @javafx.fxml.FXML
    public void query(ActionEvent actionEvent) {
        if (nameInput.getText().isEmpty()) {
            replyLabel.setText("Please give your name!");
            return;
        }
        if (messageArea.getText().isEmpty()){
            replyLabel.setText("Enter your query please");
            return;
        }

        CustomerQuery cq = new CustomerQuery(
                ""+queryList.size()+1,
                nameInput.getText(),
                messageArea.getText()
        );
        queryList.add(cq);
        queryTableView.getItems().clear();
        queryTableView.getItems().addAll(queryList);
        messageArea.clear();
        nameInput.clear();
    }
}