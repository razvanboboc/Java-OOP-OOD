package geometry;

public class Line extends GeometricShape {

    private Point coordinateX;
    private Point coordinateY;
    private Integer thicknessParameter;

    public Line(Point coordinateX, Point coordinateY) {
        this.coordinateY = coordinateY;
        this.coordinateX = coordinateX;
        this.getListOfPoints().add(coordinateX);
        this.getListOfPoints().add(coordinateY);
    }

    @Override
    public void changeShapeThickness(Integer thicknessParameter) {
        this.thicknessParameter = thicknessParameter;

    }
    @Override
    public void getShapeThickness() {
        System.out.println("Line");
        System.out.println("The thickness parameter is " + thicknessParameter + "px");
    }



}

