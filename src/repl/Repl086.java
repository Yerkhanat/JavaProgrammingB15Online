package repl;

import java.util.Scanner;

public class Repl086 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name1="";
        String name ="";
        String answer = "";
        //String guestName=input.next();
        while (!answer.equals("no")) {
            System.out.println("Please enter guest name:");
            name1+=","+input.next();
            //System.out.println(name);
            System.out.println("Do you want to enter new guest name:");
            answer = input.next();
            if(answer.equals("no")){
                System.out.println(name1);
            }
            } //System.out.println(name.substring(0,name.length()-2));

        }




        // guestName+=", "+input.next();
    }

