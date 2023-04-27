package com.univercity.oopjava.practice.task8;

import com.univercity.oopjava.practice.task1.shapes.Point;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Point> pointArrayList = new ArrayList<>();
        TreeSet<Point> pointTreeSet = new TreeSet<>();

        Point point1 = new Point(1, 2);
        Point point2 = new Point(1, 2);

        pointArrayList.add(point1);
        pointArrayList.add(point2);

        pointTreeSet.add(point1);
        pointTreeSet.add(point2);

        int count = 10;
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            Point point = new Point(random.nextInt(), random.nextInt());
            pointArrayList.add(point);
            pointTreeSet.add(point);
        }

        System.out.println("Index of point is " + pointArrayList.indexOf(point1)); // Index of point is 0
        Collections.sort(pointArrayList);
        System.out.println("After sort index of point is " + pointArrayList.indexOf(point1)); // After sort index of point is 9
        System.out.println("ArrayList:");
        for (Point point : pointArrayList) {
            System.out.println(point);
        }

        System.out.println("TreeSet contains point [1,2] " + pointTreeSet.contains(new Point(1, 2))); // TreeSet contains point [1,2] true
        System.out.println("TreeSet contains point [3,5] " + pointTreeSet.contains(new Point(3, 5))); // TreeSet contains point [3,5] false
        System.out.println("TreeSet:");
        for (Point point : pointTreeSet) {
            System.out.println(point);
        }

        Iterator<Point> listIterator = pointArrayList.iterator();
        while (listIterator.hasNext()) {
            listIterator.next();
            listIterator.remove();
        }

        Iterator<Point> treeSetIterator = pointTreeSet.iterator();
        while (treeSetIterator.hasNext()) {
            treeSetIterator.next();
            treeSetIterator.remove();
        }

        System.out.println(pointArrayList.size());
        System.out.println(pointTreeSet.size());

    }
}
