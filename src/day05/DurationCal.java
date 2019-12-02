package day05;

import java.util.Scanner;

public class DurationCal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the duration in hour?" );
        int hour;
        hour = input.nextInt();
        //int second;
        int answer;

         answer= hour*3600;

        System.out.println("it will be "+ answer + "second");






    }
}
