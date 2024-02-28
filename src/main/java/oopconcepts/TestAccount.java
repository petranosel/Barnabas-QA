package oopconcepts;

public class TestAccount {
    public static void main(String[] args) {
        Account account =new Account();
        account.insert(123,"Barnabas",1000);
        account.Print();

        account.checkBalance();
        account.deposit(1500f);
        account.checkBalance();
        account.withdraw(850f);
         account.checkBalance();
        account.checkBalance();}

    









}
