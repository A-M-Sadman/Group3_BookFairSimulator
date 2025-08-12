package com.groupthree.group3_bookfairsimulator.Fahim;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class meetAuthorManager {
    private static final String fileName = "Data/Author.bin";

    public static ArrayList<meetAuthor> meetauthorList = new ArrayList<>();
    public static ArrayList<meetAuthor> registerlist = new ArrayList<>();
    static {
        meetauthorList.addAll(getmeetAuthorList());
    }

    private static ArrayList<meetAuthor> getmeetAuthorList() {

        ArrayList<meetAuthor> meetAothorsList = new ArrayList<>();

        try (ObjectInputStream stream = new ObjectInputStream(new FileInputStream(fileName))) {
            meetAothorsList = (ArrayList<meetAuthor>) stream.readObject();
        } catch (InvalidClassException | ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return meetAothorsList;
    }

    public static void savemeetAuthorList() {
        try (ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream(fileName))) {
            ArrayList<meetAuthor> tempList = new ArrayList<>(meetauthorList);
            stream.writeObject(tempList);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Could not save data to file");
        }
    }

    public static void resetauthorList() {
        meetauthorList.clear();
        savemeetAuthorList();
    }
}

