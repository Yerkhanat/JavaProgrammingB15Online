package day38;

//import java.util.ArrayList;
////import java.util.Arrays;
////import java.util.Collections;
////import java.util.List;
import java.util.*;

public class SortingAListObject {
    public static void main(String[] args) {

        List<Integer>  nums = new ArrayList<>(Arrays.asList(300,200,700,600,800));
        // 2 ways to sort an ArrayList
        // Use Collections utility class(just like Arrays utility class for array objects)
        System.out.println("before"+nums);
        Collections.sort(nums);
        System.out.println("after"+nums);
        Collections.sort(nums, Comparator.reverseOrder());
        System.out.println(nums);
        nums.sort(Comparator.naturalOrder());
        System.out.println(nums);
        nums.sort(Comparator.reverseOrder());
        System.out.println(nums);


    }
}

