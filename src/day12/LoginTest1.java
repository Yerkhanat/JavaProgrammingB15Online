package day12;

import java.util.Scanner;

public class LoginTest1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String username = input.nextLine();
        String password = input.nextLine();
        if (!username.equals("user123") && !password.equals("pass123")) {
            System.out.println("username and password are in correct");
        }
         else if (username.equals("user123")&&password.equals("pass123")){
            System.out.println("login successfull");
        }else if(!username.equals("user123")){
            System.out.println("User name is not correct");
        }else if(!password.equals("pass123")){
            System.out.println("Password is in correct");
        }

    }
}
