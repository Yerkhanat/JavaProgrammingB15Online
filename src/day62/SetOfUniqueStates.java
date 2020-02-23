package day62;

import java.util.*;

public class SetOfUniqueStates {
    public static void main(String[] args) {
        List<String > lst = Arrays.asList("TX", "CA", "CA", "GA", "TX", "IL", "WA", "WA");
        System.out.println("All states "+lst);
        Set<String> states = new HashSet<>(lst);
        states.remove("TX");
        System.out.println(states);

        Iterator<String> lstIter = states.iterator();
        while(lstIter.hasNext()){

            if(lstIter.next().toLowerCase().contains("a")){
                lstIter.remove();
            }
        }
        System.out.println(states);






    }
}
