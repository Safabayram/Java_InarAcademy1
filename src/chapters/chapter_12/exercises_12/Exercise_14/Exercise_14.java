package chapters.chapter_12.exercises_12.Exercise_14;

import java.io.File;
import java.util.Scanner;

public class Exercise_14 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a file name ");
        File file = new File(input.nextLine());

        if (!file.exists()) {
            System.out.println("File " + file + " does not exist");
            System.exit(1);
        }

        int count = 0;
        double sum = 0;


        try (
                Scanner read = new Scanner(file);
        ) {

            while (read.hasNext()) {
                sum += read.nextDouble();
                count++;
            }

        }
        System.out.println(file.getName());
        System.out.println(sum);
        System.out.println("average is " + sum / count);
    }

}
