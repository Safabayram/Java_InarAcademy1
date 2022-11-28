package chapters.chapter12.exercises_12.Exercise_28;

import java.io.File;

public class Exercise_28 {
    public static void main(String[] args) {
        System.out.println("Usage: java Exercise12_28 * ");

        for (int i = 0; i < args.length; i++) {
            if (args[i].matches("Exercise[\\d]_.*")) {
                String s = args[i];
                String addedName = s.substring(0, s.indexOf('_') - 1) + "0" + s.substring(s.indexOf('_') - 1);

                File file = new File(args[i]);
                file.renameTo(new File(addedName));
            }

        }


    }
}
