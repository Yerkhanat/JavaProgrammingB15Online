package day34;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MethodThatReturnMoreThanOneValue {
    public static void main(String[] args) {
        String sentence = "I love Java";
        char[] eachChars = sentence.toCharArray();
        String [] eachWords = sentence.split(" ");
        System.out.println(Arrays.toString(returnBoysVsGirlsResult()));

    }
   // create a method that return int array returnBoysVsGirlsResult
    public static int []returnBoysVsGirlsResult(){
        int [] boysGirlsCount = {56,52};
        return boysGirlsCount;

    }







}
