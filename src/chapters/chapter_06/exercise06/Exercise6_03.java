package chapters.chapter_06.exercise06;

import java.util.Scanner;

public class Exercise6_03 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter an integer");
        int s = input.nextInt();
        System.out.println(isPalindrome(s));


    }
    public  static int reverse(int number){
        int reverse = 0;
        while(number != 0){
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;
        }
        return  reverse;

    }
    public static boolean isPalindrome(int number){
        if(number == reverse(number)){
            return true;
        }
        return false;
    }
}
