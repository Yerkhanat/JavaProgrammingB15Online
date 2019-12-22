package day32;

public class MethodWithReturnIntro {
    public static void main(String[] args) {
   String name = giveMeMyName();
        System.out.println("name = " + name);
        System.out.println("doubled number: "+doubleTheNumber(100));

        // create a static method that double the value of a number
    }public static String giveMeMyName(){

       // assume getting my name is multi step complex operation

        return "Yerkhanat";
    }public static int doubleTheNumber(int number){
        System.out.println("I am going to double the number "+number);
        return number*2;
    }
}
