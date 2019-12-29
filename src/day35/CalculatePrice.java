package day35;

public class CalculatePrice {
    public static void main(String[] args) {
        String sentence = "I bought 3 tomato and the price was 3.14 each";
        String [] allWords = sentence.split(" ");
        int count = Integer.parseInt(allWords[2]);
        double price= Double.parseDouble(allWords[allWords.length-2]);
        System.out.println("total is "+count*price);
    }
}
