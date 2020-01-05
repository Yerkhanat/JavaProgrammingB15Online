package day37;

import java.util.ArrayList;
import java.util.List;

public class ArrayListRemoveItemPractice {
    public static void main(String[] args) {
        List<Integer> lst2 = new ArrayList<>();
        lst2.add(44);
        lst2.add(14);
        lst2.add(341);
        lst2.add(41);
        lst2.add(19);
        System.out.println("Before removing "+lst2);
        lst2.remove(3);
        System.out.println("After removing "+lst2);
        lst2.remove(lst2.indexOf(341));
        System.out.println("removing 341 = "+lst2);

    }
}
