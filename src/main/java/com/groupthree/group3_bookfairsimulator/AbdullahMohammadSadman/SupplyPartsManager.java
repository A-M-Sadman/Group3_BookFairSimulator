package com.groupthree.group3_bookfairsimulator.AbdullahMohammadSadman;

import java.io.*;
import java.util.ArrayList;

public class SupplyPartsManager {
    protected static ArrayList<SupplyParts> supplyList = new ArrayList<>();

    private static final String fileName = "Data/SupplyParts.bin";

    static {
        supplyList.addAll(getSupplyList());
    }

    private static ArrayList<SupplyParts> getSupplyList() {

        ArrayList<SupplyParts> supplyList = new ArrayList<>();

        try (ObjectInputStream stream = new ObjectInputStream(new FileInputStream(fileName))) {
            supplyList = (ArrayList<SupplyParts>) stream.readObject();
        } catch (InvalidClassException | ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return supplyList;
    }

    public static void saveSupplyList() {
        try (ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream(fileName))) {
            ArrayList<SupplyParts> tempList = new ArrayList<>(supplyList);
            stream.writeObject(tempList);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Could not save data to file");
        }
    }

    public static void resetSupplyList() {
        supplyList.clear();
        saveSupplyList();
    }
}
