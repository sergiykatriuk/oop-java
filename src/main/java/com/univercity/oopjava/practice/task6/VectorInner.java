package com.univercity.oopjava.practice.task6;

import java.util.Arrays;

public class VectorInner {

    private double[] elements;

    public VectorInner(double[] elements) {
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

    public class VectorInnerIterator implements Iterator {

        private int currentIndex;

        @Override
        public boolean hasNext() {
            return elements.length > currentIndex;
        }

        @Override
        public double next() {
            return elements[currentIndex++];
        }
    }
}
