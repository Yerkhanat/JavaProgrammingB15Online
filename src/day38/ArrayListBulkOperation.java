package day38;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListBulkOperation {
    public static void main(String[] args) {
        List<String> groceries = Arrays.asList("Eggs", "Milk", "Butter", "Apple", "Salmon");
        ArrayList<String> newLst = new ArrayList<>(groceries);
        newLst.add("Diet coke");
        newLst.add("Sugar");
        System.out.println("new list="+newLst);
        List<String> newItemsToAdd = Arrays.asList("Pasta", "Branzini", "Asparagus", "Spinachi");
        //newLst = new ArrayList<>(newItemsToAdd);
        newLst.addAll(newItemsToAdd);
        System.out.println("final list ="+newLst);
        List<Integer > nums = new ArrayList<>(Arrays.asList(123,100,223,133));
        List<Integer>  nums2 = new ArrayList<>(Arrays.asList(2000,1000));
        nums.addAll(nums2);
        System.out.println(nums);
        System.out.println(nums2);
        nums.addAll(Arrays.asList(100,200,300,400));

        System.out.println("Final "+nums);

        System.out.println(nums2+" "+ nums2);
        System.out.println(Collections.nCopies(2,nums2));

    }
}
