package day38;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListPractice_ShortWay {
    public static void main(String[] args) {

        List<Double> prices = Arrays.asList(9.99, 5.55, 3.76 , 8.99, 0.99, 65.67);
        int count = 0 ;
        for (double each:prices
             ) {if (each>5){
                 ++count;
        }

        }
        System.out.println("count = " + count);
        ArrayList<Double> newPrices = new ArrayList<>(prices);
        newPrices.add(9.99);
        newPrices.add(20.99);
        System.out.println(newPrices);
        newPrices.remove(newPrices.indexOf(0.99));
        System.out.println(newPrices);
        // Create an ArrayList Object in one short with many items so we can add or remove
        ArrayList<Double> oneShotPrice = new ArrayList<>(Arrays.asList(9.99, 5.55, 3.76 , 8.99, 0.99, 65.67));
        oneShotPrice.add(1,100.99);
        oneShotPrice.remove(2);
        oneShotPrice.remove(2);
        System.out.println(oneShotPrice);







    }
}
