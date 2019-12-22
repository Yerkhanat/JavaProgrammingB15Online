package repl;

import java.util.Scanner;

public class Repl068 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String txt = scan.next();
        String txt1 = txt.substring(0,(txt.length()-1));
        System.out.println(txt1);



    }
}
