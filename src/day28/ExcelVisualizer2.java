package day28;

import java.util.Arrays;

public class ExcelVisualizer2 {
    public static void main(String[] args) {
        int [][] myExcel = {
                             {10,27,88,99}, // index: 0 - this is first 1D array
                             {87,100},      // index: 1 - this is second 1D array
                             {90,45,65}     // index: 2 - this is third 1D array
        };
        System.out.println(Arrays.deepToString(myExcel));
       int x = 1;
        for (int[] array1d : myExcel){
            System.out.println(" row "+x);
            for (int each : array1d){
               System.out.print("|"+each + "|");
               ;

           }
            System.out.println();
            x++;

       }
    }
}
