package day41;

import day40.BankAccount;
public class AccessModifierIntro {

    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();
        b1.showAccountBalance();
        // public modifier can be used for fields and methods
        // currently we care about of 3:
        // public --->> accessible everywhere
        // (default) ---->> accessible only within the same package
        // private --->> accessible only within same class
        Person p1 = new Person();
//     p1.name ="Hasan";
//     p1.age = 19;
//     p1.ssn = 123456789;
        p1.setAll("Hasan", 34, 1234123412);
        System.out.println(p1);
        System.out.println(p1.getName());
        p1.setName("Yerkhanat");
        System.out.println(p1.getName());
        p1.setSsn(1234123423);
        System.out.println(p1.getSsn());
        p1.setAge(28);
        System.out.println(p1.getAge());
        int yerqaAge = p1.getAge();

    Product pr = new Product();
    pr.setName("Iphone");
    pr.setPrice(799.99);
        System.out.println("Product name is "+pr.getName()+" and it will cost $"+pr.getPrice());



    }
}
