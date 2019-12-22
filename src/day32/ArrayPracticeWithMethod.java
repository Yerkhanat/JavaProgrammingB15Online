package day32;

import java.util.Arrays;

public class ArrayPracticeWithMethod {
    public static void main(String[] args) {
    arrayPrinter(new int[]{1,2,3,4,5});
    int [] scores= {2,5,8,23,4,5,6};
    arrayPrinter(scores);
    printMaxOfArray(scores);
    sumOfArray(scores);
    compare2arraySize(new String[]{"Yerkhanat", "Janar"},new String[]{"Janar"});
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
        int min = numbers[0];
        for (int i = 0; i <numbers.length ; i++) {
            if(max<numbers[i]){
                max = numbers[i];
            }
            for (int j = 0; j <numbers.length ; j++) {
                if(min>numbers[j]){
                    min = numbers[j];
                }

            }
        } System.out.println("maximum number inside the array is "+max);
        System.out.println("minimum number inside the array is "+min);
        System.out.println("==========================================");
    }public static void sumOfArray(int [] sum){
        int total=0;
        for (int i = 0; i <sum.length ; i++) {
            total+=sum[i];

        }
        System.out.println("sum is "+total);
        System.out.println("===============");
    } public static void compare2arraySize (String []arr1, String[] arr2) {
          if(arr1.length>arr2.length){
              System.out.println("array length "+Arrays.toString(arr1) + " is larger than "+Arrays.toString(arr2));
          }else if(arr1.length<arr2.length){

              System.out.println("array length "+Arrays.toString(arr1) + " is less than "+Arrays.toString(arr2));
          }

            }

}



