package oopconcepts;

public class Account {
    int accountNo;
    String accountName;
    float amount;

void insert(int ac,String s,float amt){
    accountNo=ac;
    accountName=s;
    amount=amt;
}
    void deposit(float amt){
        amount=amount+amt;
        System.out.println("Depsited:"+amt); }


    void withdraw (float amt){
        if (amount<amt){
            System.out.println("Not enough funds to withdraw");
        }else {
            amount = amount-amt;
            System.out.println("amt: " + amt + " withdrawn");}

}
void checkBalance(){
    System.out.println("balance is:"+amount);


}
void Print()
{
    System.out.println("Account Info: "+ " "+ accountNo + " " + accountName + " " + amount);
}


}



