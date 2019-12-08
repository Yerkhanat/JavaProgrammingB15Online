package day22;

import java.sql.SQLOutput;

public class BreakContinue {
    public static void main(String[] args) {
        String sentence = "I struggle with Java I love Java Everything is Awesome!";
        //loop through each every letter
        //1. Print every other letter
//        int indexOfLove = sentence.indexOf("love");
//        char a = sentence.charAt(sentence.indexOf("a", indexOfLove));
        int count =0;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.substring(i, i + 1).equals("a")) {
                count++;
            }
             else if(count==3){
                    break;
                }

            else if (i % 2 == 1) {
                continue;
            }System.out.print(sentence.substring(i, i + 1) + " ");
        }
    }
}

