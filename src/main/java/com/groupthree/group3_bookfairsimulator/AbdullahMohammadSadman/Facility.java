package com.groupthree.group3_bookfairsimulator.AbdullahMohammadSadman;

import java.util.ArrayList;

public class Facility {
    private String facility;
    private String status;

    protected static ArrayList<Facility> facilityList = new ArrayList<>();

    public Facility(String facility, String status) {
        this.facility = facility;
        this.status = status;
    }

    public String getFacility() {
        return facility;
    }

    public void setFacility(String facility) {
        this.facility = facility;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "facility='" + facility + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
