package day06;

import java.util.Scanner;

public class UsingTheValueOfOtherVariables {
    public static void main(String[] args) {
        //int myFavoriteNumber  = 300;
        //int yourFavoriteNumber = myFavoriteNumber;

        //System.out.println("my favorite number " + myFavoriteNumber);
        // System.out.println("your favorite number "+ yourFavoriteNumber);
         //yourFavoriteNumber =100;
        //System.out.println("my favorite number " + myFavoriteNumber);
       // System.out.println("your favorite number "+ yourFavoriteNumber);
        Scanner input = new Scanner(System.in);
        System.out.println("What is your order ?" );
        String yourOrder = input.nextLine();
        String myOrder =yourOrder;
        System.out.println("your order is " + yourOrder);
        System.out.println("My order is " + myOrder);




    }
}
// create a variable called yourOrder, type string and assign
// optionally assign this value using scanner
// create another variable called myOrder and assign the value
//to same value as yourOrder by copying
//and just print them out.



