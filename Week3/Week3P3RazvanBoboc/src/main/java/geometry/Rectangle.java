package geometry;

public class Rectangle extends GeometricShape {

    private final static int MAX_POINTS = 10;
    private final static int MAX_LINES = 10;

    private Line[] arrayOfLines = new Line[MAX_LINES];
    private Integer thicknessParameter;

    public Rectangle() {
        for (int pointCoordinate = 0; pointCoordinate < MAX_POINTS && pointCoordinate < MAX_LINES; pointCoordinate++) {
            Point downLeftCorner = new Point(pointCoordinate, pointCoordinate);
            this.getListOfPoints().add(downLeftCorner);

            Point downRightCorner = new Point(pointCoordinate, pointCoordinate + 2);
            this.getListOfPoints().add(downRightCorner);

            Point upLeftCorner = new Point(pointCoordinate + 2, pointCoordinate);
            this.getListOfPoints().add(upLeftCorner);

            Point upRightCorner = new Point(pointCoordinate + 2, pointCoordinate + 2);
            this.getListOfPoints().add(upRightCorner);
        }

        for (int i = 0; i < MAX_LINES; i++) {
            arrayOfLines[i] = new Line(this.getListOfPoints().get(i), this.getListOfPoints().get(i));
            arrayOfLines[i] = new Line(this.getListOfPoints().get(i), this.getListOfPoints().get(i + 2));
            arrayOfLines[i] = new Line(this.getListOfPoints().get(i + 2), this.getListOfPoints().get(i));
            arrayOfLines[i] = new Line(this.getListOfPoints().get(i + 2), this.getListOfPoints().get(i + 2));
        }

    }

    @Override
    public void changeShapeThickness(Integer thicknessParameter) {
        this.thicknessParameter = thicknessParameter;

    }
    @Override
    public void getShapeThickness() {
        System.out.println("Rectangle");
        System.out.println("The thickness parameter is " + thicknessParameter + "px");
    }

}