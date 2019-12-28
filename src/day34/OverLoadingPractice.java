package day34;

public class OverLoadingPractice {
    public static void main(String[] args) {

        add1(100);
        add1(100,150);
        add1(100,150,200);
        add1(1999999l,93383939l);

    }public static void add1(int x){
        System.out.println("adding 100 = "+(x+100));
    }public static void add1(int sum1, int sum2){
        System.out.println("Sum of 2 ="+(sum1+sum2));
    }public static void add1(int sum3, int sum4, int sum5){

        System.out.println("Sum of 3 = "+(sum3+sum4+sum5));
    }public static void add1(long sum6, long sum7){
        System.out.println("Sum of long ="+(sum6+sum7));
    }
}
