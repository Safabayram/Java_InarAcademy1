package chapters.chapter_12.exercises_12.Exercise_07;

import java.util.Scanner;

public class Exercise_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Enter an binary value");
            String binaryValue = input.nextLine();
            System.out.println("Binary value " + binaryValue + " == " + "Decimal Value " + bin2Dec(binaryValue));
        } catch (NumberFormatException ex) {
            System.out.println(ex.getMessage());
        }


    }

    public static int bin2Dec(String binaryString) throws NumberFormatException {
        int decimal = 0;

        for (int i = 0, j = binaryString.length() - 1; i < binaryString.length(); i++, j--) {
            if (binaryString.charAt(i) < '0' || binaryString.charAt(i) > '1') {
                throw new NumberFormatException("String is not binary");
            }
            decimal += (Integer.parseInt(String.valueOf(binaryString.charAt(i)))) * Math.pow(2, j);

        }
        return decimal;

    }
}
