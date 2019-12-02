package day10;

import java.util.Scanner;

public class SeasonAction {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the season: ");
        String season = input.next();
        switch (season){
            case "Spring":
                System.out.println("It's Spring! Hike! Easter! Nevruz! Blossom!");
                break;
            case "Summer":
                System.out.println("It's Summer! Swim, Vacation, BBQ, Holiday");
                break;
            case "Fall":
                System.out.println("It's Fall! Black Friday, Hiking, Harvest, Halloween, Shopping");
                break;
            case "Winter":
                System.out.println("It's Winter! Snowboarding, Ski, Christmas, New Year");
                break;
            default:
                System.out.println("Invalid info");
        }
    }
}
