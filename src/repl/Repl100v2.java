package repl;

import java.util.Scanner;

public class Repl100v2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = "ddsfsdfsdgsdggbread";
        int count=0;


//        for (int i=0; i<str.length();i++){
            int first = str.indexOf(("bread"));
            int last = str.lastIndexOf("bread");
            if(first!=last) {
                System.out.println(str.substring(first + 5, last));
            }else {
                System.out.println("nothing");

           }

        }
    }

