package chapters.chapter_07.exercises07;

import java.util.Scanner;

public class Exercise_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];


        System.out.print("Enter ten number: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
        int[] distinctNumbers = eliminateDuplicates(numbers);


        System.out.print("The distinct numbers are:");
        for (int a: distinctNumbers) {
            if (a > 0)
                System.out.print(" " + a);
        }
        System.out.println();
    }

    private static int[] eliminateDuplicates(int[] num) {
        int[] distinctNumbers = new int[num.length];
        for (int i = 0; i < num.length ; i++) {
            if (getDublicate(distinctNumbers,i) == -1) {
                distinctNumbers[i] = i;
                i++;
            }


        }
        return distinctNumbers;


    }




    private static int getDublicate(int[] distincs, int key) {
        for (int i = 0; i <distincs.length ; i++) {
            if (key == distincs[i])
                return i;

        }
        return -1;
    }


}
