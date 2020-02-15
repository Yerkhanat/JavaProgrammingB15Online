package day55;

public class SimpleCalculator {

    int result;

    public static void main(String[] args) {

        SimpleCalculator c1 = new SimpleCalculator();
//        c1.addNum(100);
        c1.addNum(100).addNum(200).addNum(100);
//        System.out.println(c1.result);
//        c1 = c1.addNum(100);
//        c1 = c1.addNum(200);
//        c1 = c1.addNum(100);


    }

    public SimpleCalculator addNum(int num) {

        this.result += num;
//        Calculator c = new Calculator();
//        return c;
        // it will return the same object you used to call this method
        // it will allow method chaining using same object
        return this;
    }
    public SimpleCalculator minusNum(int num){

        this.result-=num;
        return this;
    }

    public void displayFinalResult(){

        System.out.println(result);
    }


}