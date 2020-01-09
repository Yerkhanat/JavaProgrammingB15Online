package repl;

import java.util.ArrayList;
import java.util.Arrays;

public class Repl170v2 {
    public static void main(String[] args) {

        int[] inhabitants = {3, 6, 0, 4, 3, 2, 7, 0};
        int number =0;
        int[] days = new int[8];
        System.out.println("Day "+number+ " "+ Arrays.toString(inhabitants));
        for (int j = 0; j <100 ; j++) {
            int count =0;
            int sum =0;
            for (int i = 0; i < inhabitants.length; i++) {
                if (inhabitants[i] != 0) {
                    days[i] = inhabitants[i];
                }else if (inhabitants[i] == 0 && i ==inhabitants.length-1){
                    days[i - 1] = inhabitants[i - 1] / 2;
                    count++;
                }
                else if(inhabitants[i]==0 && i ==0){
                    days[i + 1] = inhabitants[i + 1] / 2;
                    count++;
                }
                else if(inhabitants[i]==0 ){

                    days[i - 1] = inhabitants[i - 1] / 2;
                    days[i + 1] = inhabitants[i + 1] / 2;
                    i++;
                    count+=2;

                }


            }


            number++;
            System.out.println("Day "+number+" "+Arrays.toString(days));
            inhabitants = Arrays.copyOf(days,days.length);
            for (int c = 0; c <days.length ; c++) {
                sum+=days[c];

            }
            if(sum == 0){
                break;
            }


        }



            
        }

    }

