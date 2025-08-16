package com.groupthree.group3_bookfairsimulator.Reya;

import com.groupthree.group3_bookfairsimulator.HelloApplication;
import com.groupthree.group3_bookfairsimulator.Sami.Eventmanagement;
import com.groupthree.group3_bookfairsimulator.Sami.bookListing;
import com.groupthree.group3_bookfairsimulator.Sami.bookListingManager;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Camera;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

import java.io.*;
import java.util.ArrayList;

import static com.groupthree.group3_bookfairsimulator.Sami.bookListingManager.saveList;

public class RealTimeSurvillance
{
    @javafx.fxml.FXML
    private TableColumn<RealTimeSurvillance,String> locationCol;
    @javafx.fxml.FXML
    private TableColumn<realTimeSurvilance,String> dateCol;
    @javafx.fxml.FXML
    private ComboBox<String> accessCCTVcombo;
    @javafx.fxml.FXML
    private DatePicker datePicker;
    @javafx.fxml.FXML
    private TextField cameraTextField;
    @javafx.fxml.FXML
    private TextField descriptionTextField;
    @javafx.fxml.FXML
    private TableView<realTimeSurvilance> table;
    @javafx.fxml.FXML
    private TableColumn<realTimeSurvilance,String> caneraCol;
    @javafx.fxml.FXML
    private Label realTimeSurvillanceLabel;
    @javafx.fxml.FXML
    private TableColumn<realTimeSurvilance,String> bookIDCol;
    private static final String data = "Data/survillance.bin";

    public static final ArrayList<realTimeSurvilance> realTimeSurvilances1 = new ArrayList<>();

    static {
        realTimeSurvilances1.addAll(getServailanceList());
    }

    static ArrayList<realTimeSurvilance> getServailanceList() {
        ArrayList<realTimeSurvilance> realTimeSurvilances1 = new ArrayList<>();

        File file = new File(data);
        if (!file.exists()) {
            return realTimeSurvilances1;
        }

        try (ObjectInputStream stream = new ObjectInputStream(
                new FileInputStream(file)
        )) {
            realTimeSurvilances1 = (ArrayList<realTimeSurvilance>) stream.readObject();
        } catch (EOFException e) {


        } catch (InvalidClassException | ClassNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException("Invalid file format please delete file and try again.");
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Error reading book list from file!");
        }

        return realTimeSurvilances1;
    }
    public static void saveSurvailence() {
        try (ObjectOutputStream stream = new ObjectOutputStream(
                new FileOutputStream(data)
        )) {
            stream.writeObject(new ArrayList<>(realTimeSurvilances1));
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Could not save book list to file!");
        }
    }
    public static void resetSurvailanceList() {
        realTimeSurvilances1.clear();
        saveSurvailence();
    }




    @javafx.fxml.FXML
    public void initialize() {
        locationCol.setCellValueFactory(new PropertyValueFactory<>("location"));
        caneraCol.setCellValueFactory(new PropertyValueFactory<>("cameraId"));
        dateCol.setCellValueFactory(new PropertyValueFactory<>("date"));
        accessCCTVcombo.getItems().addAll("Bangla Academy Pavilion Zone","Suhrawardy Udyan Stalls Zone","Little Magazine Corner Zone","Children's Corner","TSC","Doyel Chattar","Food Court");

        table.getItems().addAll(realTimeSurvilances1);
    }

    @javafx.fxml.FXML
    public void flagButton(ActionEvent actionEvent) {
        String CCTV = accessCCTVcombo.getValue();
        String cameraID = cameraTextField.getText();
        String date = String.valueOf(datePicker.getValue());
        String description = descriptionTextField.getText();


        realTimeSurvilance s = table.getSelectionModel().getSelectedItem();
        if (accessCCTVcombo.getValue() == null){
            realTimeSurvillanceLabel.setText("Set the CCTV access");
            return;

        }
        if (cameraTextField.getText().isEmpty()){
            realTimeSurvillanceLabel.setText("Please provide the camera ID");
            return;
        }
        if (datePicker.getValue() == null){
            realTimeSurvillanceLabel.setText("Please select the date");
            return;
        }
        if (descriptionTextField.getText().isEmpty()){
            realTimeSurvillanceLabel.setText("Please write the description");
            return;
        }
        realTimeSurvilance addTable = new realTimeSurvilance(CCTV,cameraID,date,description);


        realTimeSurvilances1.add(addTable);
        table.getItems().clear();
        table.getItems().addAll(realTimeSurvilances1);

        // Clear input
        accessCCTVcombo.getSelectionModel().clearSelection();
        cameraTextField.clear();
        datePicker.setValue(null);
        descriptionTextField.clear();
        realTimeSurvillanceLabel.setText("Successful!");



    }

    @javafx.fxml.FXML
    public void dashboardButton(ActionEvent actionEvent)throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Reya/securityOfficerDashboard.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setScene(scene);

    }

    @javafx.fxml.FXML
    public void saveButton(ActionEvent actionEvent) {
        try {
            saveList();
            realTimeSurvillanceLabel.setText("Data saved successfully!");
        } catch (RuntimeException e) {
            realTimeSurvillanceLabel.setText(e.getMessage());
        }
    }
}