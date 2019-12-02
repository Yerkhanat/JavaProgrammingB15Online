package day06;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Remainder {
    public static void main(String[] args) {
       // System.out.println(5%2);
        //System.out.println(5.0/3);
        //System.out.println(99%10);
        // System.out.println(135%60 + "minutes");

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the minute");
        int min = input.nextInt();
        int result = min /60;
        int result2 = min%60;
        System.out.println("it is " + result + "h " + result2 +  " minutes ");




    }
}
