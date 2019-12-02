package day09;

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your item");
        String item = scan.nextLine();
        //String item1 ="Smartphone";
        boolean smartphone  = item.equals("Smartphone");
        boolean laptop = item.equals("Laptop");
        boolean charges = item.equals("Charger");
        boolean usbCable = item.equals("USB cable");
        boolean headphones = item.equals("Headphones");
        boolean pants = item.equals("Pants");
        boolean hat = item.equals("Hat");
        boolean socks = item.equals("Socks");
        boolean blanket = item.equals("Blanket");
        boolean pillow = item.equals("Pillow");

        if(smartphone){

            System.out.println("Sorry, not enough funds on your gift card!");
        } else if(laptop){

            System.out.println("Sorry, not enough funds on your gift card!");
        } else if(charges){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (100-15)+"$");
        } else if(usbCable){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (100-10)+"$");
        }else if(headphones){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (100-30)+"$");
        }else if(pants){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (100-50)+"$");
        }else if(hat){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (100-25)+"$");
        }else if(socks){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (100-5)+"$");
        }else if(blanket){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (100-60)+"$");
        }else if(pillow){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (100-40)+"$");
        } else{
            System.out.println("Invalid Item!");
        }



    }
}