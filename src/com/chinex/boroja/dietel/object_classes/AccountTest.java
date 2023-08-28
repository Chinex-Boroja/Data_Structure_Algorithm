package com.chinex.boroja.dietel.object_classes;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // create an Account object and assign it to myAccount
        Account myAccount = new Account();
        // display initial value of name (null)
        System.out.printf("Initial name is: %s%n%n", myAccount.getName());

        // prompt for and read name
        System.out.println("Please enter the name:");
        String theName = input.nextLine();
        myAccount.setName(theName);
        System.out.println();

        System.out.printf("Name is object myAccount is:%n%s%n", myAccount.getName());
    }
}
