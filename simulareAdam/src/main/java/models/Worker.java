package models;

import utils.Position;

public class Worker {
    private String name;
    private Position position;
    private int numberOfDaysOnPlatform;

    public Worker(String name, Position position, int numberOfDaysOnPlatform) {
        this.name = name;
        this.position = position;
        this.numberOfDaysOnPlatform = numberOfDaysOnPlatform;
    }

    public Position getPosition() {
        return position;
    }

    public int getNumberOfDaysOnPlatform() {
        return numberOfDaysOnPlatform;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", position=" + position +
                ", numberOfDaysOnPlatform=" + numberOfDaysOnPlatform +
                '}';
    }
}
