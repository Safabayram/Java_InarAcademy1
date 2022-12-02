package chapters.chapter_13.exercises_13.Exercise_10;

public class Exercise_10 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(4, 12);
        Rectangle r2 = new Rectangle(8, 32);
        Rectangle r3 = new Rectangle(4, 12);

        System.out.println("Rectangle1 is " + (r1.equals(r2) ? "" : "not ") + "equal to Rectangle2");

        System.out.println("Rectangle1 is " + (r1.equals(r3) ? "" : "not ") + "equal to Rectangle3");


    }
}
