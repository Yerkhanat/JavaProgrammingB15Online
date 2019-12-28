package repl;

import java.util.Scanner;

public class Repl152 {
    public static void main(String[] args) {
//        Scanner inp = new Scanner(System.in);
//        int size = inp.nextInt();
//        int[] arr = new int[size];
//        for(int i=0 ;i<=size-1;i++)
//        {
//
//            arr[i]=inp.nextInt();
//        }
        int [] arr ={7 ,1 ,-1 ,-3 ,0 ,0 ,2 ,3};
        plus_minus(arr);
    }//end main

    public static void plus_minus(int[] x){
        int positive =0;
        int negative = 0;
        int zero = 0;
        for(int i=0; i<x.length; i++){
            if(x[i]>0){
                positive++;
            }else if(x[i]==0){
                zero++;
            }else {
                negative++;
            }

        } System.out.println("positives:"+positive+", negatives:"+negative+", zeros:"+zero);


    }

}
