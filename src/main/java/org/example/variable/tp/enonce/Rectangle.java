package org.example.variable.tp.enonce;

class Rectangle {
    private Point startingPoint;
    private int breadth;
    private int height;

    public Rectangle(Point startingPoint, int breadth, int height) {
        this.startingPoint = startingPoint;
        this.breadth = breadth;
        this.height = height;
    }

    public int area() {
        return breadth * height;
    }

    public void endPoints() {
        int topRightX = startingPoint.getCoordX() + breadth;
        int bottomLeftY = startingPoint.getCoordY() + height;

        System.out.println("Starting Point (X): " + startingPoint.getCoordX());
        System.out.println("Starting Point (Y): " + startingPoint.getCoordY());
        System.out.println("End Point X-Axis (Top Right): " + topRightX);
        System.out.println("End Point Y-Axis (Bottom Left): " + bottomLeftY);
    }
}
