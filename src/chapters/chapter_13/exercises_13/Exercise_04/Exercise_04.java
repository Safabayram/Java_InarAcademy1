package chapters.chapter_13.exercises_13.Exercise_04;

import java.util.Calendar;
import java.util.GregorianCalendar;


public class Exercise_04 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java Exercise_13_04 month year");
            System.exit(1);
        }
        int year = Integer.parseInt(args[1].trim());
        int month = Integer.parseInt(args[0].trim());


        Calendar myCalendar = new GregorianCalendar(year, month, 1);

        printMonth(myCalendar, year, month);


    }

    private static void printMonth(Calendar myCalendar, int year, int month) {
        int startDay = myCalendar.get(Calendar.DAY_OF_WEEK) - 1;
        int numberOfDaysInMonth = myCalendar.getActualMaximum(Calendar.DAY_OF_MONTH);

        printMonthTitle(year, month);
        printMonthBody(startDay, numberOfDaysInMonth);


    }

    private static void printMonthTitle(int year, int month) {
        System.out.println("         " + getMonthName(month) + " " + year);
        System.out.println("-----------------------------");
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
    }

    private static String getMonthName(int month) {
        String monthName = "";
        switch (month) {
            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "February";
                break;
            case 3:
                monthName = "March";
                break;
            case 4:
                monthName = "April";
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "June";
                break;
            case 7:
                monthName = "July";
                break;
            case 8:
                monthName = "August";
                break;
            case 9:
                monthName = "September";
                break;
            case 10:
                monthName = "October";
                break;
            case 11:
                monthName = "November";
                break;
            case 12:
                monthName = "December";
        }

        return monthName;
    }

    static void printMonthBody(int startDay, int numOfDaysInMonth) {

        int i = 0;

        for (i = 0; i < startDay - 1; i++)
            System.out.print("    ");

        for (i = 1; i <= numOfDaysInMonth; i++) {
            if (i < 10)
                System.out.print("   " + i);
            else
                System.out.print("  " + i);

            if ((i + startDay - 1) % 7 == 0)
                System.out.println();
        }

        System.out.println("");
    }


}
