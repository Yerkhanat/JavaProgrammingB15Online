package day37;

import java.util.ArrayList;
import java.util.List;

public class MethodWIthArrayListAsReturnType {
    public static void main(String[] args) {
        int finalNumber = 5;
        System.out.println(getListFrom1toFinalNumber(5));

    }

    public static List<Integer> getListFrom1toFinalNumber(int finalNumber) {

        List<Integer> nums = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
        nums.add(i);
        }
    return nums;
    }
}
