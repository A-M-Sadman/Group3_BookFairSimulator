package com.groupthree.group3_bookfairsimulator.AbdullahMohammadSadman;

import com.groupthree.group3_bookfairsimulator.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static com.groupthree.group3_bookfairsimulator.AbdullahMohammadSadman.BookManager.bookList;

public class CheckStockController
{
    @javafx.fxml.FXML
    private Label showStockLabel;
    @javafx.fxml.FXML
    private BarChart<String, Integer> stockBarChart;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void back(ActionEvent actionEvent) throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("AbdullahMohammadSadman/StallOwnerDashboard.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void showStock(ActionEvent actionEvent) {
        if (bookList.isEmpty()) {
            showStockLabel.setText("There is no book available");
            return;
        }

        List<XYChart.Data<String, Integer>> dataPoints = new ArrayList<>();

        for (Book b: bookList){
            dataPoints.add(new XYChart.Data<>(b.getTitle(), b.getQuantity()));
        }

        XYChart.Series<String, Integer> section1 = new XYChart.Series<>();
        section1.getData().addAll(dataPoints);
        section1.setName("Quantity Of Books");

        stockBarChart.getData().clear();
        stockBarChart.getData().add(section1);

        showStockLabel.setText("Chart loaded successfully");
    }
}