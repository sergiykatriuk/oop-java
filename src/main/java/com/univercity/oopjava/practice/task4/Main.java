package com.univercity.oopjava.practice.task4;

import com.univercity.oopjava.practice.task1.shapes.Point;

public class Main {
    public static void main(String[] args) {
        Point point = new LetteredPoint(5, 6, 'W');
        System.out.println(point);
        if (point instanceof LetteredPoint) {
            System.out.println("Letter is:" + ((LetteredPoint) point).getLetter());
        }
    }
}
