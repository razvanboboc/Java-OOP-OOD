package geometry;

public class Circle extends GeometricShape {

    private final static int NUMBER_OF_POINTS = 20;
    private Integer thicknessParameter;
    private Line radius;

    public Circle(Line radius) {
        for (int pointCoordinate = 0; pointCoordinate < NUMBER_OF_POINTS; pointCoordinate++) {
            Point point = new Point(pointCoordinate, pointCoordinate);
            this.getListOfPoints().add(point);
        }
        this.radius = radius;
    }

    @Override
    public void changeShapeThickness(Integer thicknessParameter) {
        this.thicknessParameter = thicknessParameter;

    }
    @Override
    public void getShapeThickness() {
        System.out.println("Circle");
        System.out.println("The thickness parameter is " + thicknessParameter + "px");
    }

}


