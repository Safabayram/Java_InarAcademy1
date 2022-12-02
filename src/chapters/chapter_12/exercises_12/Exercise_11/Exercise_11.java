package chapters.chapter_12.exercises_12.Exercise_11;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exercise_11 {
    public static void main(String[] args) throws IOException {
        if (args.length != 2) {
            System.out.println("Usage: removeString filename ");
            System.exit(1);
        }

        File file = new File(args[1]);
        if (!file.exists()) {
            System.out.println("File " + args[1] + " does not exist");
            System.exit(2);


        }
        String s = "";
        try {
            Scanner input = new Scanner(file);
            while (input.hasNext()) {
                s += input.nextLine();
            }

        } catch (FileNotFoundException ex) {
            ex.getMessage();
        }
        s = s.replaceAll(args[0],"" );
        try {
            PrintWriter output = new PrintWriter(file);
            output.write(s);
            output.close();
        }catch (FileNotFoundException ex){
            ex.getMessage();
        }




    }

}
