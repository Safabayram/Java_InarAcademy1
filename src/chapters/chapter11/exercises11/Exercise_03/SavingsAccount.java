package chapters.chapter11.exercises11.Exercise_03;

import chapters.chapter09.exercises09.Account;

public class SavingsAccount extends Account {
    public SavingsAccount() {
    }

    public SavingsAccount(int id, double balance, double annualInterestRate) {
        super(id, balance, annualInterestRate);
    }
    public void withdraw(double amount) {
        if (amount < getBalance()) {
            setBalance(getBalance() - amount);
        }
        else
            System.err.println(
                    "Amount exeeds balance limit!");
    }
    public String toString(){
        return super.toString() + " Saving Account ";
    }



}
