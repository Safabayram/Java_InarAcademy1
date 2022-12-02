package chapters.chapter_12.sampleQuestions;

import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

public class WebCrawler {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter a URL");
        String url = input.nextLine();

        crawler(url);
    }

    public static void crawler(String url) {
        ArrayList<String> listOfPendingURLs = new ArrayList<>();
        ArrayList<String> listOfTraversedURLs = new ArrayList<>();
         listOfPendingURLs.add(url);

         while (!listOfPendingURLs.isEmpty() && listOfTraversedURLs.size() <= 100){
             String urlString = listOfPendingURLs.remove(0);
             if (!listOfTraversedURLs.contains(urlString)){
                 listOfTraversedURLs.add(urlString);
                 System.out.println("Craw " + urlString);
                 for (String s:getSubURLs(urlString)
                      ) {
                     if (!listOfTraversedURLs.contains(s)){
                         listOfPendingURLs.add(s);
                     }

                 }

             }
         }
    }

    private static ArrayList<String> getSubURLs(String urlString) {

        ArrayList<String> list = new ArrayList<>();

        try {
            java.net.URL myURL = new URL(urlString);
            Scanner input = new Scanner(myURL.openStream());

            int count = 0;
            while (input.hasNext()){
                String line = input.nextLine();
                count = line.indexOf("http:",count);
                while (count > 0){
                    int endIndex = line.indexOf("\"",count);
                    if (endIndex > 0){
                        list.add(line.substring(count,endIndex));
                        count = line.indexOf("http:",endIndex);
                    }
                    else {
                        count = -1;
                    }


                }
            }

        }catch (Exception ex){
            System.out.println(ex.getCause().getMessage());
        }
        return list;
    }
}
