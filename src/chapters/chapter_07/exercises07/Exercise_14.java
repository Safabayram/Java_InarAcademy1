package chapters.chapter_07.exercises07;

import java.util.Scanner;

public class Exercise_14 {
    public static void main(String[] args) {
        System.out.print("Enter five integers: ");
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = input.nextInt();

        System.out.println("The gcd of these five integers is " +
                getGcd(numbers));
    }

    public static int getGcd(int... numbers) {
        int a = numbers[0];

        for (int i = 1; i < numbers.length; i++)
            a = getDivisor(a, numbers[i]);

        return a;
    }

    public static int getDivisor(int num1, int num2) {
        int gcd = 1;
        int divisor = 2;

        while (divisor <= num1 && divisor <= num2) {
            if (num1 % divisor == 0 && num2 % divisor == 0)
                gcd = divisor; // Update gcd
            divisor++;
        }

        return gcd;
    }
}





