package day05;

import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int year;
        String name;
        double height;
        System.out.println("Please enter your birth year :");
        year = input.nextInt();
        System.out.println("Please enter your name :");
        name = input.next();
        System.out.println("Please enter your height ");
        height = input.nextDouble();
        int age;
         age = 2019-year;
        System.out.println("Your age is " + age);
        System.out.println("Your name is "+ name);
        System.out.println("Your heigh is "+ height+ "ft");

    }
}
