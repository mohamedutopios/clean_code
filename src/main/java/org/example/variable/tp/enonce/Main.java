package org.example.variable.tp.enonce;

public class Main {
    public static void main(String[] args) {
        Point mainPoint = new Point(50, 100);
        Rectangle rect = new Rectangle(mainPoint, 90, 10);

        System.out.println(rect.area());
        rect.endPoints();
    }
}
