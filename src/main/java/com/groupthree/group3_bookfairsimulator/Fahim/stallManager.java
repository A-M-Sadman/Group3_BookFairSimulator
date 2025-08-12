package com.groupthree.group3_bookfairsimulator.Fahim;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class stallManager {
    private static final String fileName = "Data/stall.bin";

    public static ArrayList<stall> stallList = new ArrayList<stall>();
    static {
        stallList.addAll(getstallList());
    }

    private static ArrayList<stall> getstallList() {

        ArrayList<stall> stallsList = new ArrayList<>();

        try (ObjectInputStream stream = new ObjectInputStream(new FileInputStream(fileName))) {
            stallsList = (ArrayList<stall>) stream.readObject();
        } catch (InvalidClassException | ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stallsList;
    }

    public static void savestallList() {
        try (ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream(fileName))) {
            ArrayList<stall> tempList = new ArrayList<>(stallList);
            stream.writeObject(tempList);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Could not save data to file");
        }
    }

    public static void resetEventList() {
        stallList.clear();
        savestallList();
    }
}


