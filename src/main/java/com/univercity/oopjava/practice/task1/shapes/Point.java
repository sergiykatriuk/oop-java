package com.univercity.oopjava.practice.task1.shapes;

public class Point {

    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Point)) return false;

        Point that = (Point) o;

        return getX() == that.getX() && getY() == that.getY();
    }

    @Override
    public String toString() {
        return String.format("Point(x=%d, y=%d)", x, y);
    }

    public boolean isInside(Circle circle) {
        return Math.pow(circle.getCenter().getX() - getX(), 2) +
                Math.pow(circle.getCenter().getY() - getY(), 2) <= Math.pow(circle.getRadius(), 2);
    }
}
