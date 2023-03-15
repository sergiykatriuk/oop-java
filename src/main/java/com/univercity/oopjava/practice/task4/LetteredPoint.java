package com.univercity.oopjava.practice.task4;

import com.univercity.oopjava.practice.task1.shapes.Point;

public class LetteredPoint extends Point {

    private final char letter;

    public LetteredPoint(int x, int y, char letter) {
        super(x, y);
        this.letter = letter;
    }

    public char getLetter() {
        return letter;
    }

    @Override
    public String toString() {
        return "LetteredPoint " + getLetter() + " " + super.toString();
    }
}
