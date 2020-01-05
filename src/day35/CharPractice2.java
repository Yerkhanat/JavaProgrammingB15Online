package day35;

public class CharPractice2 {
    public static void main(String[] args) {
     String str = "A34B123C4X";
     int sum =0;
     char [] allChar = str.toCharArray();
     for (char each: allChar){
         if(Character.isDigit(each)){
             sum += Integer.parseInt(each+"");

         }

     }
        System.out.println(sum);
    }
}
