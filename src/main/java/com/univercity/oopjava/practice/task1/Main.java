package com.univercity.oopjava.practice.task1;


import com.univercity.oopjava.practice.task1.shapes.Circle;
import com.univercity.oopjava.practice.task1.shapes.Point;

public class Main {

    public static void main(String[] args) {
        Point[] points = {
                new Point(1, 2),
                new Point(5, 8),
                new Point(5, 8),
                new Point(5, 8),
                new Point(-5, 2),
                new Point(-1, 4)
        };

        Circle circle = new Circle(new Point(1, 2), 5);
        for (int i = 0; i < points.length; i++) {
            if (points[i].isInside(circle)) {
                System.out.println("Point " + points[i] + " is inside a given circle.");
            }
        }

        int count = 0;
        Point point = new Point(5, 8);
        for (int i = 0; i < points.length; i++) {
            if (points[i].equals(point)) {
                count++;
            }
        }
        System.out.println(String.format("Point %s appears in array %d times", point, count));

        int[] ii=new int[5];
        System.out.println(ii[1]);
    }
}
