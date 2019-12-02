package day07;


import java.util.Scanner;

public class EmailBuilder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your first name? ");
        String firstName = input.next();
        System.out.println("What is your last name? ");
        String lastName = input.next();
        input.nextLine();
        System.out.println("what is your company name");
        String company = input.nextLine();
        String email = firstName+ "_"+lastName+ "@"+company+".com";
        System.out.println("your email address is: "+ email);

    }
}
