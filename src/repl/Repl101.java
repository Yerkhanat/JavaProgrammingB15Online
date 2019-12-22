package repl;

public class Repl101 {
    public static void main(String[] args) {

        String word = "python is an interpreted.";
        int count1=0;
        int count2=0;
        for (int i=0; i<word.length()-4; i++){
            if(word.substring(i,i+4).equals("java")){
                count1++;
            }
        }
        for (int x=0; x<word.length()-5; x++){
            if(word.substring(x,x+5).equals("python")){
                count2++;
            }
        }
        if(count1==count2){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
