package geometry;

public class Point extends GeometricShape {

    private int xCoordinate;
    private int yCoordinate;
    private Integer thicknessParameter;

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
    @Override
    public void changeShapeThickness(Integer thicknessParameter){
        this.thicknessParameter = thicknessParameter;
    }
    @Override
    public void getShapeThickness() {
        System.out.println("Point");
        System.out.println("The thickness parameter is " + thicknessParameter + "px");
    }

}

