package repl;

import java.util.*;

public class Repl203 {
    public static void main(String[] args) {

        System.out.println(isPalindrome("Noon"));

        }
        //create your method below
         public static boolean isPalindrome(String check) {

              String check1 = check.toLowerCase();
              String [] check2 = check1.replace(" ", "").split("");
              String check3= check1.replace(" ","");

           ArrayList <String> pl = new ArrayList<>(Arrays.asList(check3));

             System.out.println(pl);
            String empty = "";
             for (int i = check2.length-1; i >=0 ; i--) {
                 empty+=check2[i];

             }
             ArrayList <String> pl1 = new ArrayList<>(Arrays.asList(empty));

           return pl.equals(pl1);


  }




    }













