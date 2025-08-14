package com.groupthree.group3_bookfairsimulator.AbdullahMohammadSadman;

import java.io.Serializable;

public class SupplyParts implements Serializable {
    private String equipmentName, urgencyLevel, location, issue;

    public SupplyParts() {
    }

    public SupplyParts(String equipmentName, String urgencyLevel, String location, String issue) {
        this.equipmentName = equipmentName;
        this.urgencyLevel = urgencyLevel;
        this.location = location;
        this.issue = issue;
    }

    public String getEquipmentName() {
        return equipmentName;
    }

    public void setEquipmentName(String equipmentName) {
        this.equipmentName = equipmentName;
    }

    public String getUrgencyLevel() {
        return urgencyLevel;
    }

    public void setUrgencyLevel(String urgencyLevel) {
        this.urgencyLevel = urgencyLevel;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getIssue() {
        return issue;
    }

    public void setIssue(String issue) {
        this.issue = issue;
    }

    @Override
    public String toString() {
        return "SupplyParts{" +
                "equipmentName='" + equipmentName + '\'' +
                ", urgencyLevel='" + urgencyLevel + '\'' +
                ", location='" + location + '\'' +
                ", issue='" + issue + '\'' +
                '}';
    }
}
