package com.groupthree.group3_bookfairsimulator.Sami;

import java.util.ArrayList;
import java.util.List;

public class visitorFeedback {
    private String visitorID, visitorName, bookTitle, feedback, rating;
    private static List<visitorFeedback> feedbackList = new ArrayList<>();

    public visitorFeedback(String visitorID, String visitorName, String bookTitle, String feedback, String rating) {
        this.visitorID = visitorID;
        this.visitorName = visitorName;
        this.bookTitle = bookTitle;
        this.feedback = feedback;
        this.rating = rating;
    }



    public String getVisitorID() {
        return visitorID;
    }

    public void setVisitorID(String visitorID) {
        this.visitorID = visitorID;
    }

    public String getVisitorName() {
        return visitorName;
    }

    public void setVisitorName(String visitorName) {
        this.visitorName = visitorName;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public static List<visitorFeedback> getFeedbackList() {
        return feedbackList;
    }

    public static void setFeedbackList(List<visitorFeedback> feedbackList) {
        visitorFeedback.feedbackList = feedbackList;
    }

    @Override
    public String toString() {
        return "visitorFeedback{" +
                "visitorID='" + visitorID + '\'' +
                ", visitorName='" + visitorName + '\'' +
                ", bookTitle='" + bookTitle + '\'' +
                ", feedback='" + feedback + '\'' +
                ", rating='" + rating + '\'' +
                '}';
    }
}
