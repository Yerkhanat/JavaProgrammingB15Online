package repl;

import java.util.Scanner;

public class Repl100 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = "breadAbread";
        int count=0;


        for (int i=0; i<str.length()-4;i++){
            if(str.substring(i,i+5).equals("bread")) {
                count++;


                if (count == 3) {

                    int sub1 = str.indexOf("bread") + 5;
                    String str1 = str.substring(str.indexOf(("bread"), sub1));
                    int sub2 = str1.indexOf("bread") + 5;
                    int sub3 = str1.indexOf(("bread"), sub2);
                    String str2 = str1.substring(sub2, sub3);
                    System.out.println(str2);


                    break;
                }
                else if (count == 2) {
                    int sub1 = str.indexOf("bread") + 5;
                    int sub2 = str.indexOf(("bread"), sub1 + 1);
                    System.out.println(str.substring(sub1, sub2));
                    break;

                }
            }
        }if(count<2) {
            System.out.println("nothing");
        }
    }
}
