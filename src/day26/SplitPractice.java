package day26;

import java.sql.SQLOutput;
import java.util.Arrays;

public class SplitPractice {
    public static void main(String[] args) {
        String survey = "Complete B15 online 1 Month Survey";
//        char [] surveyChars =survey.toCharArray();
//        for(char each : surveyChars){
//
//            System.out.println("each loop is "+each);
//        }

        String [] alphabetic = survey.split(" ");

        System.out.println(Arrays.toString(alphabetic));
        Arrays.sort(alphabetic);
        System.out.println(Arrays.toString(alphabetic));

    }
}
