package repl;

import java.util.Scanner;

public class Repl097 {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        String word = scan.next();
        int count =0;
        for (int i =0; i<=word.length(); i++) {
            if (word.startsWith("java") || word.contains("java")){
                count++;
            word = word.substring(word.indexOf("java")+3);
            }
            else if(word.endsWith("java")){
                count++;
                word=word.substring(0,word.indexOf("java"));
            }

        } System.out.println(count);



    }
}
