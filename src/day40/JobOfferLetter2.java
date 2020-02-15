package day40;

import java.util.ArrayList;

public class JobOfferLetter2 {
    public static void main(String[] args) {
        Offer s1 = new Offer();
        Offer s2 = new Offer();
        s1.company = "Apple";
        s1.salary = 120000l;
        s1.location = "Silicone Valley";
        s1.turnFullTime();
        System.out.println("=====TOSTRING===== "+s1);
        s1.displayInformation();
        s2.company = "Google";
        s2.salary = 140000l;
        s2.location = "Irvine";
        s2.turnFullTime();
        s2.displayInformation();
        s2.salary+=2000l;
       // System.out.println(s2.salary);
         Offer o4 = new Offer();
         o4.salary = s1.salary+s2.salary;
    //    System.out.println(o4.salary);

         o4.turnFullTime();
         o4.changeLocation("\"Washington DC\"");
        o4.displayInformation();
        s1.changeAllInfo("Bank Of America", "Los Angeles", 101000, true);
       // s1.displayInformation();
        System.out.println("will s1 have 100k salaray: "+s1.isOne100k());
        if(s1.isOne100k()==true){
           s1.changeLocation("\"Atlanta\"");
           s1.displayInformation();
        }
        System.out.println(s1.toString());




    }
}
