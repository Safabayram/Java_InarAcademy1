package week_09;

import java.util.Scanner;

public class UniquesCharacters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a string value :");
        String s = input.nextLine();
        boolean result = isUnique(s);
        System.out.println(result);
        System.out.println("------------------");
        boolean result2 = isUnique1(s);
        System.out.println(result2);
    }

    private static boolean isUnique1(String s) {
        int counter = 0;
        boolean[] myAsciitable = new boolean[128];
        for (int i = 0; i <s.length(); i++) {
            int index = s.charAt(i);
            counter++;
            if(myAsciitable[index]){
                System.out.println("This is the step number :" + counter );
                return false;
            }else{
                myAsciitable[index] = true;
            }
        }
        System.out.println("This is the step number :" + counter );
        return true;
    }

    public static boolean isUnique(String s){
        int counter = 0;
        for (int i = 0; i < s.length() -1 ; i++) {
            for (int j = i + 1; j < s.length(); j++) {
                counter++;
                if (s.charAt(i) == s.charAt(j)) {
                    System.out.println("This is the step number :" + counter );
                    return false;
                }
            }
        }
        System.out.println("This is the step number :" + counter );
        return true;
    }
}
