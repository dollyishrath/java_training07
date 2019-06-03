package com.trimindtech.training.day07.day0701;

import com.trimindtech.training.day07.day0701.Account;

public class Savings extends Account {
    private final static double rateOfInterest=2;

    public Savings(long accountNumber, double balance, String dateCreated) {
        super(accountNumber, balance, dateCreated);
    }
    public void calculateAmount(double time){
        double x = (1+rateOfInterest/100);
        double amount = super.getBalance()*Math.pow(x,time);
            System.out.println("the total amount"+time+"years is"+amount);
        }
    }


