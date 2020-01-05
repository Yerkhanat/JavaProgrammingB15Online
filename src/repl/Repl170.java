package repl;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Repl170 {
    public static void main(String[] args) {

        int[] inhabitants = {3, 6, 0, 4, 3, 2, 7, 0};
        int [] days = new int[8];

        //TODO. Write you code below this line.
        for (int i = 0; i <inhabitants.length ; i++) {
            int count = 0;
            for (int each: inhabitants) {
                int j = 0;
                if(each == 0){
                    count++;
                    }
                days[j]=each;
                j++;





            }

            if(count==8){
                break;
            }


            }



        }


        }







