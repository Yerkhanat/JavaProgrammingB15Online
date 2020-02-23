package day62;

import java.util.*;

public class SetInterfaceintro2 {

    public static void main(String[] args) {
        List<Integer> numList = Arrays.asList(40,40,20,20,20,30,30,30);

         Set<Integer> myNums = new HashSet<>();
         myNums.addAll(numList);
        System.out.println(myNums);
         List<String > states1 = Arrays.asList("TX", "CA", "CA", "GA", "TX", "IL", "WA", "WA");
        System.out.println("All states "+states1);
        Set<String> states = new HashSet<>(states1);
        System.out.println(states);
        for (String each: states
             ) {
            System.out.println("Unique States = "+each);
        }
        Iterator<String> itStr = states1.iterator();

        while (itStr.hasNext()){
            System.out.println(" = " +itStr.next());
        }




    }
}
