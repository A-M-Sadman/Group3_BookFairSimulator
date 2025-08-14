package com.groupthree.group3_bookfairsimulator.AbdullahMohammadSadman;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;

public class Task implements Serializable {
    private String taskName;
    private String description;
    private String zone;
    private String status;
    private String type;
    private LocalDate date;

    public Task(String taskName, String description, String zone, String status, String type, LocalDate date) {
        this.taskName = taskName;
        this.description = description;
        this.zone = zone;
        this.status = status;
        this.type = type;
        this.date = date;
    }



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

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
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

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
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
