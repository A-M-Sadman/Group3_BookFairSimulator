package com.groupthree.group3_bookfairsimulator.Fahim;

import com.groupthree.group3_bookfairsimulator.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

import static com.groupthree.group3_bookfairsimulator.Fahim.addspeakerManager.speakerList;

public class AddSpeakerController {
    @javafx.fxml.FXML
    private TableColumn<addspeaker,String> topicCol;
    @javafx.fxml.FXML
    private TableView<addspeaker> tableViwe;
    @javafx.fxml.FXML
    private TableColumn<addspeaker,String> linkCol;
    @javafx.fxml.FXML
    private TableColumn<addspeaker,String> speakercol;
    @javafx.fxml.FXML
    private Label lable;
    @javafx.fxml.FXML
    private TextField topicText;
    @javafx.fxml.FXML
    private TextField nametext;
    @javafx.fxml.FXML
    private ComboBox<String> comboBox;
    @javafx.fxml.FXML
    private ComboBox<String> comboBox1;
    @javafx.fxml.FXML
    private TextField filterName;

    @javafx.fxml.FXML
    public void initialize() {
        speakercol.setCellValueFactory(new PropertyValueFactory<>("speakerName"));
        topicCol.setCellValueFactory(new PropertyValueFactory<>("topic"));
        linkCol.setCellValueFactory(new PropertyValueFactory<>("eLink"));


        comboBox.getItems().addAll(
                "Opening Ceremony - 1 February",
                "Children's Literature Session",
                "Poetry Recitation Evening",
                "Book Launch: Modern Bangla Literature",
                "Author Meet & Greet",
                "Science & Technology Books Discussion",
                "Tribute to Humayun Ahmed",
                "Women Writers’ Forum",
                "Translation & Global Literature Panel",
                "Bangla Language Preservation Discussion",
                "Cultural Evening: Songs & Dance",
                "Youth Writers' Dialogue",
                "Art & Illustration in Books",
                "Closing Ceremony - 28 February",
                "Others"
        );
        comboBox1.getItems().addAll(
                "Opening Ceremony - 1 February",
                "Children's Literature Session",
                "Poetry Recitation Evening",
                "Book Launch: Modern Bangla Literature",
                "Author Meet & Greet",
                "Science & Technology Books Discussion",
                "Tribute to Humayun Ahmed",
                "Women Writers’ Forum",
                "Translation & Global Literature Panel",
                "Bangla Language Preservation Discussion",
                "Cultural Evening: Songs & Dance",
                "Youth Writers' Dialogue",
                "Art & Illustration in Books",
                "Closing Ceremony - 28 February",
                "Others"
        );

        if (speakerList.isEmpty()) {
            speakerList.add(new addspeaker("Humayun Ahmed", "Modern Bangla Fiction", "Tribute to Humayun Ahmed"));
            speakerList.add(new addspeaker("Selina Hossain", "Women’s Role in Literature", "Women Writers’ Forum"));
            speakerList.add(new addspeaker("Anisul Hoque", "Contemporary Storytelling", "Book Launch: Modern Bangla Literature"));
            speakerList.add(new addspeaker("Muhammed Zafar Iqbal", "Science Fiction & Youth", "Science & Technology Books Discussion"));
            speakerList.add(new addspeaker("Syed Manzoorul Islam", "Translation & World Literature", "Translation & Global Literature Panel"));
        }

        tableViwe.getItems().setAll(speakerList);
    }

    @javafx.fxml.FXML
    public void next(ActionEvent actionEvent) throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Fahim/ChangeEventTime.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void dashbord(ActionEvent actionEvent) throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Fahim/EventManager.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void back(ActionEvent actionEvent) throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Fahim/AddNewEvent.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void addSpeaker(ActionEvent actionEvent) {
        if (nametext.getText().isEmpty() || topicText.getText().isEmpty() || comboBox.getValue() == null) {
            lable.setText("Please fill in all fields!");
            return;
        }

        addspeaker a = new addspeaker(
                nametext.getText(),
                topicText.getText(),
                comboBox.getValue()
        );
        speakerList.add(a);

        tableViwe.getItems().setAll(speakerList);

        nametext.clear();
        topicText.clear();
        comboBox.getSelectionModel().clearSelection();
        lable.setText("Speaker added successfully!");
    }


    @javafx.fxml.FXML
    public void filter(ActionEvent actionEvent) {
        tableViwe.getItems().clear();
        for (addspeaker a : speakerList){
            if (a.getSpeakerName().equals(filterName.getText()) && (a.getELink().equals(comboBox1.getValue()))){
                tableViwe.getItems().add(a);
                filterName.clear();
                comboBox1.getSelectionModel().clearSelection();
            }
        }
    }

    @javafx.fxml.FXML
    public void reset(ActionEvent actionEvent) {
        tableViwe.getItems().clear();
        tableViwe.getItems().addAll(speakerList);
    }
}