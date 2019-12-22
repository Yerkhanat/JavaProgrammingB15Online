package repl;

import java.util.Scanner;

public class Repl051 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String split = input.next();
        int numberOfPeople = input.nextInt();
        double checkAmount = input.nextDouble();
        input.nextLine();
        String serviceQuality = input.nextLine();

        System.out.println(split.length());

        if (split.equals("Yes") && serviceQuality.equals("Excellent")) {
            System.out.println("Number of people entered: " + numberOfPeople);
            System.out.println("Total to pay: " + (1.25 * checkAmount));
            System.out.println("Total tip: " + 0.25 * checkAmount);
            System.out.println("Total per person: " + ((1.25 * checkAmount) / numberOfPeople));
            System.out.println("Tip per person: " + (0.25 * checkAmount) / numberOfPeople);
        }
    }
}