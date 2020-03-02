package com.iquestgroup.remotelearning;
import com.iquestgroup.remotelearning.geometry.Canvas;
import com.iquestgroup.remotelearning.geometry.Circle;
import com.iquestgroup.remotelearning.geometry.Line;
import com.iquestgroup.remotelearning.geometry.Point;
import com.iquestgroup.remotelearning.geometry.Rectangle;
import com.iquestgroup.remotelearning.graphicaleditor.GraphicalEditor;

public class App {

    public static void main(String[] args) {

        Point firstPoint = new Point(-10, 10);
        Point secondPoint = new Point(10, 10);

        Line line = new Line(firstPoint, secondPoint);

        Point circleCentre = new Point(5, 5);
        Circle circle = new Circle(5, circleCentre);

        Point downLeftCorner = new Point(0, 0);
        Point downRightCorner = new Point(0, 4);
        Point upLeftCorner = new Point(4, 0);
        Point upRightCorner = new Point(4, 4);

        Rectangle rectangle = new Rectangle(downLeftCorner, downRightCorner, upLeftCorner, upRightCorner);

        Canvas primaryCanvas = new Canvas();
        Canvas secondaryCanvas = new Canvas();
        primaryCanvas.draw();

        primaryCanvas.addShapeIntoCanvas(firstPoint);
        primaryCanvas.addShapeIntoCanvas(secondPoint);
        primaryCanvas.addShapeIntoCanvas(line);

        primaryCanvas.addShapeIntoCanvas(circleCentre);
        primaryCanvas.addShapeIntoCanvas(circle);

        primaryCanvas.addShapeIntoCanvas(downLeftCorner);
        primaryCanvas.addShapeIntoCanvas(downRightCorner);
        primaryCanvas.addShapeIntoCanvas(upLeftCorner);
        primaryCanvas.addShapeIntoCanvas(upRightCorner);
        primaryCanvas.addShapeIntoCanvas(rectangle);

        primaryCanvas.addShapeIntoCanvas(secondaryCanvas);

        GraphicalEditor editor = new GraphicalEditor(primaryCanvas);

    }

}
