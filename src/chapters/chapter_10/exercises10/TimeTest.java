package chapters.chapter_10.exercises10;

public class TimeTest {
    public static void main(String[] args) {

        Time time1 = new Time();
        Time time2 = new Time(555550000);


        System.out.println(time1.getHour() + ":" + time1.getMinute() +
                ":" + time1. getSecond());
        System.out.println(time2.getHour() + ":" + time2.getMinute() +
                ":" + time2. getSecond());
    }

}
