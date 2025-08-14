package com.groupthree.group3_bookfairsimulator.Reya;

public class assignDutyModelClass {
    private String name,id,duty,col;

    public assignDutyModelClass(String name, String id, String duty, String col) {
        this.name = name;
        this.id = id;
        this.duty = duty;
        this.col = col;
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

    public String getCol() {
        return col;
    }

    public void setCol(String col) {
        this.col = col;
    }

    public String getDuty() {
        return duty;
    }

    public void setDuty(String duty) {
        this.duty = duty;
    }

    @Override
    public String toString() {
        return "assignDutyModelClass{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", duty='" + duty + '\'' +
                ", col='" + col + '\'' +
                '}';
    }
}
