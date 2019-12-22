package day27;

public class MultIDArraysTask {
    public static void main(String[] args) {
        int [] [] numbers = {{12,11,10,19},{19,20,15}};
        int max = numbers[0][0];
        for(int [] eachArray : numbers ){
            for (int each : eachArray){

                if (max<each){
                    max =each;
                }
            }
        } System.out.println(max);
    }
}
