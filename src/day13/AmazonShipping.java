package day13;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class AmazonShipping {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your amount");
        double amount = input.nextDouble();
        System.out.println("what is your shipping fee");
        int shippingFee = input.nextInt();

        String prime = "Regular";

        if (prime.equalsIgnoreCase(("PRIME MEMBER"))){
            System.out.println("Your shipping fee will "+ amount);


        }else if(amount >25){
            System.out.println("Not a prime member but you order is more than 25");
            System.out.println("You got free shipping on amount "+amount);
        }else {
            System.out.println("Do you wanna sign up for prime membership?");
        shippingFee = 5;
        amount = amount +shippingFee;
            System.out.println("your final amount is "+amount);
        }

    }
}
