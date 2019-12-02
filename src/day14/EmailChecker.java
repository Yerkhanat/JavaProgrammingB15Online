package day14;

import java.sql.SQLOutput;
import java.util.Scanner;

public class EmailChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your email address");
        String email = input.nextLine();
        boolean mustContains = email.contains("@") && email.contains("com")&& email.contains("com");
        if (mustContains){
            System.out.println("Valid email");
        }else {
            System.out.println("Invalid email");
        }
    }
}
