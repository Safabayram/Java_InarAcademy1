package chapters.chapter12.exercises_12.Exercise_22;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise_22 {
    public static void main(String[] args) throws Exception {
        if (args.length != 3) {
            System.out.println(
                    "Usage: Java Exercise_12_16 dir oldString newString");
            System.exit(1);
        }

        File dir = new File(args[0]);
        if (!dir.isDirectory()) {
            System.out.println("Directory " + args[0] + " does not exist");
            System.exit(2);
        }

        File[] files = dir.listFiles();

        for (File f : files
        ) {
            replace(f, args);


        }


    }

    public static void replace(File f, String[] args) throws FileNotFoundException {

        ArrayList<String> list = new ArrayList<>();

        try (
                Scanner input = new Scanner(f);
        ) {
            while (input.hasNext()) {
                String s = input.nextLine();
                list.add(s.replaceAll(args[1], args[2]));


            }
        }
        try (
                PrintWriter output = new PrintWriter(f);
        ) {
            for (int i = 0; i < list.size(); i++) {
                output.print(list.get(i));

            }
        }


    }

}
