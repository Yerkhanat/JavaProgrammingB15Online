package day35;

public class CalculatePrice {
    public static void main(String[] args) {
        String sentence1 = "I bought 3 tomato and the price was 3,14 each";
        String sentence = sentence1.replace(",",".");
        String [] allWords = sentence.split(" ");
        int count = Integer.parseInt(allWords[2]);
        double price= Double.parseDouble(allWords[allWords.length-2]);
        System.out.println("total is "+count*price);
        //System.out.println("total is"+Integer.parseInt(allWords[2])*Double.parseDouble(allWords[allWords.length-2]) );
    }
}
