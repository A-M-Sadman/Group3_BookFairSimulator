package com.groupthree.group3_bookfairsimulator.Sami;

import java.util.ArrayList;
import java.io.Serializable;

public class promotionSupport implements Serializable{
    private String bookID;
    private String bookTitle;
    private String PromotionalType;


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



    @Override
    public String toString() {
        return "promotionSupport{" +
                "bookID='" + bookID + '\'' +
                ", bookTitle='" + bookTitle + '\'' +
                ", PromotionalType='" + PromotionalType + '\'' +
                '}';
    }
}
