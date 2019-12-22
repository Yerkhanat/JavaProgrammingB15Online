package repl;

import java.util.Scanner;

public class Repl099 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int n = scan.nextInt();
        int count =0;
        String word = str.substring(0,n);
        for (int i = 0; i<str.length(); i++){
            if(str.substring(i).startsWith(word)) {
                count++;
            }
        }if (count>1){
            System.out.println("true");
        }else {
            System.out.println("false");
        }

    }
}
