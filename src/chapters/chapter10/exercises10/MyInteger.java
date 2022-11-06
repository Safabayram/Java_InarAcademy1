package chapters.chapter10.exercises10;

public class MyInteger {
    private int value;

    public MyInteger() {
        this(1);
    }

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public boolean isEven() {
        return isEven(value);
    }


    public boolean isOdd() {
        return isOdd(value);
    }


    public boolean isPrime() {
        return isPrime(value);
    }


    public static boolean isEven(int value) {
        return value % 2 == 0;
    }


    public static boolean isOdd(int value) {
        return value % 2 != 0;
    }


    public static boolean isPrime(int value) {
        for (int divisor = 2; divisor <= value / 2; divisor++) {
            if (value % divisor == 0)
                return false;
        }
        return true;
    }


    public static boolean isEven(MyInteger number) {
        return number.isEven();
    }


    public static boolean isOdd(MyInteger number) {
        return number.isOdd();
    }


    public static boolean isPrime(MyInteger number) {
        return number.isPrime();
    }


    public boolean equals(int value) {
        return this.value == value;
    }


    public boolean equals(MyInteger number) {
        return number.value == this.value;
    }


    public static int parseInt(char[] arr) {
        int number = 0;
        int forDecimalValue = 0;
        for (int i = arr.length - 1; i >= 0; i--) {

            number += (arr[i] - '0') * Math.pow(10, forDecimalValue++);
        }
        return number;
    }

    public static int parseInt(String number) {
        return parseInt(number.toCharArray());
    }


}
