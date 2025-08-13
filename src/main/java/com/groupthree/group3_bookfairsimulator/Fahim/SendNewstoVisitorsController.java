package com.groupthree.group3_bookfairsimulator.Fahim;

import com.groupthree.group3_bookfairsimulator.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

import static com.groupthree.group3_bookfairsimulator.Fahim.NewsManager.newsList;
import static com.groupthree.group3_bookfairsimulator.Fahim.NewsManager.saveNewsList;

public class SendNewstoVisitorsController {
    @javafx.fxml.FXML
    private Label lable;
    @javafx.fxml.FXML
    private TextField newsTitleTextfild;
    @javafx.fxml.FXML
    private TextArea textArea;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void next(ActionEvent actionEvent) throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Fahim/TalkWithStallOwners.fxml"));
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
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Fahim/SeeWhoJoinedEvent.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void send(ActionEvent actionEvent) {
        if (newsTitleTextfild.getText().isEmpty()) {
            lable.setText("Please Give a Title");
            return;
        }
        if (textArea.getText().isEmpty()) {
            lable.setText("Please Write News Content");
            return;
        }

        for (News a : newsList) {
            if (a.getTitle().equals(newsTitleTextfild.getText())) {
                lable.setText("This Title Already Exists!!!");
                return;
            }
        }

        newsList.add(new News(newsTitleTextfild.getText(), textArea.getText()));
        lable.setText("News Sent Successfully");

        newsTitleTextfild.clear();
        textArea.clear();

        try {
            NewsManager.saveNewsList();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
