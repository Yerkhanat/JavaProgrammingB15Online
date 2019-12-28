package day33;

import java.util.Scanner;

public class MethodCallBirthYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your birth year");
        System.out.println("You are " + age(input.nextInt()) + " years old");
        System.out.println("===========================================");
        int[] years = {1992, 1995, 1886, 1987};
        for (int eachYear : years
        ) {
            System.out.println("You are " + age(eachYear) + " years old");

        }
    }

    public static int age(int x) {

        if (x >= 1900 && x < 2020) {
            return 2019 - x;
        } else {
            return 0;
        }
    }
}


