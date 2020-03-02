package com.iquestgroup.remotelearning.geometry;

public class Point extends GeometricShape {

    private int xCoordinate;
    private int yCoordinate;

    public Point(int xCoordinate, int yCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    public int getXCoordinate() {
        return xCoordinate;
    }

    public int getYCoordinate() {
        return yCoordinate;
    }

    public void draw(){
        System.out.println("This is the point (" + xCoordinate + ", " + yCoordinate + ")");
    }

}

