package day29;

import java.util.Arrays;

public class StringPractice {
    public static void main(String[] args) {
        String hero1 = "Superman-Clark Kent";

        String [] names = hero1.split("-");
        System.out.println(Arrays.toString(names));
    }
}
