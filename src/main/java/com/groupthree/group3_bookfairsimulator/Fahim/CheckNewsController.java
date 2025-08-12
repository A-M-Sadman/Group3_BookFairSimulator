package com.groupthree.group3_bookfairsimulator.Fahim;

import com.groupthree.group3_bookfairsimulator.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

import static com.groupthree.group3_bookfairsimulator.Fahim.NewsManager.newsList;

public class CheckNewsController
{
    @javafx.fxml.FXML
    private TextArea textarea;
    @javafx.fxml.FXML
    private TextField newstextfild;
    @javafx.fxml.FXML
    private Label lable;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void dashbord(ActionEvent actionEvent) throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Fahim/visitor.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setScene(scene);
    }

    @javafx.fxml.FXML
    public void seeUpdateNews(ActionEvent actionEvent) {
        if (newstextfild.getText().isEmpty()) {
            lable.setText("Please enter a news title");
            return;
        }

        for (News news : newsList) {
            if (news.getTitle().equals(newstextfild.getText())) {
                textarea.setText(news.getContent());
                lable.setText("News found");
                return;
            }
        }

        lable.setText("No news found with that title");
        textarea.clear();
    }



    @javafx.fxml.FXML
    public void back(ActionEvent actionEvent) throws IOException {
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Fahim/MeetAuthor.fxml"));
        Scene scene = new Scene(root);
        HelloApplication.stage.setScene(scene);
    }
}