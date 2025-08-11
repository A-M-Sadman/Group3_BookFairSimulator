package com.groupthree.group3_bookfairsimulator.Reya;

import java.util.ArrayList;

public class realTimeSurvilance {
    private String location;
    private String cameraId;
    private String date;
    public static ArrayList<realTimeSurvilance> realTimeSurvilances = new ArrayList<>();

    public realTimeSurvilance(String location, String cameraId, String date, String description) {
        this.location = location;
        this.cameraId = cameraId;
        this.date = date;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCameraId() {
        return cameraId;
    }

    public void setCameraId(String cameraId) {
        this.cameraId = cameraId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public static ArrayList<realTimeSurvilance> getRealTimeSurvilances() {
        return realTimeSurvilances;
    }

    public static void setRealTimeSurvilances(ArrayList<realTimeSurvilance> realTimeSurvilances) {
        realTimeSurvilance.realTimeSurvilances = realTimeSurvilances;
    }

    @Override
    public String toString() {
        return "realTimeSurvilance{" +
                "location='" + location + '\'' +
                ", cameraId='" + cameraId + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
