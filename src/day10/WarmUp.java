package day10;

import java.util.Scanner;

public class WarmUp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your answer");
        int myNumber = input.nextInt();
        String myAnswer = "";
        if (myNumber%5==0) {
            myAnswer= "Fizz Number";}
        else { myAnswer = "Not a Fizz Number";}
        System.out.println(myAnswer);
    }
}
