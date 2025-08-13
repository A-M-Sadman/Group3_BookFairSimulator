package com.groupthree.group3_bookfairsimulator.Fahim;

import java.io.*;
import java.util.ArrayList;

public class EventManager {
    private static final String fileName = "Data/Event.bin";
    private static final String joinFileName = "Data/JoinEvent.bin";

    public static ArrayList<Event> eventList = new ArrayList<>();
    public static ArrayList<Event> joinList = new ArrayList<>();

    static {
        eventList.addAll(getEventList());
        joinList.addAll(getJoinList());
    }

    private static ArrayList<Event> getEventList() {
        ArrayList<Event> eventsList = new ArrayList<>();
        try (ObjectInputStream stream = new ObjectInputStream(new FileInputStream(fileName))) {
            eventsList = (ArrayList<Event>) stream.readObject();
        } catch (InvalidClassException | ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
        }
        return eventsList;
    }

    private static ArrayList<Event> getJoinList() {
        ArrayList<Event> joinEvents = new ArrayList<>();
        try (ObjectInputStream stream = new ObjectInputStream(new FileInputStream(joinFileName))) {
            joinEvents = (ArrayList<Event>) stream.readObject();
        } catch (InvalidClassException | ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
        }
        return joinEvents;
    }

    public static void saveEventList() {
        try (ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream(fileName))) {
            stream.writeObject(new ArrayList<>(eventList));
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Could not save event list to file");
        }
    }

    public static void saveJoinList() {
        try (ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream(joinFileName))) {
            stream.writeObject(new ArrayList<>(joinList));
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Could not save join list to file");
        }
    }

    public static void resetEventList() {
        eventList.clear();
        saveEventList();
    }

    public static void resetJoinList() {
        joinList.clear();
        saveJoinList();
    }
}
