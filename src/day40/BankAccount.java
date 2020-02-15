package day40;

public class BankAccount {
    String accountType;
    String accountHolder;
    long accountNumber;
    double balance;
    //setAlltheBalance
    public void setAlltheBalance (String at, String ah, long an, double bl){
        accountType =at;
        accountHolder =ah;
        accountNumber=an;
        balance=bl;

    }
    // showAccount balance
    public void showAccountBalance(){
        System.out.println("Current balance = "+balance);

    }
    //showAccountHolderAccountType
    public void showAccountHolderAccountType(){
        System.out.println("Account type = "+accountType);

    }//getBalance return the balance
    public double getBalance(){


       return balance;
    }

    // deposit (amount)
    public double deposit(double amount){

        return balance+amount;
    }
    // withdraw (amount)
    public double withdraw(double amount){

        return balance-amount;
    }
    // withdraw100cash()
    public void withDraw100Cash(){

        System.out.println("Your balance after withdrawing $100 is ==>"+ withdraw(100));
    } //purchaseProducts
    public void purchaseProducts(Double productPrice, int count){

        System.out.println(withdraw(productPrice*count));;
    }



    // toString




}
