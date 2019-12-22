package day21;

public class NestedLoopTriangle {
    public static void main(String[] args) {
        for (int i = 10; i >=1 ; i--) {
            System.out.println();
            for (int j = 1; j <=i ; j++) {
                System.out.print(j);
            }
        }
    }
}
