package geometry;

public class Rectangle extends GeometricShape {
    private Point downLeftCorner;
    private Point downRightCorner;
    private Point upLeftCorner;
    private Point upRightCorner;
    public Rectangle(Point downLeftCorner, Point downRightCorner, Point upLeftCorner, Point upRightCorner) {
        this.downLeftCorner = downLeftCorner;
        this.downRightCorner = downRightCorner;
        this.upLeftCorner = upLeftCorner;
        this.upRightCorner = upRightCorner;
    }
    public void draw(){
        System.out.println("This is a rectangle defined by the points " +
                "( " + downLeftCorner.getXCoordinate() + ", " + downLeftCorner.getYCoordinate() + ") ," +
                "( " + downRightCorner.getXCoordinate() + ", " + downRightCorner.getYCoordinate() + ") ," +
                "( " + upLeftCorner.getXCoordinate() + ", " + upLeftCorner.getYCoordinate() + ") ," +
                "( " + upRightCorner.getXCoordinate() + ", " + upRightCorner.getYCoordinate() + ") ," );
    }
}