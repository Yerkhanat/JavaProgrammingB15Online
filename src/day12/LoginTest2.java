package day12;

import java.util.Scanner;

public class LoginTest2 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        String userName, password;
        userName = input.nextLine();
        password=input.nextLine();

        if(userName.equalsIgnoreCase("USER123")){
            System.out.println("correct");
        }
    }
}
