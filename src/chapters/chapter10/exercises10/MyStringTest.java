package chapters.chapter10.exercises10;

public class MyStringTest {
    public static void main(String[] args) {
        MyString myString = new MyString(new char[]{'x', 'o', 'l'});

        System.out.println(myString.length());

        System.out.println(myString.charAt(0));


        System.out.println(myString.equals(new MyString(new char[]{'a', 'b', 'c'})));

        MyString value = myString.valueOf(145);
        for (int i = 0; i < value.length(); i++) {
            System.out.print(value.charAt(i));
        }
        System.out.println();

        MyString sub = myString.subString(0,1);
        for (int i = 0; i <sub.length() ; i++) {
            System.out.print(sub.charAt(i));

        }


    }

}
