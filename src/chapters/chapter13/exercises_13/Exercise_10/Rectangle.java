package chapters.chapter13.exercises_13.Exercise_10;

import chapters.chapter13.exercises_13.Exercise_06.GeometricObject;


public class Rectangle extends GeometricObject implements Comparable<Rectangle> {

    private double width;
    private double height;

    public Rectangle() {
    }

    public Rectangle(
            double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(
            double width, double height, String color, boolean filled) {
        this.width = width;
        this.height = height;
        setColor(color);
        setFilled(filled);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getheight() {
        return height;
    }


    public void setheight(double height) {
        this.height = height;
    }


    public double getArea() {
        return width * height;
    }


    public double getPerimeter() {
        return 2 * (width * height);
    }

    public int compareTo(Rectangle o) {
        if (this.getArea() > o.getArea())
            return 1;
        else if (this.getArea() < o.getArea())
            return -1;
        else
            return 0;
    }

    public boolean equals(Object o) {
        return this.compareTo((Rectangle) o) == 0;
    }

    public String toString() {
        return super.toString() + "\nWidth: " + width + "\nHeight: " + height
                + "\nArea: " + getArea() + "\nPerimeter: " + getPerimeter();
    }


}
