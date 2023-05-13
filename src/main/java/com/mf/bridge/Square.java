package com.mf.bridge;
public class Square extends Shape {
    public Square(Color color) {
        super(color);
    }

    @Override
    public String draw() {
        return "Drawing a Square with " + color.fill() + " color";
    }
}
