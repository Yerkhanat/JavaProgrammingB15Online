package day34;


import java.util.Scanner;

public class LoginPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter your username and password");

        //System.out.println(answer(input.next(),input.next()));
        if(answer(input.next(), input.next())){
        System.out.println("Pay for Java Book in cart");
        System.out.println("view the order");
        } else {
            System.out.println("login was  not succesful");
        }

    }public static boolean answer (String login, String pass){
        return (login.equals("user")&&pass.equals("abc123") );

        }

    }

