package repl;

import java.util.Scanner;

public class Repl064 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //YOUR CODE HERE
        if(word.length()==1){
            System.out.println(word+word+word);
        }else if(word.length()==2){
            System.out.println(word+word);

        }else if(word.length()%2==1){
            System.out.println(""+word.charAt(word.length()/2));
        }else if(word.length()%2==0){
            int sub1 = word.length()/2;
            int sub2 = word.length()/2+1;
            System.out.println(""+word.substring(sub1,sub2)+"");

        }
    }
}
