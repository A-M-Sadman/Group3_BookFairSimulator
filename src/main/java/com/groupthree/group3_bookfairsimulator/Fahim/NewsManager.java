package com.groupthree.group3_bookfairsimulator.Fahim;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class NewsManager {
    private static final String fileName = "Data/News.bin";

    public static ArrayList<News> newsList = new ArrayList<>();
    static {
        newsList.addAll(getNewsList());
    }

    private static ArrayList<News> getNewsList() {

        ArrayList<News> newslist = new ArrayList<>();

        try (ObjectInputStream stream = new ObjectInputStream(new FileInputStream(fileName))) {
            newslist = (ArrayList<News>) stream.readObject();
        } catch (InvalidClassException | ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return newslist;
    }

    public static void saveNewsList() {
        try (ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream(fileName))) {
            ArrayList<News> tempList = new ArrayList<>(newsList);
            stream.writeObject(tempList);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Could not save data to file");
        }
    }

    public static void resetEventList() {
        newsList.clear();
        saveNewsList();
    }
}


