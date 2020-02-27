package geometry;

import java.util.ArrayList;

public abstract class GeometricShape {

    private ArrayList<Point> listOfPoints = new ArrayList<Point>();

    public abstract void changeShapeThickness(Integer thicknessParameter);

    public abstract void getShapeThickness();

    public ArrayList<Point> getListOfPoints() {
        return listOfPoints;
    }

}

