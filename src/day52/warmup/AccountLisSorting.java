package day52.warmup;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AccountLisSorting {
    public static void main(String[] args) {
        List<Account> accountList= new ArrayList<>();
        accountList.add(new Account ("John Snow",10000));
        accountList.add(new Account ("Vald ",11000));
        accountList.add(new Account ("Svetlana",13000));
        accountList.add(new Account ("Muhammad",8000));
        accountList.add(new Account ("Emme",17000));
        accountList.add(new Account ("Ata",15000));

        System.out.println(accountList);
        Collections.sort(accountList);
        System.out.println(accountList);
        Account a1= new Account("Yerkhanat", 0);
        int sum = 0;
        for (Account each:accountList
             ) {
            each.transferAll(a1);

        }

        System.out.println(a1);
        System.out.println(accountList);
        /*
        * Account a2;
        * Comparable a2;
        * Transferable a2;
        * Object a2;
        *
        *
         */
        Account a2 = new Account("Polymorphism1",1000);
        Transferable a3 = new Account("Polymorphism2",1000);
        Object o1=new Account("Polymorphism3",1000);



    }
}
