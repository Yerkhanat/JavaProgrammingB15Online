package repl;

import java.util.Scanner;

public class Repl088 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int countOfCats = 0;
        int countOfDogs = 0;
        String word = scan.next();
        while (word.length() > 2) {
            if (word.contains("cat")) {
                countOfCats++;
                if (word.startsWith("cat")) {
                    word = word.substring(word.indexOf("cat") + 3, word.length());

                } else if (word.endsWith("cat")) {
                    word = word.substring(0, word.indexOf("cat"));

                } else if(word.contains("cat")) {
                    word = word.substring(word.indexOf("cat") + 3);
                }

                else if (word.startsWith("cat") && word.endsWith("cat")) {
                    word = word.substring((word.indexOf("cat") + 3), (word.indexOf("cat")));
                }
            }
            if (word.contains("dog")) {
                countOfDogs++;
                if (word.startsWith("dog")) {
                    word = word.substring(word.indexOf("dog") + 3, word.length());

                } else if(word.contains("dog")){
                    word=word.substring(word.indexOf("dog")+3);
                }
                else if (word.endsWith("dog")) {
                    word = word.substring(word.indexOf("dog")+3, word.indexOf("dog"));

                } else if (word.startsWith("dog") && word.endsWith("dog")) {
                    word = word.substring((word.indexOf("dog") + 3), (word.indexOf("dog")));
                }
            }
        }
        if (countOfCats == countOfDogs) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}
