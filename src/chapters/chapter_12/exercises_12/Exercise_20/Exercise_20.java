package chapters.chapter_12.exercises_12.Exercise_20;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exercise_20 {
    public static void main(String[] args) throws Exception {
        if (args.length != 1) {
            System.out.println("Usage: java Exercise12_20 srcRootDirectory");
            System.exit(1);
        }

        File curDir = new File(args[0]);

        if (!curDir.exists()) {
            System.out.println("Current directory " + args[0] + " does not exist");
            System.exit(2);
        }

        if (!curDir.isDirectory()) {
            System.out.println(args[0] + " is not a directory");
            System.exit(3);
        } else {
            File[] files = curDir.listFiles();
            for (int i = 0; i < files.length; i++)
                if (files[i].isDirectory() && files[i].getName().startsWith("chapter")) {
                    deleteStatementsInDirectory(files[i]);
                }
        }


    }

    private static void deleteStatementsInDirectory(File directory)
            throws Exception {
        File[] files = directory.listFiles();

        for (int i = 0; i < files.length; i++)
            if (files[i].isFile() && files[i].getName().endsWith(".java")) {
                deleteStatement(files[i]);
            }
    }

    private static void deleteStatement(File file) throws Exception {
        StringBuilder sb = new StringBuilder();

        try (
                Scanner input = new Scanner(file)) {

            String firstLine = input.nextLine();
            if (!firstLine.toString().startsWith("package"))
                sb.append(firstLine + "\r\n");

            while (input.hasNext()) {
                sb.append(input.nextLine() + "\r\n");
            }
        }

        try (
              PrintWriter output = new PrintWriter(file);
        ) {
            output.printf("%s", sb.toString());
        }
    }

}
