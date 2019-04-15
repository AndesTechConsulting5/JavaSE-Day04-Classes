package org.andestech.learning.rfb19.g4;


public class Account2 {

private static final double MAX_BALANCE = 1_000_000, MIN_BALANCE = 10;

private static int counter = 0;

public static int getCounter(){return counter;}


static
{
    System.out.println("+++ static init!");
}


private Customer customer;
private int id;
private double balance;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    //private boolean validateNewBalance(){
    private static boolean isNewBalanceValid(double balance){
        if(balance < MAX_BALANCE && balance > MIN_BALANCE)
        {return true;}
        else
        {
            System.out.println("Att! Wrong balance! " + balance);
            return false;}
    }

    private void setBalance(double balance) {
    // check
        if(isNewBalanceValid(balance))
        this.balance = balance;
    }

    private static boolean isDeltaValid(double delta){
        if(delta >=0) return true;
        else return false;
    }

    public void withdrawal(double delta){
        if(isDeltaValid(delta))
        setBalance(this.balance - delta);

    }

    public void putMoney(double delta){
        if(isDeltaValid(delta))
            setBalance(this.balance + delta);

    }


    public Account2(Customer customer, int id) {
        this.customer = customer;
        this.id = id;
        this.balance = 10.01;
        counter++;

        System.out.println("+++ ctor: " + this);

       // MIN_BALANCE = 1;
    }
}
