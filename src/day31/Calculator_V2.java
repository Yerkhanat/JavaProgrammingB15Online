package day31;

public class Calculator_V2 {
    public static void main(String[] args) {
        calculator('+',10,11);

    }

    public static void calculator (char operator, int num1, int num2){
        switch (operator){
            case '+':
                System.out.println("addition result is:"+(num1+num2));
                break;
            case '-':
                System.out.println("addition result is:"+(num1-num2));
                break;
            case '/':
                System.out.println("addition result is:"+(num1/num2));
                break;
            case '*':
                System.out.println("addition result is:"+(num1*num2));
                break;
            default:
                System.out.println("invalid operator");
        }

    }
}
