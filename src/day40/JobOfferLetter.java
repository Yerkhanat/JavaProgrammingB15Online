package day40;

import java.util.ArrayList;

public class JobOfferLetter {
    public static void main(String[] args) {
        Offer s1 = new Offer();
        Offer s2 = new Offer();
        s1.company = "Apple";
        s1.salary = 120000l;
        s1.location = "Silicone Valley";
       // s1.displayInformation();
        s2.company = "Google";
        s2.salary = 140000l;
        s2.location = "Irvine";
        //s2.displayInformation();
        ArrayList<Offer> myOffers = new ArrayList<>();
        myOffers.add(s1);
        myOffers.add(s2);

        for (Offer each:myOffers
             ) {
            each.displayInformation();
        }


    }
}
