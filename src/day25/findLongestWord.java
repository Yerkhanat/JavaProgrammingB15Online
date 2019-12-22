package day25;

public class findLongestWord {
    public static void main(String[] args) {


    String sentence ="I love Janar very much";

   String[] allWords = sentence.split(" ");

   String longestWord = allWords[0];
   int maxCharCount= 0;


   for(String currentWord : allWords) {
       if (currentWord.length()>longestWord.length()){
           longestWord=currentWord;

       }


   }    char[] charCount =longestWord.toCharArray();
        maxCharCount =charCount.length;
        System.out.println("Longest word = "+ longestWord);
        System.out.println("Longest word has "+maxCharCount+" characters.");



    }



}
