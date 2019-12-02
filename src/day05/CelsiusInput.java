package day05;

import java.util.Scanner;

public class CelsiusInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter Fahrenheit: ");
        int fahrenheit =input.nextInt();
        double celsius;
        celsius = (5.0/9)*(fahrenheit-32);
        System.out.println("It will in celsius "+ celsius + "C");
        //celsius*(fahrenheit-32








    }
}
