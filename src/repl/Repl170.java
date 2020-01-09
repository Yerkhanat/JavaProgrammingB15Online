package repl;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Repl170 {
    public static void main(String[] args) {

        int[][] arr = {
                {1, 5, 4, 2}, {9 ,5 ,4 ,2}
        };
        int  max = arr[0][0];
        int rows =2;
        int cols =4;
        for(int i = 0; i< rows; i++ ){

            for(int j=0; j<cols; j++){
                if(max<arr[i][j]){

                    max = arr[i][j];
                }
            }
            for(int k=0 ;k<=rows-1;k++){
                for(int c=0 ;c<=cols-1;c++){
                    arr[k][c]=max;
                }//end for cols
            }//end for rows
        }



        //FINAL PRINT
        System.out.println(Arrays.deepToString(arr));
        String str= new String("aaa");
        //List<>() str1= str.split("");




    }

}







