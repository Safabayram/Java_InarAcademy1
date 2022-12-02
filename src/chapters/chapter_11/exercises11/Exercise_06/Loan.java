package chapters.chapter_11.exercises11.Exercise_06;

import java.util.Date;

public class Loan {
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private java.util.Date loanDate;

    public Loan() {
        this(0, 0, 0, new Date());
    }

    public Loan(double annualInterestRate, int numberOfYears, double loanAmount, Date loanDate) {
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;


    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public int getNumberOfYears() {
        return numberOfYears;
    }

    public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public Date getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(Date loanDate) {
        this.loanDate = loanDate;
    }

    @Override
    public String toString() {
        return "Loan{" +
                "annualInterestRate=" + annualInterestRate +
                ", numberOfYears=" + numberOfYears +
                ", loanAmount=" + loanAmount +
                ", loanDate=" + loanDate +
                '}';
    }
}
