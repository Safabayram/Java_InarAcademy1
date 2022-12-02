package chapters.chapter_12.exercises_12.Exercise_09;

import java.util.Scanner;

public class Exercise_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an binary value ");
        String binaryValue = input.nextLine();

        try {
            System.out.println("Binary value " + binaryValue + " ==" + "Decimal Value " + bin2Dec(binaryValue));
        }
        catch (BinaryFormatException ex){
            System.out.println(ex.getMessage());
        }





    }
    public static int bin2Dec(String binaryString) throws BinaryFormatException {
        int decimal = 0;

        for (int i = 0, j = binaryString.length() - 1; i < binaryString.length(); i++, j--) {
            if (binaryString.charAt(i) < '0' || binaryString.charAt(i) > '1') {
                throw new BinaryFormatException(binaryString);
            }
            decimal += (Integer.parseInt(String.valueOf(binaryString.charAt(i)))) * Math.pow(2, j);

        }
        return decimal;

    }

}
