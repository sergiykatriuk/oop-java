package com.univercity.oopjava.practice.task5;

public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle(4);
        Triangle triangle = new Triangle(3, 4, 5);
        Rectangle rectangle = new Rectangle(4, 3);
        Figure[] figures = {circle, triangle, rectangle};

        for (Figure figure : figures) {
            System.out.print(String.format("Class: %s, square: %s, perimeter: %s",
                    figure.getClass(), figure.getSquare(), figure.getPerimeter()));
            if (figure instanceof Rectangle) {
                System.out.println(", diagonal: " + ((Rectangle) figure).getDiagonal());
            } else {
                System.out.println();
            }
        }
//        output:
//        Class: class com.univercity.oopjava.practice.task5.Circle, square: 50.26548245743669, perimeter: 25.132741228718345
//        Class: class com.univercity.oopjava.practice.task5.Triangle, square: 6.0, perimeter: 12.0
//        Class: class com.univercity.oopjava.practice.task5.Rectangle, square: 12.0, perimeter: 14.0, diagonal: 5.0
    }
}
