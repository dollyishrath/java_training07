package com.trimindtech.training.day07.day0701;

public class Account {
    public long accountNumber;
    public double balance;
    public String dateCreated;

    public Account (long accountNumber, double balance, String  dateCreated){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.dateCreated = dateCreated;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    public void deposit(double depositMoney){
        System.out.println("deposited amount is"+ depositMoney);
        this.balance = this.balance+depositMoney;
        System.out.println("total amount"+this.balance);

    }
    public void withdrawal(double withdrawalAmount){
        System.out.println("withdrawal amount is"+withdrawalAmount);
        this.balance = this.balance+withdrawalAmount;
        System.out.println("remaining balance"+this.balance);

    }
}
