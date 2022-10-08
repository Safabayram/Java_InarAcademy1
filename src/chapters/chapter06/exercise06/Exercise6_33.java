package chapters.chapter06.exercise06;

public class Exercise6_33 {
    public static void main(String[] args) {
        long totalMilliseconds = System.currentTimeMillis();

        String yearAndMonthAndDay = getYearAndMonthAndDay(totalMilliseconds);
        System.out.print("Current date and time is " + yearAndMonthAndDay);
        System.out.print("  " + getCurrentTime(totalMilliseconds));

    }

    public static String getCurrentTime(long totalMilliseconds) {
        long totalSeconds = totalMilliseconds / 1000;
        long currentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHour = totalHours % 24;
        return currentHour + ":" + currentMinute + ":" + currentSecond ;

    }

    public static boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }

    public static String getYearAndMonthAndDay(long totalMilliseconds) {
        final int START_DAY_FOR_JAN_1_1800 = 3;
        long totalSeconds = totalMilliseconds / 1000;
        long currentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long totalDays = totalHours / 24;
        int year = 1970;

        int currentDay = (START_DAY_FOR_JAN_1_1800 + (int) totalDays + 1 ) % 7;
        String dayName = getDayName(currentDay);

        while (totalDays > 365) {
            if (isLeapYear(year)) {
                totalDays -= 366;
                year++;
            } else {
                totalDays -= 365;
                year++;
            }
        }
        int remainingDays = (int) totalDays;
        int month = getMonth(remainingDays, year) ;
        String monthName = getMonthName(month);
        int dayNumber = getDayNumber(remainingDays , year , month) + 1  ;

        return monthName + " " + dayNumber + " ,  " + year ;
    }

    public static int getDayNumber(int remainingDays, int year , int month) {
        int monthCount = 1 ;
        while (monthCount < month) {
            remainingDays -= getNumberOfDaysInMonth(year,monthCount) ;
            monthCount++;
        }
        return remainingDays ;

    }

    public static int getNumberOfDaysInMonth(int year, int month) {
        if (month == 1 || month == 3 || month == 5 || month == 7 ||
                month == 8 || month == 10 || month == 12){
            return 31;
        }
        if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        }
        if (month == 2){
            return isLeapYear(year) ? 29 : 28;
        }
        return 0;

    }

    public static String getDayName(int currentDay) {
        String name = "";
        switch (currentDay) {
            case 0:
                name = "Sunday";
                break;
            case 1:
                name = "Monday";
                break;
            case 2:
                name = "Tuesday";
                break;
            case 3:
                name = "Wednesday";
                break;
            case 4:
                name = "Thursday";
                break;
            case 5:
                name = "Friday";
                break;
            case 6:
                name = "Saturday";

        }
        return name;
    }

    public static int getMonth(int remainingDays, int year) {
        int month = 1;
        int days = 0;
        while (days < remainingDays) {
            switch (month) {
                case 1:
                    days += 31;
                    break;
                case 2:
                    days += (isLeapYear(year)) ? 29 : 28;
                    break;
                case 3:
                    days += 31;
                    break;
                case 4:
                    days += 30;
                    break;
                case 5:
                    days += 31;
                    break;
                case 6:
                    days += 30;
                    break;
                case 7:
                    days += 31;
                    break;
                case 8:
                    days += 31;
                    break;
                case 9:
                    days += 30;
                    break;
                case 10:
                    days += 31;
                    break;
                case 11:
                    days += 30;
                    break;
                case 12:
                    days += 31;
            }
            month++;
        }
        return (month - 1);
    }

    public static String getMonthName(int month) {
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
}