package chapters.chapter10.exercises10;

public class MyPointTest {
    public static void main(String[] args) {


        MyPoint myPoint = new MyPoint();
        MyPoint myPoint1 = new MyPoint(10, 30.5);
        System.out.println(myPoint.distance(myPoint1));

    }


}
