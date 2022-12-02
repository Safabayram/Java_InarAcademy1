package chapters.chapter_09.exercises09;

import java.util.GregorianCalendar;

public class GregorianCalendarTest {
    public static void main(String[] args) {
        GregorianCalendar calendar = new GregorianCalendar();
        System.out.println(calendar.get(GregorianCalendar.YEAR) + " " + calendar.get(GregorianCalendar.MONTH) + " " + calendar.get(GregorianCalendar.DAY_OF_MONTH));
        calendar.setTimeInMillis(1234567898765L);
        System.out.println(calendar.get(GregorianCalendar.YEAR) + " " + calendar.get(GregorianCalendar.MONTH) + " " + calendar.get(GregorianCalendar.DAY_OF_MONTH));
    }
}




