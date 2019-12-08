package day22;

public class ArrayLoopIntro {
    public static void main(String[] args) {
        // syntax for creating variable and assingning value
        //dataType variableName = value here
        int num1 = 10;
        int[] scores = new int[4];
        scores[0]=95;
        scores[1]=70;
        scores[2]=88;
        scores[3]=100;
        for (int i = 0; i <4 ; i++) {
            System.out.println(scores[i] + " - Score ");
        }

        int [] numbers = new int[3];
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
    }
}
