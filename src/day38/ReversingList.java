package day38;
import java.util.*;
public class ReversingList {
    public static void main(String[] args) {
        List<Integer> nums1 = new ArrayList<>(Arrays.asList(200, 100, 700, 400, 500));
        Collections.reverse(nums1);
        System.out.println(nums1);
        Collections.sort(nums1, Collections.reverseOrder());
        System.out.println(nums1);

    }
}