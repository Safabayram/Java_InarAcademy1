package chapters.chapter11.exercises11.Exercise_06;


import chapters.chapter11.sampleQuestions.Circle;

import java.util.ArrayList;
import java.util.Date;

public class Exercise_06 {
    public static void main(String[] args) {

        ArrayList<Object> mylist = new ArrayList<Object>();
        mylist.add(new Loan());
        mylist.add(new Date());
        mylist.add(new Circle(0));
        mylist.add(new String("string"));

        for (int i = 0; i <mylist.size() ; i++) {
            System.out.println((mylist.get(i)).toString());

        }






    }
}
