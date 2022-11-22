package chapters.chapter12.exercises_12.Exercise_18;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exercise_18 {
    public static void main(String[] args) throws Exception {
        if (args.length != 1) {
            System.out.println("Usage: java Exercise12_18 srcRootDirectory");
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
            for (int i = 0; i < files.length; i++) {
                if (files[i].isDirectory() && files[i].getName().startsWith("chapter")) {
                    String pack = "package" + files[i].getName() +"\\";
                    insertDir(files[i],pack);

                }
            }


        }

    }

    private static void insertDir(File directory, String line) throws Exception {
        File[] files = directory.listFiles();

        for (int i = 0; i < files.length; i++)
            if (files[i].isFile() && files[i].getName().endsWith(".java")) {
                insertFilesIntoPack(files[i], line);
            }
    }

    private static void insertFilesIntoPack(File file, String line) throws Exception {
        StringBuilder sb = new StringBuilder(line);

        try (
                Scanner input = new Scanner(file);
        ) {
            while (input.hasNext())
                sb.append("\r\n" + input.nextLine());
        }

        try (

                PrintWriter output = new PrintWriter(file);
        ) {
            output.printf("%s\r\n", sb.toString());
        }
    }
}
