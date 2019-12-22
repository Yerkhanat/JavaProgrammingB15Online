package day19;

import java.util.Scanner;

public class SlowDownLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your start and end speed");
        int start = input.nextInt();
        int end = input.nextInt();
        if(start<end){
            System.out.println("Increasing");
            for (int i = start; i <=end ; i++) {
                System.out.print(i+ ", ");
            }
        }if(start>end) {
            System.out.println("Decreasing");
            for (int i = start; i >= end; i--) {
                System.out.print(i + " ");

            }
        }else {
            System.out.println("no action required");
        }
    }
}
