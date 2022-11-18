package com.bridgelabz;

import java.util.Scanner;

public class AccountTest {

    public static void main(String[] args) {

        System.out.println("Welcome to Object Oriented Programs");

        Account account = new Account(1000);//object
        System.out.println("Account Balance : "+account.getBalance());

        Scanner sc = new Scanner(System.in);

        System.out.print("enter amount for debit: ");
        int debitAmount = sc.nextInt();
        account.debit(debitAmount);

        System.out.println("Account Balance: "+ account.getBalance());

        System.out.print("Enter amount for Credit: ");
        int creditAmount = sc.nextInt();

        account.credit(creditAmount);

        System.out.println("Account Balance : "+account.getBalance());
    }
}
