package day06;

import java.util.Scanner;

public class CapturingMultipleWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name? ");
        String name, city, address;
        name = input.nextLine();
        System.out.println("What is your location ");
        city = input.nextLine();
        System.out.println("What is you address ");
        address = input.nextLine();


        System.out.println("Your answer: " + name);
        System.out.println("Your answer: " + city);
        System.out.println("Your answer: " +address);


    }
}
