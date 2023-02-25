package com.univercity.oopjava.practice.task2;

public class Main {


    public static void main(String[] args) {
        Vector vector = new Vector(new double[]{2.5d, 5.7d, 9.1d});

        System.out.println(vector);
        System.out.println("Vector length is " + vector.getLength());
        System.out.println();

        vector.setElement(1, 15.2);
        System.out.println(vector);
        System.out.println("Vector length is " + vector.getLength());
    }
}
