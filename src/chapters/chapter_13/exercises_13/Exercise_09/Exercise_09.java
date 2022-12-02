package chapters.chapter_13.exercises_13.Exercise_09;

public class Exercise_09 {
    public static void main(String[] args) {
        Circle c1 = new Circle(5);
        Circle c2 = new Circle(45);
        Circle c3 = new Circle(5);


        System.out.println("Circle1 is " + (c1.equals(c2) ? "" : "not ") + "equal to circle2");
        System.out.println("Circle1 is " + (c1.equals(c3) ? "" : "not ") + "equal to circle3");


    }

}
