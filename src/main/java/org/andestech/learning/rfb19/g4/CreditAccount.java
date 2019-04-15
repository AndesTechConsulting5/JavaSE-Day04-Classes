package org.andestech.learning.rfb19.g4;

public class CreditAccount {
    private double balance;
    private int id;

    public static CreditAccount createCreditAccount(double balance, int id)
    {
        // check
        //
        if(true) return new CreditAccount(balance,id);
        else return null;
    }


    private CreditAccount(double balance, int id) {
        this.balance = balance;
        this.id = id;
    }


    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

}
