package chapters.chapter_08.exercises08;

import java.util.Scanner;

public class Exercise_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer between 0 and 511 : ");
        int number = input.nextInt();

        char [][] table = getHeadTails(number);
        getTable(table);



    }

    public static void getTable(char[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static char[][] getHeadTails(int num){
        char[][] headAndTail = new char[3][3];
        String binary = getBinaryValue(num) + "";

        if (binary.length() != 9) {
            while (binary.length() != 9) {
                binary = '0' + binary;
            }
        }
        for (int i = 0; i < binary.length(); i++) {
            int count = Integer.parseInt(binary.charAt(i) + "");
            if (count == 0)
                headAndTail[i / 3][i % 3] = 'H';
            else
                headAndTail[i / 3][i % 3] = 'T';
        }

        return headAndTail;



    }

    public static String getBinaryValue(int num) {
        String result = "";
        while (num > 0) {
            int remainder = num % 2;
            num /= 2;
            result += remainder;
        }
        return result;

    }
}
