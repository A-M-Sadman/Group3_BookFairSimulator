package com.groupthree.group3_bookfairsimulator.AbdullahMohammadSadman;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class BookManager {
    private static final String fileName = "Data/book.bin";

    public static final ArrayList<Book> bookList = new ArrayList<>();
    static {
        bookList.addAll(getBookList());
    }

    private static ArrayList<Book> getBookList() {

        ArrayList<Book> abookList = new ArrayList<>();

        try (ObjectInputStream stream = new ObjectInputStream(new FileInputStream(fileName))) {
            abookList = (ArrayList<Book>) stream.readObject();
        } catch (InvalidClassException | ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return abookList;
    }

    public static void saveBookList() {
        try (ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream(fileName))) {
            ArrayList<Book> tempList = new ArrayList<>(bookList);
            stream.writeObject(tempList);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Could not save data to file");
        }
    }

    public static void resetBookList() {
        bookList.clear();
        saveBookList();
    }
}
