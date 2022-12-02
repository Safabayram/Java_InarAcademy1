package chapters.chapter_13.exercises_13.Exercise_06;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {
    public ComparableCircle() {
    }
    public ComparableCircle(double radius) {
        super(radius);
    }
    public int compareTo(ComparableCircle o) {
        if (getRadius() > o.getRadius())
            return 1;
        else if (getRadius() < o.getRadius())
            return -1;
        else
            return 0;
    }


}
