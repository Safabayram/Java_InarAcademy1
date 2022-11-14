package chapters.chapter11.sampleQuestions;

import java.util.ArrayList;

public class TestArrayList {
    public static void main(String[] args) {
        ArrayList<String> brands = new ArrayList<>();

        brands.add("ferrari");
        brands.add("ford");
        brands.add("amazon");
        brands.add("apple");

        System.out.println("list size : " + brands.size());

        System.out.println("is ford in the list " + brands.contains("ford"));

        System.out.println("the location of ferrari in the list " + brands.indexOf("ferrari"));

        System.out.println("is the list empty " + brands.isEmpty());


        brands.remove("apple");

        System.out.println(brands.toString());


    }


}
