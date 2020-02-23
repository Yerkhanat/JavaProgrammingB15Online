package day63;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapOfGrocery {
    public static void main(String[] args) {
        Map<String, Double> groceryLst = new LinkedHashMap<>();

        groceryLst.put("Apple",0.19);
        groceryLst.put("Tomato", 1.99);
        groceryLst.put("Banana", 0.95);
        groceryLst.put("Avacado ", 3.29);
        groceryLst.put("Pineapple", 2.99);
        groceryLst.put("Oranges", 2.45);
        groceryLst.put("Onions", 1.32);
        System.out.println("item list quantity = " + groceryLst.size());
        System.out.println("groceryLst = " + groceryLst);
        groceryLst.putIfAbsent("Oranges",3.00);
        System.out.println("third item value "+ groceryLst.get("Banana"));
        groceryLst.put("Apple", groceryLst.get("Apple")*2);
        groceryLst.put("Onions", groceryLst.get("Onions")*2);

        groceryLst.remove("Tomato");
        System.out.println(groceryLst);

        String str = "AAABBCDDDD";

       // Map<String, Integer> charFrequencyMap = new HashMap<>();
        String s="";
        for (int i = 0; i < str.length(); i++) {
            if (!s.contains("" + str.charAt(i))) {
                s += str.charAt(i);
            }
        }
        Map<Character,Integer> charFrequencyMap=new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (s.charAt(i) == str.charAt(j)) {
                    count++;
                }

            }
            charFrequencyMap.put(s.charAt(i),count);
        }
        System.out.println("charFrequencyMap = " + charFrequencyMap);








    }
}
