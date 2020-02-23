package day63;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindAUnique {
    public static void main(String[] args) {
        String str = "The new link for joining class will require you to login to Okta, if it ask you to sign in " +
                ", please just click on it , it will take you too Okta signin page , once you signin with Okta" +
                "Then you will be able to join right away. PLEASE DO NOT TRY TO REGISTER , THE LINK IS ALREADY IN THE EMAIL" +
                "Click to join";

        Set<String> uniqueWords = new HashSet<>(Arrays.asList(str.split(" ")));
        //Set<Character> uniqueChar = new HashSet<>(Arrays.asList(new Character [] (str.toCharArray());
        Set<Character> charSet = new HashSet<>();
        for (int i = 0; i <str.length() ; i++) {
            charSet.add(str.charAt(i));

        }
        System.out.println(charSet);
        System.out.println("how many character in total = "+ str.toCharArray().length);
        System.out.println("how many unique character = "+charSet.size());

//        System.out.println(uniqueWords);
//        System.out.println(uniqueWords.size());
//        System.out.println(str.split(" ").length);
//        System.out.println("Total unique number");
    }
}
