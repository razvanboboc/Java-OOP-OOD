package com.iquestgroup.remotelearning.geometry;

public class Circle extends GeometricShape {
    private int radius;
    private Point circleCentre;
    public Circle(int radius, Point circleCentre) {
        this.radius = radius;
        this.circleCentre = circleCentre;
    }

    public void draw(){
        System.out.println("This is the circle defined by the centre (" + circleCentre.getXCoordinate() +
                ", " + circleCentre.getYCoordinate() + ") and radius " + radius);
    }

    public int getRadius(){
        return radius;
    }
}


