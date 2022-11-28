package chapters.chapter12.exercises_12.Exercise_26;

import java.io.File;
import java.util.Scanner;

public class Exercise_26 {
    public static void main(String[] args) {
        System.out.print("Enter a directory name: ");
        Scanner input = new Scanner(System.in);
        String directoryName = input.nextLine();

        File directory = new File(directoryName);

        if (directory.isDirectory()) {
            System.out.println("Directory already exists");
            System.exit(0);

        }
        if (directory.mkdirs()) {
            System.out.println("Directory created successfully");
        }


    }

}
