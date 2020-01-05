package day36;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MethodPractice2 {
    public static void main(String[] args) {
        long [] myLongs = {6l,11l,44l,32l,65l};
        swapFirstAndLastValue(myLongs);
        swapFirstAndLastValue(myLongs);
        long [] myNums1 = new long[5];
        Long []  myNums2 = new Long[5];

    }


    public static void swapFirstAndLastValue(long [] nums ){


        long temp = nums[0];
        nums[0] = nums[nums.length-1];
        nums[nums.length-1]=temp;
        System.out.println(Arrays.toString(nums));



    }
}
