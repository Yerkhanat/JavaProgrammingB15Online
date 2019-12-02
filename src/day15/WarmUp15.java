package day15;

import java.util.Scanner;

public class WarmUp15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = input.nextLine();
        boolean lenght = name.length()>4 && name.length()<11;
        if(name.length()<4){
            System.out.println("short name");
        } else if (lenght){
            System.out.println("medium Name");
        }else {
            System.out.println("longer Name");
        }

    }
}
