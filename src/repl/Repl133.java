package repl;


import java.util.Arrays;
import java.util.Scanner;

public class Repl133 {
    public static void main(String[] args) {
        //Scanner input = new Scanner(System.in);

        int decimal = 35;
        int[] binary = new int[8];
        int k = binary.length;
        int j =1;
        //TODO: Write your code below.
        for (int i =binary.length; i>0; i--){
            if (decimal%2>0){
                binary[binary.length-j]=1;
            }else {
                binary[binary.length-j]=0;
            } decimal=decimal/2;
            j++;

        }System.out.println(Arrays.toString(binary));
    }
}