package chapters.chapter12.exercises_12.Exercise_15;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercise_15 {
    public static void main(String[] args) throws Exception {
        File file = new File("Exercise12_15.txt");
        if (!file.exists()) {
            System.out.println("File " + args[0] + " does not exist");
            System.exit(0);
        }

        try (
                PrintWriter output = new PrintWriter(file);
        ) {
            for (int i = 0; i < 100; i++) {
                output.print((int) (Math.random() * 1000) + " ");
            }


        }
        ArrayList<Integer> list = new ArrayList<>();

        try(

                Scanner read = new Scanner(file);
        )

        {
            while (read.hasNext()) {
                list.add(read.nextInt());
            }
        }

        Collections.sort(list);

        System.out.println(list.toString());
        System.out.println();


    }




}


