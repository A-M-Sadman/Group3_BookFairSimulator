package com.groupthree.group3_bookfairsimulator.Sami;

import com.groupthree.group3_bookfairsimulator.HelloApplication;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

import java.io.*;
import java.util.ArrayList;

import static com.groupthree.group3_bookfairsimulator.Sami.EventManagementController.eventmanagements;
import static com.groupthree.group3_bookfairsimulator.Sami.VisitorComplaintsModelClass.visitorComplaintsModelClasses;

public class VisitorComplaints {
    @javafx.fxml.FXML
    private TableColumn<VisitorComplaintsModelClass, String> visitorNameCol;
    @javafx.fxml.FXML
    private TextField visitorIdTextField;
    @javafx.fxml.FXML
    private TableColumn<VisitorComplaintsModelClass, String> visitorContactCol;
    @javafx.fxml.FXML
    private TextField visitorCntactTextField;
    @javafx.fxml.FXML
    private TableColumn<VisitorComplaintsModelClass, String> complaintsCol;
    @javafx.fxml.FXML
    private TableView<VisitorComplaintsModelClass> tableView;
    @javafx.fxml.FXML
    private TextField complaintsTextField;
    @javafx.fxml.FXML
    private TextField visitorNameTextField;
    @javafx.fxml.FXML
    private TableColumn<VisitorComplaintsModelClass, String> visitorIDCol;
    @javafx.fxml.FXML
    private Label visitorLabel;
    private static final String data = "Data/visitorCom.bin";

    public static final ArrayList<VisitorComplaints> visitorComplaints = new ArrayList<>();

    static ArrayList<VisitorComplaintsModelClass> getvisitorComplaintsModelClassArrayList() {
        ArrayList<VisitorComplaintsModelClass> visitorComplaintsModelClasses = new ArrayList<>();

        File file = new File(data);
        if (!file.exists()) {
            return visitorComplaintsModelClasses;
        }

        try (ObjectInputStream stream = new ObjectInputStream(
                new FileInputStream(file)
        )) {
            visitorComplaintsModelClasses = (ArrayList<VisitorComplaintsModelClass>) stream.readObject();
        } catch (EOFException e) {


        } catch (InvalidClassException | ClassNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException("Invalid file format please delete file and try again.");
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Error reading book list from file!");
        }

        return visitorComplaintsModelClasses;
    }

    public static void saveCom() {
        try (ObjectOutputStream stream = new ObjectOutputStream(
                new FileOutputStream(data)
        )) {
            stream.writeObject(new ArrayList<>(visitorComplaintsModelClasses));
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Could not save to file!");
        }
    }


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
        if (visitorNameTextField.getText().isEmpty()) {
            visitorLabel.setText("Please provide visitor name");
            return;
        }
        if (visitorIdTextField.getText().isEmpty()) {
            visitorLabel.setText("Please provide ID");
            return;
        }
        if (visitorCntactTextField.getText().isEmpty()) {
            visitorLabel.setText("Please provide your contact");
            return;
        }
        if (complaintsTextField.getText().isEmpty()) {
            visitorLabel.setText("Please provide complaints");
            return;
        }

        VisitorComplaintsModelClass a = new VisitorComplaintsModelClass(name, id, contact, complaints);


        tableView.getItems().add(a);


        visitorNameTextField.clear();
        visitorIdTextField.clear();
        visitorCntactTextField.clear();
        complaintsTextField.clear();
        visitorLabel.setText("Successful");

    }

    @javafx.fxml.FXML
    public void dashBoardButton(ActionEvent actionEvent) throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Sami/PublisherDashboard.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void save(ActionEvent actionEvent) {
        try {
            saveCom();
            visitorLabel.setText("Data saved successfully!");
        } catch (RuntimeException e) {
            visitorLabel.setText(e.getMessage());
        }
    }


}
