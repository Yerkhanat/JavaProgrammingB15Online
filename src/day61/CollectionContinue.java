package day61;

import java.util.*;

public class CollectionContinue {
    public static void main(String[] args) {
        // Collection interface is superType
        Collection<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(1,6,4,5,7,8));
        List<Integer> nums2 = new ArrayList<>(Arrays.asList(1,6,4,5,7,8));
        Collections.sort(nums2);
        System.out.println(nums2);

    }
}
