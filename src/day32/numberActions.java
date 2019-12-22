package day32;

public class numberActions {
    public static void main(String[] args) {
        numberSort(4,8);
        numberSort(4,4);
        numberSort(10,1);
        strToRepeat("I love JAVA", 5);
        skipCountBy3From0to50();
        countDownByEvenNumberFrom50to0();
        print1ToX(15);

    }
    public static void numberSort(int num2, int num1 ){
        if(num1>num2) {
            System.out.println(num1 +" is more than "+ num2);
            System.out.println("============");
        } else if (num1<num2){
                    System.out.println(num1+ " is less than "+num2);
                    System.out.println("============");
        } else if(num1==num2){
            System.out.println(num1+" and "+ num2+" is equal");
            System.out.println("============");

        }
    } public static void strToRepeat (String str, int count) {

        for (int i = 0; i <count ; i++) {
            System.out.println(str);

        }
        System.out.println("repeated "+count+ " times");
        System.out.println("===========");

    }  public static void skipCountBy3From0to50(){
        for (int i = 0; i <50 ; i+=3) {
            System.out.print((i)+" ");

        }
        System.out.println();
        System.out.println("=========");
    } public static void countDownByEvenNumberFrom50to0(){
        for (int i = 50; i >=0 ; i-=2) {
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("===========");
    } public static void print1ToX(int x){

        for (int i = 1; i <=x ; i++) {

            System.out.print(i+" ");

        }
        System.out.println();
        System.out.println("===========");
    }






}
