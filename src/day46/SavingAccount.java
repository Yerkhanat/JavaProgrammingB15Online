package day46;

public class SavingAccount extends BankAccount{

    double interestRate;
    public SavingAccount(String accountHolder, long accountNum, double balance,double interesRate){
        super(accountHolder,accountNum,balance);
        this.interestRate=interesRate;

    }

    public static void main(String[] args) {

        SavingAccount s1 =new SavingAccount("Yerqa",1234,50000,4.2);

        System.out.println(s1);
       // s1.withDraw(10000);
        s1.deposit(100);
        System.out.println(s1);


    }@Override
    public void withDraw(int amount){
       super.withDraw(amount+30);



    } @Override
    public void deposit(int amount){

        super.deposit((int) (amount*(1+interestRate/100)));


    }



    @Override
    public String toString() {
        return "SavingAccount{" +
                "interestRate=" + interestRate +
                ", accountHolder='" + accountHolder + '\'' +
                ", accountNum=" + accountNum +
                ", balance=" + balance +
                '}';
    }
}
