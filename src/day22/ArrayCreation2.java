package day22;

public class ArrayCreation2 {
    public static void main(String[] args) {
        int[] numbers = new int[]{3,5,7,9,11,13,15,17};
        int itemCount = numbers.length;
        int lastIndex =itemCount-1;

        for (int i = 0; i <itemCount ; i++) {
            System.out.print(numbers[i]+" ");

        }
    }



}
