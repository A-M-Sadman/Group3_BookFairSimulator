package com.groupthree.group3_bookfairsimulator.Fahim;

import java.time.LocalDate;
import java.util.ArrayList;

public class Event {
    private String title;
    private LocalDate date;
    private String time;
    private String location;
    public static ArrayList<Event> eventList = new ArrayList();

    public Event(String title, LocalDate date, String time, String location) {
        this.title = title;
        this.date = date;
        this.time = time;
        this.location = location;
    }

    public Event() {
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

    @Override
    public String toString() {
        return "Event{" +
                "title='" + title + '\'' +
                ", date=" + date +
                ", time='" + time + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
