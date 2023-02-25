package com.univercity.oopjava.practice.task2;

import java.util.Arrays;

public class Vector {

    private double[] elements;

    public Vector(double[] elements) {
        this.elements = elements.clone();
    }

    public double getLength() {
        double squareSum = 0.0d;
        for (double element : elements) {
            squareSum += Math.pow(element, 2);
        }
        return Math.sqrt(squareSum);
    }

    @Override
    public String toString() {
        return "Vector{" +
                "elements=" + Arrays.toString(elements) +
                '}';
    }

    public void setElement(int index, double element) {
        elements[index] = element;
    }
}
