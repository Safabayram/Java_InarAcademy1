package chapters.chapter09.exercises09;

public class Rectangle {
    double width;
    double height;


    Rectangle() {
        width = 1;
        height = 1;
    }


    Rectangle(double newWidth, double newHeight) {
        this.width = newWidth;
        this.height = newHeight;
    }


    double getArea() {
        return width * height;
    }


    double getPerimeter() {
        return 2 * (width + height);
    }

}
