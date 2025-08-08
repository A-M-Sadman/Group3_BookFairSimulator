package com.groupthree.group3_bookfairsimulator.AbdullahMohammadSadman;

import java.io.*;
import java.util.ArrayList;

public class BookManager {
    private static final String fileName = "Data/book.bin";

    static ArrayList<Book> getBookList() {
        ArrayList<Book> abookList = new ArrayList<>();

        try (ObjectInputStream stream = new ObjectInputStream(new FileInputStream(fileName))) {
            abookList = (ArrayList<Book>) stream.readObject();
            return abookList;
        } catch (InvalidClassException | ClassNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException("Invalid Data");
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Error reading from file");
        }
    }

    public static void saveBookList(ArrayList<Book> abookList) {
        try (ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream(fileName))) {
//            ArrayList<Book> tempList = new ArrayList<>(abookList);
            stream.writeObject(new ArrayList<>(abookList));
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Could not save data to file");
        }
    }
}
