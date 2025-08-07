package com.groupthree.group3_bookfairsimulator.Fahim;

import java.util.ArrayList;

public class stall {
    private String name;
    private int number;
    private String cetagory;
    private String location;

    public stall(String name, int number, String cetagory, String location) {
        this.name = name;
        this.number = number;
        this.cetagory = cetagory;
        this.location = location;
    }
    public static ArrayList<stall> stallList = new ArrayList<stall>();

    public stall() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getCetagory() {
        return cetagory;
    }

    public void setCetagory(String cetagory) {
        this.cetagory = cetagory;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "stall{" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", cetagory='" + cetagory + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
