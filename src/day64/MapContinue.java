package day64;

import java.util.*;

public class MapContinue {
    public static void main(String[] args) {
        Map<String, Double> groceryPriceMap = new HashMap<>();
        groceryPriceMap.put("Tomato", 1.99);
        groceryPriceMap.put("Potato", 1.99);
        groceryPriceMap.put("Tomato", 3.00);
        groceryPriceMap.put("Grape", 3.99);
        groceryPriceMap.put("Banana", 1.99);
        groceryPriceMap.put("Apple", 1.89);
        groceryPriceMap.putIfAbsent("Fish", 12.99);
        groceryPriceMap.putIfAbsent("Apple", 100.0);

        Set<String> allNames =groceryPriceMap.keySet();
        System.out.println(allNames);
        //allNames.remove("Tomato");
       // System.out.println("list without tomato "+ allNames);
        Set<String> namesCopy = new HashSet<>(groceryPriceMap.keySet());
        namesCopy.remove("Tomato");
        System.out.println(namesCopy);
        System.out.println(allNames);
        System.out.println(groceryPriceMap);

        for (String eachName: allNames
             ) {
            System.out.println(eachName);

            System.out.println(" | value is "+ groceryPriceMap.get(eachName));

        }

        Collection<Double> allPrices = groceryPriceMap.values();
        allPrices.remove(1.99);
        System.out.println(groceryPriceMap);

        List<Double> pricesCopy = new ArrayList<>(allPrices);
        //pricesCopy.removeIf(each -> each > 3.0);

        Iterator<Double> itr = pricesCopy.iterator();
        while(itr.hasNext()){
            if(itr.next()>3){
                itr.remove();
            }
        }




    }
}
