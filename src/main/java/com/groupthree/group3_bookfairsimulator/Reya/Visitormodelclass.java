package com.groupthree.group3_bookfairsimulator.Reya;

import java.util.ArrayList;

public class Visitormodelclass {
    private String visitorName;
    private String ticketNumber;
    private String contactNumber;
    private Integer gateNumber;
    public static ArrayList<Visitormodelclass> visitormodelclasses  = new ArrayList<>();

    public Visitormodelclass(String visitorName, String ticketNumber, String contactNumber, Integer gateNumber) {
        this.visitorName = visitorName;
        this.ticketNumber = ticketNumber;
        this.contactNumber = contactNumber;
        this.gateNumber = gateNumber;
    }

    public String getVisitorName() {
        return visitorName;
    }

    public void setVisitorName(String visitorName) {
        this.visitorName = visitorName;
    }

    public String getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public Integer getGateNumber() {
        return gateNumber;
    }

    public void setGateNumber(Integer gateNumber) {
        this.gateNumber = gateNumber;
    }

    public static ArrayList<Visitormodelclass> getVisitormodelclasses() {
        return visitormodelclasses;
    }

    public static void setVisitormodelclasses(ArrayList<Visitormodelclass> visitormodelclasses) {
        Visitormodelclass.visitormodelclasses = visitormodelclasses;
    }

    @Override
    public String toString() {
        return "Visitormodelclass{" +
                "visitorName='" + visitorName + '\'' +
                ", ticketNumber='" + ticketNumber + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                ", gateNumber=" + gateNumber +
                '}';
    }
}
