package com.chinex.boroja.quiz.account;

import java.util.ArrayList;
import java.util.Date;

/**
 *  Design a class named Account that contains:
 *  ■ A private int data field named id for the account (default 0).
 *  ■ A private double data field named balance for the account (default 0).
 *  ■ A private double data field named annualInterestRate that stores the current interest rate (default 0).
 *  Assume all accounts have the same interest rate.
 *  ■ A private Date data field named dateCreated that stores the date when the account was created.
 *  ■ A no-arg constructor that creates a default account.
 *  ■ A constructor that creates an account with the specified id and initial balance.
 *  ■ The accessor and mutator methods for id, balance, and annualInterestRate.
 *  ■ The accessor method for dateCreated.
 *  ■ A method named getMonthlyInterestRate() that returns the monthly interest rate.
 *  ■ A method named getMonthlyInterest() that returns the monthly interest.
 *  ■ A method named withdraw that withdraws a specified amount from the account.
 *  ■ A method named deposit that deposits a specified amount to the account.
 *
 *
 * Created by: IHEDIOHA Chinedu Innocent
 * Date: 08-03-2023
 */
public class Account {

    private String name;
    private int id;
    private double balance;

    private double annualInterestRate;

    private Date dateCreated;

    private ArrayList<Transaction> transactions;

    public Account() {
        this(" ", 0, 0.0);
        annualInterestRate = 0.0;
        dateCreated = new Date();
    }

    public Account(String name, int id, double balance) {
        this.name = name;
        this.id = id;
        this.balance = balance;
        annualInterestRate = 0.0;
        this.transactions = new ArrayList<>();
        dateCreated = new Date();
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public double getMonthlyInterestRate() {
        return annualInterestRate / 1200.0;
    }

    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate();
    }

    public void withdraw(double amount) {
        if (balance < amount) {
            System.out.println("Invalid withdrawal amount");
        }
        balance = balance - amount;
        transactions.add(new Transaction('W', amount, balance, "Withdrawal"));
    }

    public void deposit(double amount) {
        balance = balance + amount;
        transactions.add(new Transaction('D', amount, balance, "Deposit"));
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }
}
