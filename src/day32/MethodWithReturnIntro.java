package day32;

public class MethodWithReturnIntro {
    public static void main(String[] args) {
   String name = giveMeMyName();
        System.out.println("name = " + name);
        System.out.println("doubled number: "+doubleTheNumber(100));
        System.out.println(divide(10,3));
        System.out.println(divide(10,0));
        System.out.println(divide(0,10));

        // create a static method that double the value of a number
    }public static String giveMeMyName(){

       // assume getting my name is multi step complex operation

        return "Yerkhanat";
    }public static int doubleTheNumber(int number){
        System.out.println("I am going to double the number "+number);
        return number*2;
    }
    public static double divide(double num1, double num2){
      if(num2==0){
          return 0.0;
      }else {
          return num1/num2;
      }

    }
}
