package day37;

import java.util.ArrayList;
import java.util.List;


public class ListPracticeWithLoop {
    public static <list> void main(String[] args) {
        // Create an ArrayList of Integer and fill it up with 1-100
        List<Integer> nums = new ArrayList<>();

        for (int i = 1; i <=100 ; i+=2) {
            nums.add(i);

        }
        System.out.println("nums = " + nums);

        List<Integer> lst2 = new ArrayList<>();
        lst2.add(44);
        lst2.add(14);
        lst2.add(341);
        lst2.add(41);
        lst2.add(19);

        // insert 100 right after 34 : WE DO NOT KNOW WHERE IS 34 :

        lst2.add(lst2.indexOf(34)+1, 100);
        System.out.println(lst2);
   // add 5 pcs of 100 in front of 44
        for (int i = 0; i <5 ; i++) {
            lst2.add(0,100);

        }
        System.out.println("lst2 = " + lst2);








    }
}
