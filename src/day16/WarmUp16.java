package day16;

import java.util.Scanner;

public class WarmUp16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your word");
        String word1 = input.nextLine();
        String word2 = "";
        word2 = word1.charAt(3)+ ""+ word1.charAt(2)+""+word1.charAt(1)+""+word1.charAt(0);
        System.out.println(word2);
    }
}
