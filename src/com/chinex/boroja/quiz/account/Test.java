package com.chinex.boroja.quiz.account;

/**
 *  * Write a test program that creates an Account object with an account ID of 1122,
 *  * a balance of $20,000, and an annual interest rate of 4.5%. Use the withdraw
 *  * method to withdraw $2,500, use the deposit method to deposit $3,000, and print
 *  * the balance, the monthly interest, and the date when this account was created.
 */
public class Test {
    public static void main(String[] args) {
        Account account = new Account("Odogwu", 1122, 1000.0);
        account.setAnnualInterestRate(1.5);

        account.deposit(30.0);
        account.deposit(40.0);
        account.deposit(50.0);
        account.withdraw(5.0);
        account.withdraw(4.0);
        account.withdraw(2.0);

        System.out.println("Account holder: " + account.getName());
        System.out.printf("The balance in the account is: #%.2f\n",  account.getBalance());
        System.out.printf("The account monthly interest is: #%.2f\n",  account.getMonthlyInterest());
        System.out.println("Interest rate: " + account.getAnnualInterestRate() + "%");
        System.out.println("The date of account creation is: " + account.getDateCreated());

        System.out.println("Account summary");
        for (Transaction transaction: account.getTransactions()) {
            System.out.println(transaction.getDateCreated() + "\n" + transaction.getType() +
                    "\n" + transaction.getAmount() + "\n" + transaction.getBalance() +
                    "\n" + transaction.getDescription());
            System.out.println();
        }
    }
}
