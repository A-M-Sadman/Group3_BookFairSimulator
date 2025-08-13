package com.groupthree.group3_bookfairsimulator.Reya;

public class AccessSequrityLogsModelClass {
    private String name;
    private String logId;
    private String location;
    private String date;

    public AccessSequrityLogsModelClass(String name, String logId, String location, String date) {
        this.name = name;
        this.logId = logId;
        this.location = location;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogId() {
        return logId;
    }

    public void setLogId(String logId) {
        this.logId = logId;
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
        return "AccessSequrityLogsModelClass{" +
                "name='" + name + '\'' +
                ", logId='" + logId + '\'' +
                ", location='" + location + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
