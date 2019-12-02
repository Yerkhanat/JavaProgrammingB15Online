package day12;

import java.util.Scanner;

public class warmup {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your current weather");
        String weather = input.next();

         if ( weather.equals("Sunny")){
             System.out.println("Code in Sunny weather");
         } else if(weather.equals("Rainy")){
                 System.out.println("Code in Rainy weather");
         }else if(weather.equals("Cloudy")){
             System.out.println("Code in Cloudy weather");
         }else if (weather.equals("snowy")){
             System.out.println("Code in Snowy weather");
         }else {
             System.out.println("rain or shine just keep coding");
         }
        }
    }

