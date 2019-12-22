package repl;

import java.util.Arrays;

public class Repl127 {
    public static void main(String[] args) {
        int[] inhabitants = {3, 6, 0, 4, 3, 2, 7, 1,1,2,3,4};
        int [] day = new int [inhabitants.length];
       int i=0;
        int max = inhabitants[0];
        for (int each : inhabitants) {
            if (max < each) {
                max = each;
            }
        }
           int count =0;
            int k =1;
            for (int j = max*2; j > 0; j = j / 2) {
                for (int each1 : inhabitants) {
                    if (each1 != 0 ) {
                        day[i] = each1 / k;
                    }
                    i++;
                }k=k*2;
                i=0;
                System.out.println("day "+count+ " "+Arrays.toString(day));
                count++;
            }
        }
    }



//        }
////        String day ="";
//        String day1="";
//        int x=0;
//        String day ="";
//        for (int i = 0; i <=max ; i++) {
//
//
//            for (int each :inhabitants
//                 ) {
//
//                day += each/(x+1);
//
//            }
//            x++;
//        }
//
//        String[] day2 =day.split(",");
//        System.out.println(Arrays.toString(day2));
