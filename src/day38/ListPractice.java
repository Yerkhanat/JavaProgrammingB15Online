package day38;

import java.util.ArrayList;
import java.util.Arrays;

public class ListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> numList = new ArrayList<>(Arrays.asList(3,4,5,6,7,8));
        Integer[] numsArr = numList.toArray(new Integer[4]);
        System.out.println(Arrays.toString(numsArr));

    }
}
