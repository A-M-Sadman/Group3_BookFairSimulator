package com.groupthree.group3_bookfairsimulator.Fahim;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class EventManager {
    private static final String fileName = "Data/Event.bin";

    public static ArrayList<Event> eventList = new ArrayList<>();
    public static ArrayList<Event> joinList = new ArrayList<>();
    static {
        eventList.addAll(getEventList());
    }

    private static ArrayList<Event> getEventList() {

        ArrayList<Event> eventsList = new ArrayList<>();

        try (ObjectInputStream stream = new ObjectInputStream(new FileInputStream(fileName))) {
            eventsList = (ArrayList<Event>) stream.readObject();
        } catch (InvalidClassException | ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return eventsList;
    }

    public static void saveEventList() {
        try (ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream(fileName))) {
            ArrayList<Event> tempList = new ArrayList<>(eventList);
            stream.writeObject(tempList);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Could not save data to file");
        }
    }

    public static void resetEventList() {
        eventList.clear();
        saveEventList();
    }
}

