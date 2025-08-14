package com.groupthree.group3_bookfairsimulator.Sami;

import java.util.ArrayList;

public class VisitorComplaintsModelClass {
    private String name;
    private String id;
    private String contact;
    private String complaints;

    public static ArrayList<VisitorComplaintsModelClass> visitorComplaintsModelClasses = new ArrayList<>();

    public VisitorComplaintsModelClass(String name, String id, String contact, String complaints) {
        this.name = name;
        this.id = id;
        this.contact = contact;
        this.complaints = complaints;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getComplaints() {
        return complaints;
    }

    public void setComplaints(String complaints) {
        this.complaints = complaints;
    }

    public static ArrayList<VisitorComplaintsModelClass> getVisitorComplaintsModelClasses() {
        return visitorComplaintsModelClasses;
    }

    public static void setVisitorComplaintsModelClasses(ArrayList<VisitorComplaintsModelClass> visitorComplaintsModelClasses) {
        VisitorComplaintsModelClass.visitorComplaintsModelClasses = visitorComplaintsModelClasses;
    }

    @Override
    public String toString() {
        return "VisitorComplaintsModelClass{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", contact='" + contact + '\'' +
                ", complaints='" + complaints + '\'' +
                '}';
    }
}
