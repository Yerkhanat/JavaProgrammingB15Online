package day63;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListToMapePractice {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Abraham Hope");
        names.add("Zeliha Sezer");
        names.add("Tugba Bekar");
        names.add("Birnigar Ozyurt");
        names.add("Seda Civan");
        names.add("Nuran Demir");
        names.add("Murat Kilinc");
        names.add("Hakan Durmus");
        names.add("Nuran Demir");
        names.add("Mariia Lukianenko");
        Map<String, Integer> nameCharCountPair = new HashMap<>();
        for (int i = 0; i <names.size() ; i++) {
            nameCharCountPair.put(names.get(i),i);
        }
        System.out.println(nameCharCountPair);


    }
}
