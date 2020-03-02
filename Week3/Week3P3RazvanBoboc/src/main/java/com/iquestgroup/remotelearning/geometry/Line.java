package com.iquestgroup.remotelearning.geometry;

public class Line extends GeometricShape {

    private Point firstPoint;
    private Point secondPoint;

    public Line(Point firstPoint, Point secondPoint) {
        this.firstPoint = firstPoint;
        this.secondPoint = secondPoint;
    }

    public void draw(){
        System.out.println("This is the line defined by the points (" + firstPoint.getXCoordinate() + ", " + firstPoint.getYCoordinate() +
                ") and (" + secondPoint.getXCoordinate() + ", " + secondPoint.getYCoordinate() + ")");
    }
}

