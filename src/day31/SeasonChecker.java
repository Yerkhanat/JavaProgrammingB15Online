package day31;

import java.util.Arrays;
import java.util.Scanner;

public class SeasonChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please choose the season number starting from 1 to 4");
    seasonArray(input.nextInt());
    }
   public static void seasonArray(int number){
       String [] seasons = {"Autumn", "Winter", "Spring", "Summer"};
       System.out.println(seasons[number-1]);
   }





}
