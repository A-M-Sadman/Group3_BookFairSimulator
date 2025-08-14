package com.groupthree.group3_bookfairsimulator.AbdullahMohammadSadman;

import java.time.LocalDate;
import java.util.ArrayList;

public class Report {
    private String reportId;
    private String description;
    private LocalDate date;

    public Report(String reportId, String description, LocalDate date) {
        this.reportId = reportId;
        this.description = description;
        this.date = date;
    }

    public String getReportId() {
        return reportId;
    }

    public void setReportId(String reportId) {
        this.reportId = reportId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Report{" +
                "reportId='" + reportId + '\'' +
                ", description='" + description + '\'' +
                ", date=" + date +
                '}';
    }
}
