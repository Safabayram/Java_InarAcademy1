package chapters.chapter13.exercises_13.Exercise_05;

import chapters.chapter13.sampleQuestions.GeometricObject;

public class Circle extends GeometricObject {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius,
                  String color, boolean filled) {
        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;

    }

    public double getDiameter() {
        return 2 * radius;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    public String toString() {
        return super.toString() + "\nRadius: " + radius + "\nArea: " + getArea() +
                "\nDiameter: " + getDiameter() + "\nPerimeter: " + getPerimeter();
    }


}
