package com.groupthree.group3_bookfairsimulator.AbdullahMohammadSadman;

import java.util.ArrayList;

public class Task {
    private String taskId;
    private String taskName;
    private String description;
    private int zone;
    private boolean markDone;

    protected static ArrayList<Task> taskList = new ArrayList<>();

    public Task() {
    }

    public Task(String taskId, String taskName, String description, int zone, boolean markDone) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.description = description;
        this.zone = zone;
        this.markDone = markDone;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
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

    public boolean isMarkDone() {
        return markDone;
    }

    public void setMarkDone(boolean markDone) {
        this.markDone = markDone;
    }

    @Override
    public String toString() {
        return "Task{" +
                "taskId='" + taskId + '\'' +
                ", taskName='" + taskName + '\'' +
                ", description='" + description + '\'' +
                ", zone=" + zone +
                ", markDone=" + markDone +
                '}';
    }
}
