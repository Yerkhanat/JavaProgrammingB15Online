package day38;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveAllMethodPractice {
    public static void main(String[] args) {
        ArrayList<Integer> nums1 = new ArrayList<>(Arrays.asList(123,123,223,133,125,122));

        nums1.removeAll(Arrays.asList(123,223));
        System.out.println(nums1);

    }
}
