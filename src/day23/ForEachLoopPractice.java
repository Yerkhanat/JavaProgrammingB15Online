package day23;

public class ForEachLoopPractice {
    public static void main(String[] args) {
        int[] salary = {66000,4000,89000,55000,11000,-12000};
      int max =0;
        for (int mySalary: salary){
          if(max<mySalary) {
              max = mySalary;

          }
          }System.out.println("My starting salary " + max);
    }
}
