package day34;

public class MethodPracticeMonkey {
    public static void main(String[] args) {
        /**
        * @param aSmile
        * @param bSmile
        * @return true only if both monkeys are smiling or no smiling
         */
        System.out.println (monkeyTrouble(false,false));
    } public static boolean monkeyTrouble (boolean aSmile, boolean bSmile){
        if(aSmile==bSmile){
            return true;
        }
    else {
        return false;
        }

    }
}
