package chapters.chapter_06.exercise06;

import java.util.Scanner;

public class Exercise6_37 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter number : ");
        int number = input.nextInt();
        System.out.println("Enter width : ");
        int width = input.nextInt();
        System.out.println("The formatted version of number  " + number + " is = " + format(number , width) );

    }

    public static String format(int number, int width) {
        String s = number + "" ;
        if (s.length() >= width) {
            return s;
        }
        else {
            for (int i = s.length() ; i < width ; i++) {
                s = "0" + s ;
            }
        }
        return s;
    }
}
