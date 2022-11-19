package com.bridgelabz;

import java.util.Scanner;

public class StockReport {

    static int totalValue;
    String Stock_Name;

    static int calculate(int No_Of_Shares, int Share_Price) {

        return totalValue = No_Of_Shares * Share_Price;

    }

    void print() {

        System.out.println("Total stock : " + totalValue);
    }

    public void addData() {
        StockReport stockReport = new StockReport();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Stock name :");
        String name = sc.next();

        System.out.print("Enter the number of shares :");
        int No_Of_Shares = sc.nextInt();

        System.out.print("Enter the price of the Share :");
        int Share_Price = sc.nextInt();
        calculate(No_Of_Shares, Share_Price);

        stockReport.print();
    }

    public static void main(String[] args) {
        StockReport stockReport = new StockReport();
        stockReport.addData();
        Scanner sc = new Scanner(System.in);

        System.out.println("Do you want to add more items y/n");
        String str = sc.next();
        switch (str) {
            case "y":
                stockReport.addData();
                break;
            case "n":
                System.out.println("No more item to add ");
                break;
        }

    }
}
