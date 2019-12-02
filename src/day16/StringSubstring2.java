package day16;

import java.util.Scanner;

public class StringSubstring2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your word");
        String word = input.nextLine();
        int  firstJava = word.indexOf("java");
        int secondJava = word.indexOf("java", firstJava+4);
        int thirdJava= word.indexOf("java",secondJava+4);
        System.out.println(thirdJava);
        // System.out.println(firstJava);
    }
}
