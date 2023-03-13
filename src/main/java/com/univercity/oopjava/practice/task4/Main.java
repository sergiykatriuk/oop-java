package com.univercity.oopjava.practice.task4;

import com.univercity.oopjava.practice.task1.shapes.Point;

public class Main {
    public static void main(String[] args) {
        Point point = new Point(5, 6);
        Point startPoint = new StartPoint(1, 2);
        Point finishPoint = new FinishPoint(2, 4);

        System.out.println("Point:");
        System.out.println(point);
        System.out.println("StartPoint:");
        System.out.println(startPoint);
        System.out.println("FinishPoint:");
        System.out.println(finishPoint);
    }
}
