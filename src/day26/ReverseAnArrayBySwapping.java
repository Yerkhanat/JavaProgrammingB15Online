package day26;

import java.util.Arrays;

public class ReverseAnArrayBySwapping {
    public static void main(String[] args) {
        int [] myNumbers = new int [] {5,1,21, 2, 13,8};
        System.out.println(Arrays.toString(myNumbers));
        int size = myNumbers.length;
        int lastIndex = size-1;
        int middleIndex = size/2;
        int temp = 0;
        //looop this
        for (int i = 0; i <middleIndex ; i++) {
//            System.out.println(myNumbers[i]+" ---- "+myNumbers[lastIndex-i]);
         temp =myNumbers[i];
         myNumbers[i]=myNumbers[lastIndex-i];
         myNumbers[lastIndex-i] = temp;

        }
        System.out.println(Arrays.toString(myNumbers));

    }
}
