package chapters.chapter12.exercises_12.Exercise_08;

import java.util.Scanner;

public class Exercise_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a hex number: ");
        String hex = input.nextLine();

        try {
            System.out.println("The decimal value for hex number "
                    + hex + " is " + hex2Decimal(hex.toUpperCase()));
        } catch (HexFormatException ex) {
            System.out.println(ex.getMessage());
        }


    }

    public static int hex2Decimal(String hex) throws HexFormatException {
        int decimal = 0;
        for (int i = 0; i < hex.length(); i++) {
            if (!(hex.charAt(i) >= '0' && hex.charAt(i) <= '9') || !(hex.charAt(i) >= 'A' && hex.charAt(i) <= 'F')) {
                throw new HexFormatException(hex);

            }
            char hexChar = hex.charAt(i);
            decimal = decimal * 16 + hexChar2Decimal(hexChar);


        }
        return decimal;


    }

    public static int hexChar2Decimal(char ch) {
        if (ch >= 'A' && ch <= 'F') {
            return 10 + ch - 'A';
        } else {
            return ch - '0';
        }


    }
}
