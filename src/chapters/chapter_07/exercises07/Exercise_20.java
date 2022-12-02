package chapters.chapter_07.exercises07;

import java.util.Scanner;

public class Exercise_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[10];
        System.out.println("Enter ten double numbers :");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }
        selectionSort(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        
    }

    public static void selectionSort(double[] list) {
        for (int i = list.length - 1; i >= 0; i--) {

            double max = list[i];
            int maxIndex = i;
            for (int j = i - 1; j >= 0 ; j--) {
                if (max < list[j]) {
                    max = list[j];
                    maxIndex = j;
                }
            }
            if ( maxIndex != i) {
                list[ maxIndex] = list[i];
                list[i] = max;
            }
        }



    }


}
