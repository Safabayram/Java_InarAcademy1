package chapters.chapter06.exercise06;
import java.util.Scanner;

public class Exercise6_17 {
    public static void printMatrix(int n) {
        for (int rows = 0; rows < n; rows++) {
            for (int column = 0; column < n; column++) {

                System.out.print((int) (Math.random() * 2));
            }

            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner

        System.out.print("Enter a number for matrix ");
        int n = input.nextInt();


        printMatrix(n);
    }
}
