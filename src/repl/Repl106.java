package repl;

public class Repl106 {
    public static void main(String[] args) {
        String word ="song lyrics galore";


        for(int i=0; i<word.length(); i++){

            if(word.substring(i,i+1).equals("o"));
            {
                System.out.print(word.substring(i,i+1)+"");

            }
        }
    }
}
