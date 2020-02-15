package day46;

public class BankAccount {
    String accountHolder;
    long accountNum;
    double balance;

    public BankAccount() {


    }

    public BankAccount(String accountHolder, long accountNum, double balance) {
       //super()
        this.accountHolder = accountHolder;
        this.accountNum = accountNum;
        this.balance = balance;
    }

    public void deposit( int balance) {
    this.balance+=balance;

    } public void withDraw(int amount){

        this.balance -=amount;
    }


}
