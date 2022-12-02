package chapters.chapter_10.exercises10;

public class MyStringBuilder1Test {
    public static void main(String[] args) {

        MyStringBuilder1 myStringBuilder1 = new MyStringBuilder1("safaBAyram");

        myStringBuilder1.toLowerCase();

        System.out.println(myStringBuilder1);

        MyStringBuilder1 myStringBuilder11 = new MyStringBuilder1("safa");

        myStringBuilder1.append(myStringBuilder11);

        System.out.println(myStringBuilder1.append(myStringBuilder11));

        myStringBuilder1.substring(3,5);

        System.out.println(myStringBuilder1);




    }


}
