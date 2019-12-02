package day08;

import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("what is your speed");
        int speed = input.nextInt();
        int speedLimit = 100;
        if (speed > speedLimit) {
            System.out.println("you are over speed limit in this case you " +
                    "may will get pulled and get a ticket");
        } else {
            System.out.println("go shopping");
        }
    }
}