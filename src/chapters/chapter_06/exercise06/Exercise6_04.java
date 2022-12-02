package chapters.chapter_06.exercise06;

import java.util.Scanner;

public class Exercise6_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter an integer ");
        int number = input.nextInt();
        reverse(number);

    }
    public static void reverse(int number){
        int reverse = 0;
        while(number != 0){
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number /= 10;
        }
        System.out.println(reverse);


    }

}
