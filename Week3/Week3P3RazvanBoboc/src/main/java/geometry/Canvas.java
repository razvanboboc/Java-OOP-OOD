package geometry;

import java.util.ArrayList;

public class Canvas extends GeometricShape {

    private ArrayList<GeometricShape> listOfGeometricShapes;
    private Integer thicknessParameter;

    public Canvas() {
        listOfGeometricShapes = new ArrayList<GeometricShape>();
    }

    public void addShapeIntoCanvas(GeometricShape geometricShape) {
        listOfGeometricShapes.add(geometricShape);
    }

    public void printColorsOfShapesFromCanvas() {
        for (GeometricShape geometricShape : listOfGeometricShapes) {
            geometricShape.getShapeThickness();
        }
    }

    public ArrayList<GeometricShape> getListOfGeometricShapes() {
        return listOfGeometricShapes;
    }

    @Override
    public void changeShapeThickness(Integer thicknessParameter) {
        this.thicknessParameter = thicknessParameter;

    }

    @Override
    public void getShapeThickness() {
        System.out.println("Canvas");
        System.out.println("The thickness parameter is " + thicknessParameter + "px");
    }
}


