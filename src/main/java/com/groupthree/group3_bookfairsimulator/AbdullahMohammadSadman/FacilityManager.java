package com.groupthree.group3_bookfairsimulator.AbdullahMohammadSadman;

import java.io.*;
import java.util.ArrayList;

public class FacilityManager {
    private static final String fileName = "Data/Facility.bin";

    public static final ArrayList<Facility> facilityList = new ArrayList<>();
    static {
        facilityList.addAll(getFacilityList());
    }

    private static ArrayList<Facility> getFacilityList() {

        ArrayList<Facility> facilities = new ArrayList<>();

        try (ObjectInputStream stream = new ObjectInputStream(new FileInputStream(fileName))) {
            facilities = (ArrayList<Facility>) stream.readObject();
        } catch (InvalidClassException | ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return facilities;
    }

    public static void saveFacilityList() {
        try (ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream(fileName))) {
            ArrayList<Facility> tempList = new ArrayList<>(facilityList);
            stream.writeObject(tempList);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Could not save data to file");
        }
    }

    public static void resetFacilityList() {
        facilityList.clear();
        saveFacilityList();
    }
}
