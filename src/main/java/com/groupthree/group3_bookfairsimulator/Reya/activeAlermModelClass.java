package com.groupthree.group3_bookfairsimulator.Reya;

public class activeAlermModelClass {
    private String alarmId;
    private String incidentType;
    private String location;
    private String date;

    public activeAlermModelClass(String alarmId, String incidentType, String location, String date) {
        this.alarmId = alarmId;
        this.incidentType = incidentType;
        this.location = location;
        this.date = date;
    }

    public String getAlarmId() {
        return alarmId;
    }

    public void setAlarmId(String alarmId) {
        this.alarmId = alarmId;
    }

    public String getIncidentType() {
        return incidentType;
    }

    public void setIncidentType(String incidentType) {
        this.incidentType = incidentType;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "activeAlermModelClass{" +
                "alarmId='" + alarmId + '\'' +
                ", incidentType='" + incidentType + '\'' +
                ", location='" + location + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
