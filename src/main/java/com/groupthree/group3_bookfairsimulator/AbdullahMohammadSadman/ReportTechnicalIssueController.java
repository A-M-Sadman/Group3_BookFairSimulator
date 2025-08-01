package com.groupthree.group3_bookfairsimulator.AbdullahMohammadSadman;

import com.groupthree.group3_bookfairsimulator.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.time.LocalDate;

import static com.groupthree.group3_bookfairsimulator.AbdullahMohammadSadman.Report.reportList;

public class ReportTechnicalIssueController
{
    @javafx.fxml.FXML
    private Label submitLabel;
    @javafx.fxml.FXML
    private TableColumn<Report, LocalDate> dateCol;
    @javafx.fxml.FXML
    private TextField idInput;
    @javafx.fxml.FXML
    private TableView<Report> reportTableView;
    @javafx.fxml.FXML
    private TextArea descriptionInput;
    @javafx.fxml.FXML
    private TableColumn<Report, String> reportIdCol;
    @javafx.fxml.FXML
    private DatePicker dateInput;
    @javafx.fxml.FXML
    private TableColumn<Report, String> descriptionCol;

    @javafx.fxml.FXML
    public void initialize() {
        reportIdCol.setCellValueFactory(new PropertyValueFactory<>("reportId"));
        descriptionCol.setCellValueFactory(new PropertyValueFactory<>("description"));
        dateCol.setCellValueFactory(new PropertyValueFactory<>("Date"));

        reportTableView.getItems().addAll(reportList);
    }

    @javafx.fxml.FXML
    public void submit(ActionEvent actionEvent) {
        Report report = new Report(idInput.getText(), descriptionInput.getText(), dateInput.getValue());
        reportList.add(report);
        reportTableView.getItems().clear();
        reportTableView.getItems().addAll(reportList);
    }

    @javafx.fxml.FXML
    public void back(ActionEvent actionEvent) throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("AbdullahMohammadSadman/MaintenanceOfficerDashboard.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setScene(scene);
    }
}