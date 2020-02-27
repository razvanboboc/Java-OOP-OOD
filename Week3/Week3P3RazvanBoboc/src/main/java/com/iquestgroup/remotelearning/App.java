package com.iquestgroup.remotelearning;
import geometry.Canvas;
import geometry.Circle;
import geometry.Line;
import geometry.Point;
import geometry.Rectangle;
import graphicaleditor.GraphicalEditor;

public class App {

    public static void main(String[] args) {

        Point coordinateX = new Point(-10, 10);
        Point coordinateY = new Point(10, 10);

        Line line = new Line(coordinateX, coordinateY);

        Circle circle = new Circle(line);

        Rectangle rectangle = new Rectangle();

        Canvas primaryCanvas = new Canvas();
        Canvas secondaryCanvas = new Canvas();

        primaryCanvas.addShapeIntoCanvas(coordinateY);
        primaryCanvas.addShapeIntoCanvas(line);
        primaryCanvas.addShapeIntoCanvas(circle);
        primaryCanvas.addShapeIntoCanvas(rectangle);
        primaryCanvas.addShapeIntoCanvas(secondaryCanvas);

        coordinateY.changeShapeThickness(3);
        line.changeShapeThickness(2);
        circle.changeShapeThickness(5);
        rectangle.changeShapeThickness(7);
        secondaryCanvas.changeShapeThickness(8);

        GraphicalEditor editor = new GraphicalEditor(primaryCanvas);
        editor.getCanvas().printColorsOfShapesFromCanvas();

    }

}
