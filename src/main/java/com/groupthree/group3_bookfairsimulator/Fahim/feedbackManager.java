package com.groupthree.group3_bookfairsimulator.Fahim;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class feedbackManager {
    private static final String fileName = "Data/feedback.bin";

    public static ArrayList<feedBack> feedbackList = new ArrayList<>();
    static {
        feedbackList.addAll(getfeedbackList());
    }

    private static ArrayList<feedBack> getfeedbackList() {

        ArrayList<feedBack> feedbacksList = new ArrayList<>();

        try (ObjectInputStream stream = new ObjectInputStream(new FileInputStream(fileName))) {
            feedbacksList = (ArrayList<feedBack>) stream.readObject();
        } catch (InvalidClassException | ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return feedbacksList;
    }

    public static void savefeedbackList() {
        try (ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream(fileName))) {
            ArrayList<feedBack> tempList = new ArrayList<>(feedbackList);
            stream.writeObject(tempList);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Could not save data to file");
        }
    }

    public static void resetfeedbackList() {
        feedbackList.clear();
        savefeedbackList();
    }
}


