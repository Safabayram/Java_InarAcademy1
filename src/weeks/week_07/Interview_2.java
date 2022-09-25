package week_07;

import java.util.Scanner;

public class Interview_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a string");
        String s1 = input.nextLine();
        System.out.println("enter second string");
        String s2 = input.nextLine();

        System.out.println(IsPresentNewString(s1,s2));


    }

    public static String IsPresentNewString(String a, String b) {
        String commonChars = "";
        for (int i = 0; i < a.length(); i++) {
            for (int j = 0; j < b.length(); j++) {
                if (a.charAt(i) == b.charAt(j)) {
                    commonChars += a.charAt(i);
                }

            }


        }
        for (int i = 0; i < commonChars.length(); i++) {
            String charToRemove = commonChars.charAt(i) + "";
            a = a.replace(charToRemove, "");

        }
        return a;


    }
}
