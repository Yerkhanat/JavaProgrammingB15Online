package day52.warmup;

public class Account implements Transferable, Comparable<Account> {
    protected String name;
    private int balance;

    public Account(String name, int balance){
        this.name =name;
        this.balance =balance;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int balance){
        this.balance+=balance;

    } public void withdraw(int balance){
        this.balance -=balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }

    @Override
    public void transferAll(Account otherAccount) {
//        otherAccount.balance += this.balance;
//        this.balance =0;
        otherAccount.deposit(this.balance);
        this.withdraw(this.balance);
    }

    public boolean isPalindrome(){
        String temp = this.name.replace(" ","").toLowerCase();
        char [] reverse = temp.toCharArray();
        String rvr ="";
        for (int i = reverse.length-1; i >=0 ; i--) {
            rvr+=reverse[i];


        }
        return rvr.equals(temp);
    }

    @Override
    public int compareTo(Account o) {
        return this.balance-o.balance;
    }
}
