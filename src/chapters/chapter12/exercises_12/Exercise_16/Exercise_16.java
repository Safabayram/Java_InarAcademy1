package chapters.chapter12.exercises_12.Exercise_16;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise_16 {
    public static void main(String[] args) throws Exception {
        if (args.length != 3) {
            System.out.println(
                    "Usage: java Exercise12_16 sourceFile oldStr newStr");
            System.exit(1);
        }

        File sourceFile = new File(args[0]);
        if (!sourceFile.exists()) {
            System.out.println("Source file " + args[0] + " not exist");
            System.exit(2);
        }

        ArrayList<String> list = new ArrayList<>();

        try (

                Scanner input = new Scanner(sourceFile);
        ) {
            while (input.hasNext()) {
                String s1 = input.nextLine();
                list.add(s1.replaceAll(args[1], args[2]));
            }
        }


        try (

                PrintWriter output = new PrintWriter(sourceFile);
        ) {
            for (int i = 0; i < list.size(); i++) {
                output.println(list.get(i));
            }
        }


    }
}
