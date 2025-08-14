package com.groupthree.group3_bookfairsimulator.AbdullahMohammadSadman;

import java.io.*;
import java.util.ArrayList;

public class ReportManager {
    private static final String fileName = "Data/Report.bin";

    protected static ArrayList<Report> reportList = new ArrayList<>();

    static {
        reportList.addAll(getReportList());
    }

    private static ArrayList<Report> getReportList() {

        ArrayList<Report> reports = new ArrayList<>();

        try (ObjectInputStream stream = new ObjectInputStream(new FileInputStream(fileName))) {
            reports = (ArrayList<Report>) stream.readObject();
        } catch (InvalidClassException | ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return reports;
    }

    public static void saveReportList() {
        try (ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream(fileName))) {
            ArrayList<Report> tempList = new ArrayList<>(reportList);
            stream.writeObject(tempList);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Could not save data to file");
        }
    }

    public static void resetReportList() {
        reportList.clear();
        saveReportList();
    }
}
