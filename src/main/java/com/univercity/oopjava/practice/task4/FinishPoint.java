package com.univercity.oopjava.practice.task4;

import com.univercity.oopjava.practice.task1.shapes.Point;

public class FinishPoint extends Point {
    public FinishPoint(int x, int y) {
        super(x, y);
    }

    @Override
    public String toString() {
        return "I'm finish point " + super.toString();
    }
}
