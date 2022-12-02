package chapters.chapter_09.exercises09;


import java.util.Date;

public class DateClassTest {
    public static void main(String[] args) {
        long startTime = 10000;
        long finishTime = 100000000000L;
        Date date = new Date();

        for (long i = startTime; i <finishTime ; i*=10) {
            date.setTime(i);
            System.out.println(date.toString());

        }
    }






}
