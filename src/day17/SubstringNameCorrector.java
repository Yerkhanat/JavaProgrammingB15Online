package day17;

import java.util.Scanner;

public class SubstringNameCorrector {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name?");
        String name = input.nextLine();

        String firstName = name.substring(0,1).toUpperCase();
        firstName += name.substring(1, (name.indexOf(" "))).toLowerCase();
        System.out.print(firstName);
        String lastName = name.substring((name.indexOf(" ")+1),(name.indexOf(" ")+2)).toUpperCase();
        lastName += name.substring(name.indexOf(" ")+2).toLowerCase();
        System.out.print(" "+lastName);


    }
}
