package day31;

import java.util.Scanner;

public class Voting {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your age");
        checkEligibility( input.nextInt());

    }

    public static void checkEligibility(int age) {

        if (age >= 18) {
            System.out.println("You are eligible to vote");
        } else {
            System.out.println("You are NOT eligible to vot");
        }

    }
}





