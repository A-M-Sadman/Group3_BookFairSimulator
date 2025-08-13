package com.groupthree.group3_bookfairsimulator.Fahim;

import java.io.*;
import java.util.ArrayList;

public class meetAuthorManager {
    private static final String fileName = "Data/Author.bin";
    private static final String rfileName = "Data/RegisterAuthors.bin";

    public static ArrayList<meetAuthor> meetauthorList = new ArrayList<>();
    public static ArrayList<meetAuthor> registerlist = new ArrayList<>();

    static {
        meetauthorList.addAll(getmeetAuthorList());
        registerlist.addAll(getRegisterList());
    }

    private static ArrayList<meetAuthor> getmeetAuthorList() {
        ArrayList<meetAuthor> list = new ArrayList<>();
        try (ObjectInputStream stream = new ObjectInputStream(new FileInputStream(fileName))) {
            list = (ArrayList<meetAuthor>) stream.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public static ArrayList<meetAuthor> getRegisterList() {
        ArrayList<meetAuthor> list = new ArrayList<>();
        try (ObjectInputStream stream = new ObjectInputStream(new FileInputStream(rfileName))) {
            list = (ArrayList<meetAuthor>) stream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return list;
    }


    public static void savemeetAuthorList() {
        try (ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream(fileName))) {
            stream.writeObject(new ArrayList<>(meetauthorList));
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Could not save data to file");
        }
    }

    public static void saveregisterList() {
        try (ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream(rfileName))) {
            stream.writeObject(new ArrayList<>(registerlist));
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Could not save registered authors");
        }
    }

    public static void resetauthorList() {
        meetauthorList.clear();
        savemeetAuthorList();
    }

    public static void resetregisterList() {
        registerlist.clear();
        saveregisterList();
    }
}
