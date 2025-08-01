package com.groupthree.group3_bookfairsimulator.AbdullahMohammadSadman;

import java.util.ArrayList;

public class Task {
    private String taskName;
    private String description;
    private int zone;
    private String status;
    private String type;
    private String date;

    public Task(String taskName, String description, int zone, String status, String type, String date) {
        this.taskName = taskName;
        this.description = description;
        this.zone = zone;
        this.status = status;
        this.type = type;
        this.date = date;
    }

    protected static ArrayList<Task> taskList = new ArrayList<>();

    public Task() {
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getZone() {
        return zone;
    }

    public void setZone(int zone) {
        this.zone = zone;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Task{" +
                ", taskName='" + taskName + '\'' +
                ", description='" + description + '\'' +
                ", zone=" + zone +
                ", status='" + status + '\'' +
                ", type='" + type + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
