package chapters.chapter_10.exercises10;

public class Circle2D {

    private double x;
    private double y;
    private double radius;

    public Circle2D() {
        this(0, 0, 1);
    }

    public Circle2D(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public double getX() {
        return x;
    }


    public double getY() {
        return y;
    }


    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public double getDistance(Circle2D circle) {
        return Math.sqrt(Math.pow(circle.getX() - getX(), 2) + Math.pow(circle.getY() - getY(), 2));
    }

    public double getDistance(double x, double y) {
        return Math.sqrt(Math.pow(x - getX(), 2) + Math.pow(y - getY(), 2));

    }

    public boolean contains(double x, double y) {
        return getDistance(x,y) <= getRadius();

    }

    public boolean contains(Circle2D circle) {

        return getDistance(circle) + circle.getRadius() <= getRadius();
    }

    public boolean overlaps(Circle2D circle) {
        return getRadius() + circle.getRadius() >= getDistance(circle);
    }


}
