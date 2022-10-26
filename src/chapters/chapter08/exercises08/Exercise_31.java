package chapters.chapter08.exercises08;

import java.util.Scanner;

public class Exercise_31 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double[][] points = new double[4][2];

        System.out.println("Enter four points:");
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points[i].length; j++) {
                points[i][j] = input.nextDouble();
            }
        }


        double[] result = getIntersectingPoint(points);


        if (result == null)
            System.out.println("The two lines are parallel");
        else {
            System.out.println("The intersecting point is at (" +
                    result[0] + ", " + result[1] + ")");
        }

    }
    public static double[] getIntersectingPoint(double[][] points) {
        double[] result = new double[2];
        double a = points[0][1] - points[1][1];
        double b = points[0][0] - points[1][0];
        double c = points[2][1] - points[3][1];
        double d = points[2][0] - points[3][0];
        double e = (points[0][1] - points[1][1]) * points[0][0] - (points[0][0] - points[1][0]) * points[0][1];
        double f = (points[2][1] - points[3][1]) + points[2][0] - (points[2][0] - points[3][0]) * points[2][1];
        if (a * d - b * c == 0) {
            return null;
        } else {
            result[0] = (e * d - b * f) / (a * d - b * c);
            result[1] = (a * d - e * c) / (a * d - b * c);
        }
        return result;
    }

}
