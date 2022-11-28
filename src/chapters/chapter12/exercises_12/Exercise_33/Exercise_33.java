package chapters.chapter12.exercises_12.Exercise_33;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise_33 {
    public static void main(String[] args) {
        String word =  "Computer Programming";

        String startingURL =  "http://cs.armstrong.edu/liang";

        crawler(startingURL,word);
    }

    private static void crawler(String startingURL, String word) {
        ArrayList<String> listOfPendingURLs = new ArrayList<>();
        ArrayList<String> listOfTraversedURLs = new ArrayList<>();

        listOfPendingURLs.add(startingURL);
        while (!listOfPendingURLs.isEmpty()){
            String url = listOfPendingURLs.remove(0);
            if (!listOfTraversedURLs.contains(url)){
                listOfTraversedURLs.add(url);
                if (containsWord(url,word)){
                    System.out.println("The word " + word +
                            " was found on URL: " + url);
                    System.exit(0);
                }
            }
        }

    }

    public static boolean containsWord(String url, String word) {

        ArrayList<String> list = new ArrayList<>();

        try {
            URL urlsString=new URL(url);
            Scanner input = new Scanner(urlsString.openStream());

            while (input.hasNext()){
                String line = input.nextLine();
                if (line.contains(word)){
                    return true;
                }
            }

        }catch (MalformedURLException ex){
            System.out.println(ex.getMessage());
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }
        return false;
    }


}
