package chapters.chapter_07.exercises07;

import java.util.Scanner;

public class Exercise_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[10];
        System.out.print("Enter 10 numbers: ");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
        bubbleSort(numbers);
        System.out.println("My list after sort is: ");

        for (int i = 0; i < numbers.length; i++)
            System.out.print(numbers[i] + "  ");
    }

    public static void bubbleSort(int[] list) {
        int temp;
        boolean isSwapped;

        do {
            isSwapped = false;
            for (int i = 0; i < list.length - 1 ; i++) {
                if (list[i] > list[i + 1]){
                    temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1]= temp;
                    isSwapped = true;
                }

            }
        }while (isSwapped);

    }
}









