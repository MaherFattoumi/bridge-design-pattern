package com.mf.bridge;
public class Circle extends Shape {
    public Circle(Color color) {
        super(color);
    }

    @Override
    public String draw() {
        return "Drawing a Circle with " + color.fill() + " color";
    }
}

