package org.andestech.learning.rfb19.g4;



public class App 
{
    public static void main( String[] args )
    {
      Customer c1 = new Customer("Jim", "Kerry", "LA");
      Account account = new Account(c1,2864786);

      System.out.println(account.getBalance());

       account.setBalance(200);
       System.out.println(account.getBalance());

        account.setBalance(2_000_000);
        System.out.println(account.getBalance());
        account.setBalance(100);
        System.out.println(account.getBalance());
        account.setBalance(5);
        System.out.println(account.getBalance());

        new Account(c1,28234234);
        new Account(c1,657567657);
        new Account(c1,12312312);

        System.out.println("Couter: " + Account.getCounter());

        //-----------

        CreditAccount creditAccount =
                CreditAccount.createCreditAccount(100,12312312);

    }
}
