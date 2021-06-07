package com.hedefibul.consumer.model;

public class Sensor {

    private String name;
    private int positionX;
    private int positionY;

    public Sensor() {
    }

    public Sensor(String name, int positionX, int positionY) {
        this.name = name;
        this.positionX = positionX;
        this.positionY = positionY;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPositionX() {
        return positionX;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Sensor{");
        sb.append("name='").append(name).append('\'');
        sb.append(", positionX='").append(positionX).append('\'');
        sb.append(", positionY='").append(positionY).append('\'');
        sb.append('}');
        return sb.toString();
    }


}