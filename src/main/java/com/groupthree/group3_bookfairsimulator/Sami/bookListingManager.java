package com.groupthree.group3_bookfairsimulator.Sami;

import javafx.scene.control.TableColumn;

import java.io.*;
import java.util.ArrayList;

public class bookListingManager {
    @javafx.fxml.FXML
        private static final String fileName = "Data/manageBook.bin";
        public static final ArrayList<bookListing> bookListings = new ArrayList<>();


        static {
            bookListings.addAll(getBookListings());
        }

        private static ArrayList<bookListing> getBookListings() {

            ArrayList<bookListing> abookList = new ArrayList<>();

            try (ObjectInputStream stream = new ObjectInputStream(new FileInputStream(fileName))) {
                abookList = (ArrayList<bookListing>) stream.readObject();
            } catch (InvalidClassException | ClassNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return abookList;
        }

        public static void saveList() {
            try (ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream(fileName))) {
                ArrayList<bookListing> tempList = new ArrayList<>(bookListings);
                stream.writeObject(tempList);
            } catch (IOException e) {
                e.printStackTrace();
                throw new RuntimeException("Could not save data to file");
            }
        }

        public static void resetBookListings() {
            bookListings.clear();
            saveList();
        }
    }



