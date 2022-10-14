package chapters.chapter07.exercises07;

import java.util.Scanner;

public class Exercise_03 {
    public static void main(String[] args) {
        int[] numbers = new int[100];


        System.out.print("Enter the integers between 1 and 100: ");


        getOccurrence(numbers);

        for (int i = 0; i < numbers.length ; i++) {
            if (numbers[i] > 0)
                System.out.println((i + 1) + " occurs " + numbers[i] + " time" + (numbers[i] > 1 ? "s" : "") );

        }

    }

    private static void getOccurrence(int[] numbers) {
        Scanner input = new Scanner(System.in);
        int number ;
        do {
            number = input.nextInt();
            if (number >= 1 && number <= 100)
                numbers[number - 1]++;
        }while(number != 0);
    }
}
