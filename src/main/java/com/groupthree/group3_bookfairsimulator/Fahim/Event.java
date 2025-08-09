package com.groupthree.group3_bookfairsimulator.Fahim;

import java.time.LocalDate;
import java.util.ArrayList;

public class Event {
    private String title;
    private LocalDate date;
    private String time;
    private String location;
    private String parName;

    public Event(String title, LocalDate date, String time, String location) {
        this.title = title;
        this.date = date;
        this.time = time;
        this.location = location;
    }

    public static ArrayList<Event> eventList = new ArrayList<>();
    public static ArrayList<Event> joinList = new ArrayList<>();

    public Event() {
    }

    public static void add(Event b) {
        eventList.add(b);
    }

    public static void addJoin(Event b) {
        joinList.add(b);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getParName() {
        return parName;
    }

    public void setParName(String parName) {
        this.parName = parName;
    }

    @Override
    public String toString() {
        return "Event{" +
                "title='" + title + '\'' +
                ", date=" + date +
                ", time='" + time + '\'' +
                ", location='" + location + '\'' +
                ", parName='" + parName + '\'' +
                '}';
    }
}
