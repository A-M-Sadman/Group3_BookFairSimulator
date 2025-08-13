package com.groupthree.group3_bookfairsimulator.Fahim;

import com.groupthree.group3_bookfairsimulator.AbdullahMohammadSadman.Book;

import java.io.*;
import java.util.ArrayList;

public class ManageEvent {
    private static final String fileName = "Data/Event.bin";

    static ArrayList<Event> getEventlist() {
        ArrayList<Event> eventList2 = new ArrayList<>();

        try (ObjectInputStream stream = new ObjectInputStream(new FileInputStream(fileName))) {
            eventList2 = (ArrayList<Event>) stream.readObject();
            return eventList2;
        } catch (InvalidClassException | ClassNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException("Invalid Data");
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Error reading from file");
        }
    }

    public static void saveEventList(ArrayList<Event> eventList2) {
        try (ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream(fileName))) {
            stream.writeObject(new ArrayList<>(eventList2));
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Could not save data to file");
        }
    }
}

