package day32;

import java.util.Arrays;

public class ArrayPracticeWithMethod {
    public static void main(String[] args) {
    arrayPrinter(new int[]{1,2,3,4,5});
    int [] scores= {2,5,8,23,4,5,6};
    arrayPrinter(scores);
    printMaxOfArray(scores);
    }
    // array printer
    // create a method that has one int array as a parameter
    // print out each item in this format
    // arrays has items : ----->>> all the items here

    public static void arrayPrinter( int[] nums){
        System.out.println("arrays has items: "+Arrays.toString(nums));
        System.out.println("==========================================");
    }public static void printMaxOfArray(int[] numbers){
        int max = numbers[0];
        for (int i = 0; i <numbers.length ; i++) {
            if(max<numbers[i]){
                max = numbers[i];
            }

        } System.out.println("maxium number inside the array is "+max);
        System.out.println("==========================================");
    }



}
