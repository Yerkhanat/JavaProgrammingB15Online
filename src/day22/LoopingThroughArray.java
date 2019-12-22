package day22;

import java.util.Scanner;

public class LoopingThroughArray {
    public static void main(String[] args) {

        String[] family = new String[3];

        family[0]="dad";
        family[1]="mother";
        family[2]="kid";

//        System.out.println(family[0]);
//        System.out.println(family[1]);
//        System.out.println(family[2]);
        int[] scores = new int[4];

        Scanner input = new Scanner(System.in);
        int count =0;
        for (int i = 0; i <scores.length ; i++) {
            System.out.println("Please enter number "+ (i+1));
            scores[i] = input.nextInt();
        }
//        scores[0]=95;
//        scores[1]=70;
//        scores[2]=88;
//        scores[3]=100;
        int itemCount = scores.length;
        for (int i = itemCount-1; i >=0 ; i--) {
            System.out.print(scores[i]+" ");
        }
//        String name = "Jon Snow";
//        int charCount = family.length;
//        for (int i = charCount-1; i >= 0; i--) {
//            System.out.println(family[i]);
//        }
//


    }
}
