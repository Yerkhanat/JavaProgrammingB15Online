package day25;

import java.util.Arrays;

public class CheckArrayIsSortedOrNot2 {
    public static void main(String[] args) {
        int[] nums = {8,13,21,22,23,24};

        System.out.println("nums = "+ Arrays.toString(nums));

        for (int i = 0; i <nums.length-1 ; i++) {
            System.out.println(nums[i]+" "+nums[i+1]);
            if(!(nums[i]<nums[i+1])){
                System.out.println("Array is not sorted");
            break;
            }

            } System.out.println("Array is sorted");
        }
    }

