package day36;

import java.util.ArrayList;

public class ArrayListMethod {
    public static void main(String[] args) {
        ArrayList<Long> lst = new ArrayList<>();

        lst.add(12L);
        lst.add(13L);
        lst.add(14L);


        System.out.println(lst);
        System.out.println(lst.size());
        System.out.println(lst.get(0)+lst.get(1)+lst.get(2));

    }
}
