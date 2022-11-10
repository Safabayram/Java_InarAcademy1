package chapters.chapter10.exercises10;

public class MyStringBuilder2Test {
    public static void main(String[] args) {


        MyStringBuilder2 str = new MyStringBuilder2("safaBayram");

        char[] chars = {'I', 'N', 'A', 'R'};
        MyStringBuilder2 str1 = new MyStringBuilder2(chars);

        MyStringBuilder2 str3 = str.insert(2, str1);

        System.out.println(str);


        System.out.println(str.reverse());

        System.out.println(str1.substring(1));



    }







}
