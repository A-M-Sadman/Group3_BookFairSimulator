package com.groupthree.group3_bookfairsimulator.Sami;

import java.util.ArrayList;

public class bookListing {

    private String title;
    private String bookID;
    private String genre;
    public static ArrayList<bookListing> bookListings = new ArrayList<>();

    public bookListing(String title, String bookID, String genre) {
        this.title = title;
        this.bookID = bookID;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBookID() {
        return bookID;
    }

    public void setBookID(String bookID) {
        this.bookID = bookID;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public static ArrayList<bookListing> getBookListings() {
        return bookListings;
    }

    public static void setBookListings(ArrayList<bookListing> bookListings) {
        bookListing.bookListings = bookListings;
    }

    @Override
    public String toString() {
        return "bookListing{" +
                "title='" + title + '\'' +
                ", bookID='" + bookID + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }
}

