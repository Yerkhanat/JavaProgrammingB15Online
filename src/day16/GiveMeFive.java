package day16;

import java.util.Scanner;

public class GiveMeFive {
    public static void main(String[] args) {
        // i want to ask user to enter a number

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number");
        int five = 0;
        while (five != 5){
            five = input.nextInt();
            System.out.println("hey you didn't give me 5");
            System.out.println("Please enter the number");
        }

        System.out.println("HIGH FIVE!!!!!!");



    }
}
