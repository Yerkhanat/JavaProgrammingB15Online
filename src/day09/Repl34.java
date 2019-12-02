package day09;
import java.util.*;

public class Repl34 {
    public static void main(String[] args) {
        //ENTER CODE HERE
        Scanner input = new Scanner(System.in);
        System.out.println("Enter price in cents:");
        int money= input.nextInt();
        boolean correct = money%5==0;
        if((money >= 25 && money <=100)&& correct){
            int change = 100-money;
            int quarter = change/25;
            int dime = (change%25)/10;
            int nickles = ((change%25)%10)/5;

            System.out.println("Your change is: " +quarter +" quarter, "+
                    dime+ " dimes, "+nickles+ " nickles");
        }else{
            System.out.println("Invalid Price!");
        }

    }
}