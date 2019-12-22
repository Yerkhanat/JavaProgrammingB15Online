package day25;

import java.util.Arrays;

public class String_Split_Method {
    public static void main(String[] args) {
        String sentence = "I love Java";
        String[] allWords = sentence.split(" ");
        System.out.println(Arrays.toString(allWords));

        System.out.println(allWords.length);
        System.out.println(allWords[allWords.length-1]);
    }
}
