package com.groupthree.group3_bookfairsimulator.Sami;

import java.util.ArrayList;
import java.io.Serializable;

public class Stallreservation implements Serializable  {
    private String stallNumber;
    private String contactNumber;
    private String size;
    private String cost;
    public static ArrayList<Stallreservation> stallreservations = new ArrayList<>();

    public Stallreservation(String stallNumber, String contactNumber, String size, String cost) {
        this.stallNumber = stallNumber;
        this.contactNumber = contactNumber;
        this.size = size;
        this.cost = cost;
    }

    public String getStallNumber() {
        return stallNumber;
    }

    public void setStallNumber(String stallNumber) {
        this.stallNumber = stallNumber;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public static ArrayList<Stallreservation> getStallreservations() {
        return stallreservations;
    }

    public static void setStallreservations(ArrayList<Stallreservation> stallreservations) {
        Stallreservation.stallreservations = stallreservations;
    }

    @Override
    public String toString() {
        return "Stallreservation{" +
                "stallNumber='" + stallNumber + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                ", size='" + size + '\'' +
                ", cost='" + cost + '\'' +
                '}';
    }
}
