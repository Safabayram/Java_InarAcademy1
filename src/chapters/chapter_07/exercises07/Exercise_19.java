package chapters.chapter_07.exercises07;

import java.util.Scanner;

public class Exercise_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter numbers: ");
        int[] numbers = new int[input.nextInt()];
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = input.nextInt();


        System.out.println(
                "The list is " + (isSorted(numbers) ? "is " : "not ") + "sorted");
    }

    private static boolean isSorted(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            if (list[i] > list[i + 1])
                return false;

        }
        return true;

    }


}
