package chapters.chapter11.exercises11.Exercise_08;

import java.util.ArrayList;
import java.util.Date;

public class Account {
    private int id;
    private String name;
    private double balance;
    private static double annualInterestRate;
    private java.util.Date dateCreated;
    private java.util.ArrayList<Transaction> transactions = new java.util.ArrayList<>();

    public Account(){
        this(0,null,0);
    }



    public Account(int id, String name, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public  void setAnnualInterestRate(double annualInterestRate) {
        Account.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(ArrayList<Transaction> transactions) {
        this.transactions = transactions;
    }
    public double getMonthlyInterest() {
        return balance * (annualInterestRate / 1200);
    }
    public void withdraw(double amount) {
        balance -= amount;
        transactions.add(new Transaction('W', amount, balance, ""));
    }

    public void deposit(double amount) {
        balance += amount;
        transactions.add(new Transaction('D', amount, balance, ""));
    }


}
