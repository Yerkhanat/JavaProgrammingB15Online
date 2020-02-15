package day40;

public class AtTheBank {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();
        b1.setAlltheBalance("Saving","Yerkhanat",1234567,100000);
        b1.showAccountHolderAccountType();
        b1.showAccountBalance();
        b1.deposit(1000000);
        b1.withDraw100Cash();
        b1.showAccountBalance();
    }
}
