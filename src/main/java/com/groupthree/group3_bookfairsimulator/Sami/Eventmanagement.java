package com.groupthree.group3_bookfairsimulator.Sami;

import java.util.ArrayList;

public class Eventmanagement {
    private String eventName;
    private String location;
    private String eventType;
    private String date;

    protected static ArrayList<Eventmanagement> eventmanagements = new ArrayList<>();

    public Eventmanagement(String eventName, String location, String eventType, String date) {
        this.eventName = eventName;
        this.location = location;
        this.eventType = eventType;
        this.date = date;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public static ArrayList<Eventmanagement> getEventmanagements() {
        return eventmanagements;
    }

    public static void setEventmanagements(ArrayList<Eventmanagement> eventmanagements) {
        Eventmanagement.eventmanagements = eventmanagements;
    }

    @Override
    public String toString() {
        return "Eventmanagement{" +
                "eventName='" + eventName + '\'' +
                ", location='" + location + '\'' +
                ", eventType='" + eventType + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
