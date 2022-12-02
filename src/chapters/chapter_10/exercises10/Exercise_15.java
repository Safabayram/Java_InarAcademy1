package chapters.chapter_10.exercises10;

import java.util.Scanner;

public class Exercise_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[][] points = new double[5][2];

        System.out.print("\nEnter five points: ");

        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points[i].length; j++) {
                points[i][j] = input.nextDouble();
            }
        }
        MyRectangle2D rectangle2D = getRectangle(points);
        System.out.println("The bounding rectangle's center (" + rectangle2D.getX() + "," + rectangle2D.getY() + "), width "
                + rectangle2D.getWidth() + " , " + "height " + rectangle2D.getHeight());


    }

    public static MyRectangle2D getRectangle(double[][] points) {
        double smallestx1 = points[0][0];
        for (int i = 0; i < points.length; i++) {
            if (points[i][0] < smallestx1) {
                smallestx1 = points[i][0];
            }
        }
        double biggestx2 = points[points.length - 1][0];
        for (int i = 0; i < points.length; i++) {
            if (points[i][0] > biggestx2) {
                biggestx2 = points[i][0];
            }
        }
        double x = (smallestx1 + biggestx2) / 2.0;
        double width = Math.abs(biggestx2 - smallestx1);

        double smallesty1 = points[0][1];
        for (int i = 0; i < points.length; i++) {
            if (points[i][1] < smallesty1) {
                smallesty1 = points[i][1];
            }
        }
        double biggesty2 = points[points.length - 1][1];
        for (int i = 0; i < points.length; i++) {
            if (points[i][1] > biggesty2) {
                biggesty2 = points[i][1];
            }
        }
        double y = (smallesty1 + biggesty2) / 2.0;
        double height = Math.abs(biggesty2 - smallesty1);
        return new MyRectangle2D(x, y, width, height);
    }

}




