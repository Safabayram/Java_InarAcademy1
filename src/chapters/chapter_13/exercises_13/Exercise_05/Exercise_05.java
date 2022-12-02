package chapters.chapter_13.exercises_13.Exercise_05;


public class Exercise_05 {
    public static void main(String[] args) {
        Circle myCircle = new Circle(10);
        Circle myCircle2 = new Circle(25);

        System.out.println("the larger circle is " + Circle.max(myCircle, myCircle2));

        Rectangle myRectangle = new Rectangle(10, 15);
        Rectangle myRectangle2 = new Rectangle(5, 20);

        System.out.println("the larger rectangle is " + Rectangle.max(myRectangle, myRectangle2));


    }
}
