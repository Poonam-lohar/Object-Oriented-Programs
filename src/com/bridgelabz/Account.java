package com.bridgelabz;

public class Account {

    private int balance;    //instance variable

    public Account(int initialBalance) {   //constructor

        if (initialBalance > 0)
            balance = initialBalance;
    }

    public void credit(int amount) {

        balance = balance + amount;
    }

    public void debit(int debitAmount) {
        if (debitAmount > balance)     //debitamount=0

            System.out.println("Debit amount exceeded amount balance: ");
        else
            balance = balance - debitAmount;
    }

    public int getBalance() {

        return balance;
    }

    public static void main(String[] args) {

        System.out.println("Welcome To Object Oriented Problems");
    }
}
