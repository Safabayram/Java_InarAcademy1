package chapters.chapter13.exercises_13.Exercise_12;

import chapters.chapter13.exercises_13.Exercise_06.Circle;
import chapters.chapter13.exercises_13.Exercise_06.GeometricObject;
import chapters.chapter13.exercises_13.Exercise_10.Rectangle;

public class Exercise_12 {
    public static void main(String[] args) {
        GeometricObject[] objects = {new Circle(3), new Circle(9), new Rectangle(2, 6),
                new Rectangle(6, 4)};

        for (int i = 0; i <objects.length ; i++) {
            System.out.println(objects[i].getArea());

        }

        System.out.println("sum of area in array is " + sumArea(objects));
    }

    public static double sumArea(GeometricObject[] a) {
        double sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i].getArea();
        }
        return sum;
    }


}
