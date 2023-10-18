package org.example.variable.tp.solution;

public class Main {
    public static void main(String[] args) {
        Point rectangleOrigin = new Point(50, 100);
        Rectangle rectangle = new Rectangle(rectangleOrigin, 90, 10);

        System.out.println(rectangle.getArea());
        rectangle.printCoordinates();
    }
}
