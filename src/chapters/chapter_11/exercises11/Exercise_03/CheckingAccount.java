package chapters.chapter_11.exercises11.Exercise_03;

import chapters.chapter_09.exercises09.Account;

public class CheckingAccount extends Account {

    private double overdraftLimit;

    public CheckingAccount() {
        super();
        overdraftLimit = -300;
    }

    public CheckingAccount(int id, double balance, double annualInterestRate) {
        super(id, balance, annualInterestRate);

    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }


    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void withdraw(double amount) {
        if (getBalance() - amount > overdraftLimit) {
            setBalance(getBalance() - amount);
        }
        else
            System.err.println("Amount exceeds overdraft limit.");
    }

    @Override
    public String toString() {
        return super.toString() + "CheckingAccount{" +
                "overdraftLimit=" + overdraftLimit +
                '}';
    }
}
