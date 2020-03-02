package com.iquestgroup.remotelearning.geometry;

import java.util.ArrayList;

public class Canvas extends GeometricShape {

    private ArrayList<GeometricShape> listOfGeometricShapes;

    public Canvas() {
        listOfGeometricShapes = new ArrayList<GeometricShape>();
    }

    public void addShapeIntoCanvas(GeometricShape geometricShape) {
        listOfGeometricShapes.add(geometricShape);
        geometricShape.draw();
    }

    public ArrayList<GeometricShape> getListOfGeometricShapes() {
        return listOfGeometricShapes;
    }

    public void draw(){
        System.out.println("I am a canvas");
    }
}


