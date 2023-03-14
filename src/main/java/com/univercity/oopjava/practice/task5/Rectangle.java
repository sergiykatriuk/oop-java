package com.univercity.oopjava.practice.task5;

public class Rectangle extends Figure {

    private final double sideA;
    private final double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double getSquare() {
        return sideA * sideB;
    }

    @Override
    public double getPerimeter() {
        return (sideA + sideB) * 2;
    }

    public double getDiagonal() {
        return Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2));
    }


}
