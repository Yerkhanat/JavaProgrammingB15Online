package day08;

import java.util.Scanner;

public class MultiBranchIfStatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your speed");
        int speed = input.nextInt();


        if(speed >90){
            System.out.println("you will go jail");

        } else if (speed >80){
            System.out.println("reckless driving");

        } else if(speed > 70){
            System.out.println("point taken");
        } else if(speed >60){
            System.out.println("warning");
        }else{
            System.out.println("keep driving");
        }
    }
}
