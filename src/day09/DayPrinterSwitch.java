package day09;

import java.util.Scanner;

public class DayPrinterSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter the day");
        int dayCode = input.nextInt();
        String dayName = "";
         switch (dayCode){
             case 1 :
                 dayName ="Monday";
                 break;

            case 2 :
                dayName ="Tuesday";
                break;

            case 3:
                dayName = "Wednesday";
                break;

            case 4:
                dayName = "Thursday";
                break;

            case 5:
                dayName = "Friday";
                break;
             default:
                 System.out.println("Day is unknown");
        }
        System.out.println(dayName);
    }
}
