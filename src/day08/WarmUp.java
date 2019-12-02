package day08;

import java.sql.SQLOutput;
import java.util.Scanner;

public class WarmUp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How old are you");
        int age = input.nextInt();

        if(age>=18){
            System.out.println("You are ready to vote");

        } else{
            System.out.println("Wait until you are 18");
        }
    }
}
