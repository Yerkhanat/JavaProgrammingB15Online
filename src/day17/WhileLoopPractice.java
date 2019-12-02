package day17;

public class WhileLoopPractice {
    public static void main(String[] args) {
//        int x = 0;
//        while (x<=27){
//            System.out.println("Counting value: "+ (x+=3));
//
//        }
    int even =1;
        while( even<=20 ){
            if (even%2 == 0){
                System.out.println("even number "+ even);
            }else{
                System.out.println("odd number "+even);
            }
            even+=1;
        }

    }


}
