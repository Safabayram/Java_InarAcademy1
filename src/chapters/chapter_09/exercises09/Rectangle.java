package chapters.chapter_09.exercises09;

public class Rectangle {
    double width;
    double height;


    Rectangle() {
        width = 1;
        height = 1;
    }


    public Rectangle(double newWidth, double newHeight) {
        this.width = newWidth;
        this.height = newHeight;
    }


    public double getArea() {
        return width * height;
    }


    public double getPerimeter() {
        return 2 * (width + height);
    }

}
