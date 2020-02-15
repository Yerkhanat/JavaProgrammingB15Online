package repl;

public class Repl210 {
    public static void main(String[] args) {
        String word = "----qwe--r--tyf...gd.---";

       // char [] allWord= word.toCharArray();
        String reverse = "";
        String result= "";
        for (int i = word.length()-1; i>=0;i--) {
            if(Character.isLetter(word.charAt(i))){
                reverse +=word.charAt(i);

            }

        }
        for (int x = 0, y=0; x <word.length() ; x++) {

            if(!Character.isLetter(word.charAt(x))){
                result +=word.charAt(x)+"";
            }else {
                result += reverse.charAt(y);
                y++;
            }


        }
        System.out.println(result);





    }

}
