package day38;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RetainAllPractice {
    public static void main(String[] args) {
        List<Integer > nums1 = new ArrayList<>(Arrays.asList(100,200,300,400,500,600));
        List<Integer>  nums2 = new ArrayList<>(Arrays.asList(200,300,600,700,800));
        nums1.retainAll(nums2);
        System.out.println(nums1);
        nums2.retainAll(nums1);
        System.out.println(nums2);
        System.out.println(nums1.equals(nums2));

    }
}
