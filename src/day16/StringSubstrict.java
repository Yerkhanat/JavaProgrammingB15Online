package day16;

import java.util.Scanner;

public class StringSubstrict {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        int space1 = word.indexOf(" ");
        //int space2 = word.lastIndexOf(" ");
        int space2 = word.indexOf(" ", space1+1);
        int space3 = word.indexOf(" ", space2+1);
        String word2 = word.substring(space2+1, space3);


        //System.out.println(space3);

        System.out.println(word2);

    }
}
