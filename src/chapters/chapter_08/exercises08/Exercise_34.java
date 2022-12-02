package chapters.chapter_08.exercises08;

import java.util.Scanner;

public class Exercise_34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[][] points = new double[6][2];
        System.out.print("Enter " + points.length + " points: ");
        for (int i = 0; i < points.length; i++)
            for (int j = 0; j < points[i].length; j++)
                points[i][j] = input.nextDouble();

        double[] point = getRightmostLowestPoint(points);

        System.out.println("The rightmost lowest point is (" +
                point[0] + ", " + point[1] + ")");
    }

    public static double[] getRightmostLowestPoint(double[][] points) {
        double[] rightMostXY = new double[2];
        rightMostXY[0] = points[0][0];
        rightMostXY[1] = points[0][1];

        for (int i = 1; i < points.length; i++) {
            if(rightMostXY[1] > points[i][1] || (rightMostXY[1] == points[i][1] && rightMostXY[0] < points[i][0])) {
                rightMostXY[0] = points[i][0];
                rightMostXY[1] = points[i][1];
            }
        }
        return rightMostXY;
    }


}
