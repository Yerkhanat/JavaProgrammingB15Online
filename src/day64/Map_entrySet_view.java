package day64;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map_entrySet_view {
    public static void main(String[] args) {
        Map<String, Double> groceryPriceMap = new HashMap<>();
        groceryPriceMap.put("Tomato", 1.99);
        groceryPriceMap.put("Potato", 1.99);
        groceryPriceMap.put("Tomato", 3.00);
        groceryPriceMap.put("Grape", 3.99);
        groceryPriceMap.put("Banana", 1.99);
        groceryPriceMap.put("Apple", 1.89);

        Set<Map.Entry<String, Double>> entryView = groceryPriceMap.entrySet();
        //Map<String, Double> each = new HashMap<>();

        for (Map.Entry<String, Double> each :entryView) {
            //System.out.println("each.getKey() = " + each.getKey());
            if(each.getKey().length()==5){
                each.setValue(15.0);

            }


        }
        System.out.println("groceryPriceMap = " + groceryPriceMap);



    }
}
