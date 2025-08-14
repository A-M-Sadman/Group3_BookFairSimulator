package com.groupthree.group3_bookfairsimulator.AbdullahMohammadSadman;

import java.io.*;
import java.util.ArrayList;

public class CustomerQueryManager {
    private static final String fileName = "Data/CustomerQuery.bin";

    public static final ArrayList<CustomerQuery> queryList = new ArrayList<>();

    static {
        queryList.addAll(getQueryList());
    }

    private static ArrayList<CustomerQuery> getQueryList() {

        ArrayList<CustomerQuery> queryList = new ArrayList<>();

        try (ObjectInputStream stream = new ObjectInputStream(new FileInputStream(fileName))) {
            queryList = (ArrayList<CustomerQuery>) stream.readObject();
        } catch (InvalidClassException | ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return queryList;
    }

    public static void saveQueryList() {
        try (ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream(fileName))) {
            ArrayList<CustomerQuery> tempList = new ArrayList<>(queryList);
            stream.writeObject(tempList);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Could not save data to file");
        }
    }

    public static void resetBookList() {
        queryList.clear();
        saveQueryList();
    }
}
