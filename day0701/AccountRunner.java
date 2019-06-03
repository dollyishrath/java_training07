package com.trimindtech.training.day07.day0701;

import java.util.Scanner;

public class AccountRunner {
    public static void main(String[] args) {
        Savings savings = new Savings(0536101, 10000,"3/6/2019");
        System.out.println("enter no of years to calculate \n");
        Scanner sc = new Scanner(System.in);
        int noOfYear = sc.nextInt();
        savings.calculateAmount(noOfYear);

        CheckingAccount checkingAccount = new CheckingAccount(0536101,10000,"3/6/2019");
        System.out.println("enter no of transactions");
        int transactions = sc.nextInt();
        checkingAccount.costForAdditionalTransactions(transactions);

        System.out.println("enter amount that want to deposit");
        double depositMoney = sc.nextDouble();
        checkingAccount.deposit(depositMoney);
        System.out.println("enter amount that want to withdraw");
        double withdrawMoney = sc.nextDouble();
        checkingAccount.withdrawal(withdrawMoney);
    }
}
