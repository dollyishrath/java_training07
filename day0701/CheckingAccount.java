package com.trimindtech.training.day07.day0701;

import com.trimindtech.training.day07.day0701.Account;

public class CheckingAccount extends Account {
    private static final int noOfTransactions = 5;

    public CheckingAccount(long accountNumber, double balance, String dateCreated){
        super(accountNumber, balance, dateCreated);
    }
    public  void costForAdditionalTransactions(int transaction){
        if(transaction>noOfTransactions) {
            double money = (transaction - noOfTransactions) * 5;
            System.out.println("thank u sir\n");
            System.out.println("tax applied for transaction is in rupees" + money);
        }
        else{
            System.out.println("thank u sir");
        }
    }

}
