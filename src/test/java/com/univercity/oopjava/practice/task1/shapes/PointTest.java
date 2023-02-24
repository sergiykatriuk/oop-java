package com.univercity.oopjava.practice.task1.shapes;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PointTest {

    Point point = new Point(1, 2);

    @Test
    void testGetX() {
        Assertions.assertEquals(1, point.getX());
    }

    @Test
    void testGetY() {
        Assertions.assertEquals(2, point.getY());
    }

    @Test
    void testEqualsSimilarPoint() {
        Assertions.assertEquals(new Point(1, 2), point);
    }

    @Test
    void testEqualsDifferentPoint() {
        Assertions.assertNotEquals(new Point(3, 4), point);
    }

    @Test
    void testToString() {
        Assertions.assertEquals("x=1, y=2", point.toString());
    }

    @Test
    void testIsInsideWhenInside() {
        Circle circle = new Circle(new Point(1, 2), 5);
        Assertions.assertTrue(point.isInside(circle));
    }

    @Test
    void testIsInsideWhenOutside() {
        Circle circle = new Circle(new Point(10, 2), 5);
        Assertions.assertFalse(point.isInside(circle));
    }
}