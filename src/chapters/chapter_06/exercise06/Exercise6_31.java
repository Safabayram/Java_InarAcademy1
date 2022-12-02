package chapters.chapter_06.exercise06;

import java.util.Scanner;

public class Exercise6_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner


        System.out.print("Enter a credit card number as a long integer: ");
        long number = input.nextLong();

        System.out.println(
                number + " is " + (isValid(number) ? "valid" : "invalid"));
    }
    public static boolean isValid(long number) {
        int sumOfDoubleEvenPlace = sumOfDoubleEvenPlace(number) ;
        int sumOfOddPlace = sumOfOddPlace(number);
        int result = sumOfDoubleEvenPlace + sumOfOddPlace ;
        if (result % 10 == 0 ) {
            return true ;
        }
        else {
            return false ;
        }
    }
    public static int sumOfOddPlace(long number) {
        int sum = 0;
        String s = number + "" ;
        for (int i = s.length() - 2 ; i >= 0 ; i-=2 ) {
            sum += getDigit(Integer.parseInt(s.charAt(i) + "") * 2);
        }
        return sum ;
    }

    public static int sumOfDoubleEvenPlace(long number) {
        int sum = 0;
        String s = number + "" ;
        for (int i = s.length() - 1 ; i > 0 ; i-=2 ) {
            sum += Integer.parseInt(s.charAt(i) + "") ;
        }
        return sum ;
    }

    public static int getDigit(int a) {
        if(a < 10 ){
            return a;
        }
        else {
            return a / 10 + a % 10  ;
        }
    }
    public static int getSize(long d) {
        String s = d + "" ;
        return s.length();
    }
    public static boolean prefixMatched(long number, int d) {
        String s1 = number + "" ;
        String s2 = getPrefix(number, d) + "" ;
        return s1.startsWith(s2);
    }

    public static long getPrefix(long number, int d) {
        String s1 = number + "" ;
        String s2 = d + "" ;
        return Long.parseLong(s1.substring(0 , s2.length())) ;
    }
}
