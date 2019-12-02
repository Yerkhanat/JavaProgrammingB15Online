package day16;

import java.util.Scanner;

public class FizzBuzzNumber {
    public static void main(String[] args) {
        // if a number can be divided by both 3 and 5 --->> fizz buzz number
        // if it is divided by 5 is fizz number
        // if it is divided by 3 is buzz number
        Scanner input = new Scanner(System.in);
        //System.out.println("Enter your loop ending number: ");
        //int startingNumber = input.nextInt();
        System.out.println("Enter your loop ending number ");
        int endingNumber = input.nextInt();
        int startingNumber = 0;
        while (startingNumber <= endingNumber){
            if (startingNumber%3 == 0 && startingNumber%5==0){
                System.out.println(startingNumber + " is buzz and fizz number");
            } else if(startingNumber%3==0){
                System.out.println(startingNumber+ " is buzz number");
            }else if (startingNumber%5 == 0){
                System.out.println(startingNumber + " is fizz number");
            }//else {
              //  System.out.println(startingNumber+ " not a buzz or fizz number");
            //}


        ++ startingNumber;

        }

    }
}
