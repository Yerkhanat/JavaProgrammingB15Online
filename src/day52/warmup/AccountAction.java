package day52.warmup;

public class AccountAction {
    public static void main(String[] args) {
        Account a1 = new Account("Hannah", 15000);
        Account a2 = new Account("Deposit", 300);
        System.out.println(a1);
        System.out.println(a2);
        a1.transferAll(a2 );
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a1.isPalindrome());
    }
}
