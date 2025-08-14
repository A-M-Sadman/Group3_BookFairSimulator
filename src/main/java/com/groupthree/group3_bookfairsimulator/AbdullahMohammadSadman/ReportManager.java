package com.groupthree.group3_bookfairsimulator.AbdullahMohammadSadman;

import java.io.*;
import java.util.ArrayList;

public class ReportManager {
    private static final String fileName = "Data/Report.bin";

    protected static ArrayList<Report> reportList = new ArrayList<>();

    static {
        taskList.addAll(getTaskList());
    }

    private static ArrayList<Task> getTaskList() {

        ArrayList<Task> taskList = new ArrayList<>();

        try (ObjectInputStream stream = new ObjectInputStream(new FileInputStream(fileName))) {
            taskList = (ArrayList<Task>) stream.readObject();
        } catch (InvalidClassException | ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return taskList;
    }

    public static void saveTaskList() {
        try (ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream(fileName))) {
            ArrayList<Task> tempList = new ArrayList<>(taskList);
            stream.writeObject(tempList);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Could not save data to file");
        }
    }

    public static void resetTaskList() {
        taskList.clear();
        saveTaskList();
    }
}
