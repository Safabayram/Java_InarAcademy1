package chapters.chapter12.exercises_12.Exercise_02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean isContinue= false;

        System.out.print("Enter two numbers: ");

        while (!isContinue){
            try {
                int number1 = input.nextInt();
                int number2 = input.nextInt();


                System.out.println(
                        "The sum is " + (number1 + number2));

                isContinue = true;
            }
            catch (InputMismatchException ex) {
                System.out.println("Try again. (" +
                        "Incorrect input: two integers are required) ");
                input.nextLine();
            }


        }




    }
}
