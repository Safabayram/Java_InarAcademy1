package chapters.chapter13.exercises_13.Exercise_06;

public class Test {
    public static void main(String[] args) {
        ComparableCircle cc = new ComparableCircle(23);
        ComparableCircle cc2 = new ComparableCircle(12);


        System.out.println((cc.compareTo(cc2) == 1 ? "circle cc " : "circle cc2 ") + " is larger than other");
    }
}
