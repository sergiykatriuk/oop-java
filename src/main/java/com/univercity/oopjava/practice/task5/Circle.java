package com.univercity.oopjava.practice.task5;

public class Circle extends Figure {

    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getSquare() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter() {
        return Math.PI * radius * 2;
    }
}
