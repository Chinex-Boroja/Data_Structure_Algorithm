package com.chinex.boroja.quiz.account;

/**
 *  * Write a test program that creates an Account object with an account ID of 1122,
 *  * a balance of $20,000, and an annual interest rate of 4.5%. Use the withdraw
 *  * method to withdraw $2,500, use the deposit method to deposit $3,000, and print
 *  * the balance, the monthly interest, and the date when this account was created.
 */
public class Test {
    public static void main(String[] args) {
        Account account = new Account(1122, 20000.0);
        account.setAnnualInterestRate(4.5);

        account.withdraw(2500.0);
        account.deposit(3000.0);
        System.out.printf("The balance in the account is: #%.2f\n",  account.getBalance());
        System.out.printf("The account monthly interest is: #%.2f\n",  account.getMonthlyInterest());
        System.out.println("The date of account creation is: " + account.getDateCreated());
    }
}
