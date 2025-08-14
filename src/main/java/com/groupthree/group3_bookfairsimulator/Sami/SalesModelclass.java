package com.groupthree.group3_bookfairsimulator.Sami;

import java.util.ArrayList;

public class SalesModelclass {
    private String title;
    private String copies;
    private String revenue;
    private String topSelling;

    public static ArrayList<SalesModelclass> salesModelclasses = new ArrayList<>();


    public SalesModelclass(String title, String copies, String revenue) {
        this.title = title;
        this.copies = copies;
        this.revenue = revenue;
        this.topSelling = topSelling;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCopies() {
        return copies;
    }

    public void setCopies(String copies) {
        this.copies = copies;
    }

    public String getRevenue() {
        return revenue;
    }

    public void setRevenue(String revenue) {
        this.revenue = revenue;
    }

    public String getTopSelling() {
        return topSelling;
    }

    public void setTopSelling(String topSelling) {
        this.topSelling = topSelling;
    }

    public static ArrayList<SalesModelclass> getSalesModelclasses() {
        return salesModelclasses;
    }

    public static void setSalesModelclasses(ArrayList<SalesModelclass> salesModelclasses) {
        SalesModelclass.salesModelclasses = salesModelclasses;
    }

    @Override
    public String toString() {
        return "SalesModelclass{" +
                "title='" + title + '\'' +
                ", copies='" + copies + '\'' +
                ", revenue='" + revenue + '\'' +
                ", topSelling='" + topSelling + '\'' +
                '}';
    }
}
