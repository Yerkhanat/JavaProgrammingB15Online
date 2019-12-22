package day24;

import java.util.Arrays;

public class ArrayClassMethod {
    public static void main(String[] args) {
//        String[] superHeros = {"Superman", "Batman", "Wonder woman", "Aquaman", "Cyborg", "Flash"};
//        System.out.println(superHeros[0]);
//        String savingSuperHerosAsString = Arrays.toString(superHeros);
//        System.out.println(savingSuperHerosAsString);
//        System.out.println(savingSuperHerosAsString.charAt(1));
//        int[] numbers = {10,44,55,3,78};
//        System.out.println(Arrays.toString(numbers));
//        System.out.println(Arrays.toString(numbers).charAt(0));

        double[] prices = {12.0, 13.0,10.0};
        String priceString = Arrays.toString(prices);
        for (int i = 0; i <priceString.length() ; i++) {
            System.out.println("char at index "+ i+ " - "+priceString.charAt(i));




        }

        // Arrays.toString(youArrayHere)
        // sort ----> Arrays.sort(yourArrayHere)
        // equals ----> Arrays.equals(FirstArray, secondArray)
    }
}
