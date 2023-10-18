package org.example.variable.tp.solution;

class Rectangle {
    private Point origin;
    private int width;
    private int height;

    public Rectangle(Point origin, int width, int height) {
        this.origin = origin;
        this.width = width;
        this.height = height;
    }

    public int getArea() {
        return width * height;
    }

    public void printCoordinates() {
        int topRightX = origin.getX() + width;
        int bottomLeftY = origin.getY() + height;

        System.out.println("Starting Point (X): " + origin.getX());
        System.out.println("Starting Point (Y): " + origin.getY());
        System.out.println("End Point X-Axis (Top Right): " + topRightX);
        System.out.println("End Point Y-Axis (Bottom Left): " + bottomLeftY);
    }
}
