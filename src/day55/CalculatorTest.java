package day55;

public class CalculatorTest {
    public static void main(String[] args) {
        SimpleCalculator c1 =new SimpleCalculator();
        c1.addNum(100).addNum(200);
        c1.displayFinalResult();


        System.out.println(c1.result);
    }
}
