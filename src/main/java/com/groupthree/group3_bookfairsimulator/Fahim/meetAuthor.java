package com.groupthree.group3_bookfairsimulator.Fahim;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;

public class meetAuthor implements Serializable {
    private String name;
    private String time;
    private LocalDate date;

    public meetAuthor(String name, String time, LocalDate date) {
        this.name = name;
        this.time = time;
        this.date = date;
    }



    public meetAuthor() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "meetAuthor{" +
                "name='" + name + '\'' +
                ", time='" + time + '\'' +
                ", date=" + date +
                '}';
    }
}
