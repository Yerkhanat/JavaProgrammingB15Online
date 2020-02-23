package day63;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class WordFrequency {
    public static void main(String[] args) {
        String str = "Finding Words Frequency Sounds Fun Because Fun Comes in When you count Words" +
                " But How do I count the Words with what I already know previously " +
                "Do it and find out Words Words Words";

        System.out.println("str length = " + str.split((" ")).length);


        Map<String, Integer> uniqueWord = new HashMap<>();
        for (String each :str.split(" ")) {
            if (!uniqueWord.containsKey(each)){
                uniqueWord.put(each,1);

            }else{
                uniqueWord.put(each,uniqueWord.get(each)+1);
            }

        }
        System.out.println(uniqueWord);



    }
}
