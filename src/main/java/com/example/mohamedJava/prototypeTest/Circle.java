package com.example.mohamedJava.prototypeTest;

public class Circle implements ShapePrototype{

    private int radius;
    private String color;

    public Circle(int radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public ShapePrototype clone() {
        return new Circle(radius, color);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }

}
