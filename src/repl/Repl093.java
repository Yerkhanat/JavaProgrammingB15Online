package repl;

import java.util.Scanner;

public class Repl093 {
    public static void main(String[] args) {
        boolean exists = false;
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        if (word.length()==1) {
            System.out.println("false");
        }  else {
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(0) == 'j' || word.charAt(1) == 'j') {
                    System.out.println("true");
                    break;
                } else {
                    System.out.println("false");
                    break;

                }
            }
        }
        }

}

