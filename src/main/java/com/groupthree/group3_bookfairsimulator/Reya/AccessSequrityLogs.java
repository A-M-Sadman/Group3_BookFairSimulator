package com.groupthree.group3_bookfairsimulator.Reya;

import com.groupthree.group3_bookfairsimulator.HelloApplication;
import com.groupthree.group3_bookfairsimulator.Sami.Eventmanagement;
import com.groupthree.group3_bookfairsimulator.Sami.bookListing;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

import java.io.*;
import java.util.ArrayList;

import static com.groupthree.group3_bookfairsimulator.Sami.bookListingManager.saveList;

public class AccessSequrityLogs
{
    @javafx.fxml.FXML
    private DatePicker date;
    @javafx.fxml.FXML
    private TextField logIdTextField;
    @javafx.fxml.FXML
    private TextField nameTextField;
    @javafx.fxml.FXML
    private TextField locationTextField;
    @javafx.fxml.FXML
    private TableView<AccessSequrityLogsModelClass> accessTableview;
    @javafx.fxml.FXML
    private TableColumn<AccessSequrityLogsModelClass,String> locationCol;
    @javafx.fxml.FXML
    private TableColumn<AccessSequrityLogsModelClass,String> datecol;
    @javafx.fxml.FXML
    private TableColumn<AccessSequrityLogsModelClass,String> nameCol;
    @javafx.fxml.FXML
    private TableColumn<AccessSequrityLogsModelClass,String> logIdCol;
    @javafx.fxml.FXML
    private Label accessSequrityLogsLabel;
    private static final String data = "Data/logss.bin";

    public static final ArrayList<AccessSequrityLogsModelClass> eventmanagements = new ArrayList<>();

    static ArrayList<AccessSequrityLogsModelClass> getEventManagementList() {
        ArrayList<AccessSequrityLogsModelClass> eventmanagements = new ArrayList<>();

        File file = new File(data);
        if (!file.exists()) {
            return eventmanagements;
        }

        try (ObjectInputStream stream = new ObjectInputStream(
                new FileInputStream(file)
        )) {
            eventmanagements = (ArrayList<AccessSequrityLogsModelClass>) stream.readObject();
        } catch (EOFException e) {


        } catch (InvalidClassException | ClassNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException("Invalid file format please delete file and try again.");
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Error reading book list from file!");
        }

        return eventmanagements;
    }
    public static void saveEvent() {
        try (ObjectOutputStream stream = new ObjectOutputStream(
                new FileOutputStream(data)
        )) {
            stream.writeObject(new ArrayList<>(eventmanagements));
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Could not save book list to file!");
        }
    }


    @javafx.fxml.FXML
    public void initialize() {
        nameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
        logIdCol.setCellValueFactory(new PropertyValueFactory<>("logId"));
        locationCol.setCellValueFactory(new PropertyValueFactory<>("location"));
        datecol.setCellValueFactory(new PropertyValueFactory<>("date"));



    }

    @javafx.fxml.FXML
    public void addLogButton(ActionEvent actionEvent) {
        String name = nameTextField.getText();
        String logId = logIdTextField.getText();
        String date1 = String.valueOf(date.getValue());
        String location = locationTextField.getText();



        AccessSequrityLogsModelClass s = accessTableview.getSelectionModel().getSelectedItem();

        if (nameTextField.getText().isEmpty()) {
            accessSequrityLogsLabel.setText("Pleaea provide your name");
            return;

        }
        if (logIdTextField.getText().isEmpty()) {
            accessSequrityLogsLabel.setText("Please provide your Id");
            return;
        }
        if (locationTextField.getText().isEmpty()){
            accessSequrityLogsLabel.setText("Provide location");
            return;
        }
        if (date.getValue() == null){
            accessSequrityLogsLabel.setText("Provide date");
            return;
        }

        AccessSequrityLogsModelClass addTable = new AccessSequrityLogsModelClass(name,logId,location,date1);


        accessTableview.getItems().add(addTable);

        // Clear input
        logIdTextField.clear();
        nameTextField.clear();
        date.setValue(null);
        locationTextField.clear();
        accessSequrityLogsLabel.setText("Successful!");
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent)throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Reya/securityOfficerDashboard.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void saveButton(ActionEvent actionEvent) {
        try {
            saveList();
            accessSequrityLogsLabel.setText("Data saved successfully!");
        } catch (RuntimeException e) {
            accessSequrityLogsLabel.setText(e.getMessage());
        }
    }
}