package chapters.chapter13.exercises_13.Exercise_09;

import chapters.chapter13.exercises_13.Exercise_06.GeometricObject;


public class Circle extends GeometricObject implements Comparable<Circle> {

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

    @Override
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    public boolean equals(Object o) {
        return this.compareTo((Circle) o) == 0;
    }

    public int compareTo(Circle o) {
        if (this.radius > o.radius)
            return 1;
        else if (this.radius < o.radius)
            return -1;
        else
            return 0;
    }

    public String toString() {
        return super.toString() + "\nDate created: " + getDateCreated() +
                "\nRadius: " + radius;
    }


}
