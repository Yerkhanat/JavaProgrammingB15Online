package day06;

import java.util.Scanner;

public class SalesDiscount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the regularPrice? :");
        double regularPrice = input.nextDouble();
        System.out.println("What is the discount Percentage? :");
        double discountPercentage = input.nextDouble();
        double sales = regularPrice*(1-discountPercentage);

        System.out.println("regular price is $" + regularPrice + " discount is $"
                            + discountPercentage + " your sale price is $" + sales);

    }
}
