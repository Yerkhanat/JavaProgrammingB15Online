package day19;

import java.util.Scanner;

public class RepeatVariables {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter start speed");
        int startSpeed = input.nextInt();
        System.out.println("Please enter end speed");
        int endSpeed = input.nextInt();


        for (int i = startSpeed; i <= endSpeed ; i++) {

            System.out.println(i);

        }
    }
}
