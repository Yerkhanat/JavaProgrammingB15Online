package day10;

import java.util.Scanner;

public class MultiBranch {
    public static void main(String[] args) {
        System.out.println("Welcome to McDonald, what can I get fro you");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        String food = "";
        switch(number){
            case 1: food = "Burger";
            break;
            case 2: food = "French Fry";
            break;
            case 3: food = "Nuggets";
            break;
            case 4: food = "Ice Cream";
            break;
            case 5: food ="Coke";
            break;
            default:
                System.out.println("We don't have in menu");

        }
        System.out.println("you have chosen "+ food);



    }
}
