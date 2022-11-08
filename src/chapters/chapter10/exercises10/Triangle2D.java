package chapters.chapter10.exercises10;

public class Triangle2D {
    private MyPoint p1;
    private MyPoint p2;
    private MyPoint p3;

    public Triangle2D() {
        p1 = new MyPoint(0, 0);
        p2 = new MyPoint(1, 1);
        p3 = new MyPoint(2, 2);
    }

    public Triangle2D(double x1, double y1, double x2, double y2, double x3, double y3) {
        this.p1 = new MyPoint(x1, y1);
        this.p2 = new MyPoint(x2, y2);
        this.p3 = new MyPoint(x3, y3);
    }

    public Triangle2D(MyPoint p1, MyPoint p2, MyPoint p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public MyPoint getP1() {
        return p1;
    }

    public void setP1(MyPoint p1) {
        this.p1 = p1;
    }

    public MyPoint getP2() {
        return p2;
    }

    public void setP2(MyPoint p2) {
        this.p2 = p2;
    }

    public MyPoint getP3() {
        return p3;
    }

    public void setP3(MyPoint p3) {
        this.p3 = p3;
    }

    public double getPerimeter() {
        return p1.distance(p2) + p1.distance(p3) + p2.distance(p3);
    }

    public double getArea() {
        double side1 = p1.distance(p2);
        double side2 = p1.distance(p3);
        double side3 = p2.distance(p3);

        double sum = (side1 + side2 + side3) / 2;
        return Math.sqrt(sum * (sum - side1) * (sum - side2) * (sum - side3));
    }

    public boolean contains(MyPoint p) {
        return (getArea() == new Triangle2D(p1, p, p2).getArea() + new Triangle2D(p2, p, p3).getArea() + new Triangle2D(p1, p, p3).getArea());
    }

    public boolean contains(Triangle2D triangle2D) {
        return (contains(triangle2D.getP1()) && contains(triangle2D.getP2()) && contains(triangle2D.getP3()));
    }

    public boolean overLaps(Triangle2D triangle2D) {
        return (contains(triangle2D.getP1()) || contains(triangle2D.getP2()) || contains(triangle2D.getP3()));
    }


}
