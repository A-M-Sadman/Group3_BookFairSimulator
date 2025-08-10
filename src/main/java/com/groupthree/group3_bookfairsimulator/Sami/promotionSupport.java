package com.groupthree.group3_bookfairsimulator.Sami;

import java.util.ArrayList;

public class promotionSupport {
    private String bookID;
    private String bookTitle;
    private String PromotionalType;
    public static ArrayList<promotionSupport> promotionSupports = new ArrayList<>();

    public promotionSupport(String bookID, String bookTitle, String promotionalType) {
        this.bookID = bookID;
        this.bookTitle = bookTitle;
        PromotionalType = promotionalType;
    }

    public String getBookID() {
        return bookID;
    }

    public void setBookID(String bookID) {
        this.bookID = bookID;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getPromotionalType() {
        return PromotionalType;
    }

    public void setPromotionalType(String promotionalType) {
        PromotionalType = promotionalType;
    }

    public static ArrayList<promotionSupport> getPromotionSupports() {
        return promotionSupports;
    }

    public static void setPromotionSupports(ArrayList<promotionSupport> promotionSupports) {
        promotionSupport.promotionSupports = promotionSupports;
    }

    @Override
    public String toString() {
        return "promotionSupport{" +
                "bookID='" + bookID + '\'' +
                ", bookTitle='" + bookTitle + '\'' +
                ", PromotionalType='" + PromotionalType + '\'' +
                '}';
    }
}
