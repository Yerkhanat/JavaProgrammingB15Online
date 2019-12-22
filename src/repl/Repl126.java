package repl;

import java.util.Arrays;

public class Repl126 {
    public static void main(String[] args) {
        String str = "olive, hot pursuit, warning, python, angle, coffee, beech, boost, trainer";

        String[] allWords = str.split(", ");
        String shortestWord =allWords[0];
        for (String min : allWords) {
            if (min.length() < shortestWord.length()) {
                shortestWord = min;
            }

        }//System.out.println(shortestWord);
         String shortestWord2 ="";
        for (String min2 : allWords){

            if(min2.length() == shortestWord.length()){
                 shortestWord2 +=min2+",";
            }
        }
        //System.out.println(shortestWord2);
        String [] finalResult = shortestWord2.split(",");
        Arrays.sort(finalResult);
        System.out.println(Arrays.toString(finalResult));
        int number = 1;
        //System.out.println("result "+ 1/2);
    }
         }

