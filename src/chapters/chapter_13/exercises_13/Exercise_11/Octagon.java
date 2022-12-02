package chapters.chapter_13.exercises_13.Exercise_11;

import chapters.chapter_13.exercises_13.Exercise_06.GeometricObject;

public class Octagon extends GeometricObject implements Comparable<Octagon>, Cloneable {
    private double side;

    public Octagon() {
    }

    public Octagon(double side) {
        this.side = side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }


    public double getArea() {
        return (2 + 4 / Math.sqrt(2)) * side * side;
    }

    public double getPerimeter() {
        return 8 * side;
    }


    public int compareTo(Octagon o) {
        if (this.getArea() > o.getArea())
            return 1;
        else if (this.getArea() < o.getArea())
            return -1;
        else
            return 0;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String toString() {
        return super.toString() + "\nArea: " + getArea() +
                "\nPerimeter: " + getPerimeter();
    }


}
