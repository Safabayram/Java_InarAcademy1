package chapters.chapter_13.exercises_13.Exercise_07;

import chapters.chapter_13.exercises_13.Exercise_06.GeometricObject;

public class Exercise_07 {
    public static void main(String[] args) {

        GeometricObject[] objects = {new Square(5), new Square(10), new Square(15),
                new Square(20), new Square(3)};

        for (int i = 0; i < objects.length; i++) {
            System.out.println("area " + objects[i].getArea());
            ((Square) objects[i]).howToColor();

        }

    }
}
