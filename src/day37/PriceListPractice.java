package day37;

import java.util.ArrayList;
import java.util.List;

public class PriceListPractice {
    public static void main(String[] args) {
        List<Double> priceList = new ArrayList<>();
        priceList.add(9.99);
        priceList.add(12.99);
        priceList.add(2.39);
        priceList.add(3.95);
        priceList.add(11.29);
        priceList.add(1.2);
        priceList.add(3.99);
        priceList.add(65.59);
        priceList.add(999.99);

        System.out.println("Price list = "+priceList);

      priceList.set(2,10.00);
        System.out.println("Price list = "+priceList);







    }
}
