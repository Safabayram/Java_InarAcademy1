package chapters.chapter12.exercises_12.Exercise_12;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exercise_12 {
    public static void main(String[] args) throws Exception {
        if (args.length != 1) {
            System.out.println(
                    "Usage: java Exercise12_12 filename");
            System.exit(1);
        }
        File file = new File(args[0]);
        if (!file.exists()) {
            System.out.println("Source file " + args[0] + " not exist");
            System.exit(2);
        }
        StringBuilder sb = new StringBuilder();

        try (


                Scanner input = new Scanner(file);
        ) {

            while (input.hasNext()) {
                String s = input.nextLine();
                String s1 = s.trim();
                if (s1.charAt(0) == '{') {
                    sb.append(" {");
                    if (s1.length() > 1) {
                        sb.append("\r\n" + s.replace('{', ' '));
                    }
                } else
                    sb.append("\r\n" + s);
            }

        }
        try (
                PrintWriter output = new PrintWriter(file);
        ) {
            output.print(sb.toString());
        }

    }


}


