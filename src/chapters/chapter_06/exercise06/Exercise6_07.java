package chapters.chapter_06.exercise06;

import java.util.Scanner;

public class Exercise6_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter investment amount: ");

        double investmentAmount = input.nextDouble();
        System.out.println("Enter annual interest rate in percentage: ");

        double interestRate = input.nextDouble() / 1200;

        System.out.println("Enter number of years: ");

        int years = input.nextInt();
        System.out.println("YEARS        FUTURE VALUE");

        for (int i = 1; i <= years; i++) {
            System.out.println(i + "           " + futureInvestmentValue(investmentAmount, interestRate, i));

        }


    }

    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
        double futureInvestmentValue = investmentAmount * Math.pow((1 + monthlyInterestRate), years * 12);
        return futureInvestmentValue;

    }

}
