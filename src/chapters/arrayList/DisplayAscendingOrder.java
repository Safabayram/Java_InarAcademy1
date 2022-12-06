package chapters.arrayList;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DisplayAscendingOrder {
    public static void main(String[] args) throws Exception {
        ArrayList<String> words = new ArrayList<>();

        File file = new File(args[0]);

        try(
                Scanner input = new Scanner(file);
                ){
            while (input.hasNext()){
                String s = input.next();
                if (Character.isLetter(s.charAt(0))){
                    words.add(s);
                }
            }
        }


        Collections.sort(words);





    }

}
