package chapters.chapter_06.exercise06;

import java.util.Scanner;

public class Exercise6_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a integer");
        long n = input.nextLong();

        System.out.println(sumDigits(n));

    }
    public static  int sumDigits(long n){
        int sum = 0;
        while (n > 0){
            sum += n % 10;
            n = n / 10;
        }
        return sum;
    }
}
