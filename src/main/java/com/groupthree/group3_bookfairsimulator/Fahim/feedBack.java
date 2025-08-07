package com.groupthree.group3_bookfairsimulator.Fahim;

import java.util.ArrayList;

public class feedBack {
    private String visitorName;
    private String bookName;
    private String stallName;
    private String type;
    private String rating;

    public feedBack(String visitorName, String bookName, String stallName, String type, String rating) {
        this.visitorName = visitorName;
        this.bookName = bookName;
        this.stallName = stallName;
        this.type = type;
        this.rating = rating;
    }
    public static ArrayList<feedBack> feedbackList = new ArrayList<>();

    public feedBack() {
    }

    public String getVisitorName() {
        return visitorName;
    }

    public void setVisitorName(String visitorName) {
        this.visitorName = visitorName;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getStallName() {
        return stallName;
    }

    public void setStallName(String stallName) {
        this.stallName = stallName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "feedBack{" +
                "visitorName='" + visitorName + '\'' +
                ", bookName='" + bookName + '\'' +
                ", stallName='" + stallName + '\'' +
                ", type='" + type + '\'' +
                ", rating='" + rating + '\'' +
                '}';
    }
}
