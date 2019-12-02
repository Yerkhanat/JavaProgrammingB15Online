package day07;

import java.util.Scanner;

public class IntroToIfStatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter your number? ");
        int myNumber = input.nextInt();
        //System.out.println(myNumber>5);
        //System.out.println(myNumber < -19);
        //System.out.println(myNumber >=5);
        //System.out.println(myNumber >=8);
        //System.out.println(myNumber == 5);
        //System.out.println(myNumber !=6);
        if (myNumber > 12) {
            System.out.println("your input is larger than 12");

        } else {
            System.out.println("your input is smaller than 12");
        }
    }


    }

