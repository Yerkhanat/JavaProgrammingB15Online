package day21;

public class NestedLoopTask1 {
    public static void main(String[] args) {

        for (int i = 1; i <=4 ; i++) {
            System.out.println("repeat of odd numbers: " +i);
            for (int j = 10; j >=1; j--) {
                if(j%2==1){
                    System.out.print(j+" ");
                }
            }System.out.println();

        }
    }
}
