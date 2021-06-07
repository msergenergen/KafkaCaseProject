package com.hedefibul.producer.model;

public class Sensor {

    private String name1;
    private int positionX1;
    private int positionY1;
    private int bearingAngle1;

    private String name2;
    private int positionX2;
    private int positionY2;
    private int bearingAngle2;

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public int getPositionX1() {
        return positionX1;
    }

    public void setPositionX1(int positionX1) {
        this.positionX1 = positionX1;
    }

    public int getPositionY1() {
        return positionY1;
    }

    public void setPositionY1(int positionY1) {
        this.positionY1 = positionY1;
    }

    public int getBearingAngle1() {
        return bearingAngle1;
    }

    public void setBearingAngle1(int bearingAngle1) {
        this.bearingAngle1 = bearingAngle1;
    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    public int getPositionX2() {
        return positionX2;
    }

    public void setPositionX2(int positionX2) {
        this.positionX2 = positionX2;
    }

    public int getPositionY2() {
        return positionY2;
    }

    public void setPositionY2(int positionY2) {
        this.positionY2 = positionY2;
    }

    public int getBearingAngle2() {
        return bearingAngle2;
    }

    public void setBearingAngle2(int bearingAngle2) {
        this.bearingAngle2 = bearingAngle2;
    }

    public Sensor() {
    }

    public Sensor(String name1, int positionX1, int positionY1, int bearingAngle1, String name2, int positionX2, int positionY2, int bearingAngle2) {
        this.name1 = name1;
        this.positionX1 = positionX1;
        this.positionY1 = positionY1;
        this.bearingAngle1 = bearingAngle1;
        this.name2 = name2;
        this.positionX2 = positionX2;
        this.positionY2 = positionY2;
        this.bearingAngle2 = bearingAngle2;
    }





}