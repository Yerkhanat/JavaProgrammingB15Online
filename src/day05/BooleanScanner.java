package day05;

import java.sql.SQLOutput;
import java.util.Scanner;

public class BooleanScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Are you married?" );
        boolean married = input.nextBoolean();
        boolean yes= married;

        System.out.println("Your answer is : " + yes);


    }
}
