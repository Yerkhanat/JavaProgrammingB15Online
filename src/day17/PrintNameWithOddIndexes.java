package day17;

import java.util.Scanner;

public class PrintNameWithOddIndexes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = input.nextLine();
        int x =0;
        while (x< name.length()){
            if (x%2==1){
                System.out.println(name.charAt(x));
            }
            ++x;

        }
    }
}
