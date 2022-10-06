package chapters.chapter06.exercise06;

import java.util.Scanner;

public class Exercise6_25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter milisecond ");
        long mili = input.nextLong();
        System.out.println(mili + " is " + convertMillis(mili));

    }
    public static String convertMillis(long millis){
        long hours = millis / (1000 * 3600) ;
        long remaning = millis % (1000 * 3600);
        long minute = remaning / (1000 * 60);
        remaning = remaning % (1000 * 60);
        long second = remaning / 1000;


        return hours + ":" + minute + ":" + second;

    }
}

