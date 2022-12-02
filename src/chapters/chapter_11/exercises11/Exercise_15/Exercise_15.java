package chapters.chapter_11.exercises11.Exercise_15;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number of points: ");
        int n = input.nextInt();
        ArrayList<Double> list = new ArrayList<>();

        System.out.println("Enter the coordinates of the points: ");
        getPoints(list, n);

        double area = getArea(list, n);

        System.out.println("The total area is " + area);


    }
    private static double getArea(ArrayList<Double> list, int n) {
        double sum = 0;
        int x1 = 0;
        int x2 = 2;
        int y1 = 1;
        int y2 = 3;
        for (int i = 0; i < n; i++) {
            if (x2 == (n * 2 - 2)) {
                x2 = 0;
            }
            if (y2 == (n * 2 - 1)) {
                y2 = 0;
            }

            sum += Math.abs((list.get(x1) * list.get(y2)) - (list.get(x2) * list.get(y1)));
            x1 += 2;
            x2 += 2;
            y1 += 2;
            y2 += 2;
        }
        return sum / 2;
    }

    private static void getPoints(ArrayList<Double> list, int n) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < n * 2; i++) {
            list.add(input.nextDouble());
        }
    }
}
