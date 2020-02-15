package day50;

import java.util.Arrays;
import java.util.List;

public class Calculator {
    public static void main(String[] args) {
        Addition a1 = new Addition(12,14);
        a1.calculate();
        System.out.println(a1);
        Substraction s1 = new Substraction(10, 90);
        s1.calculate();
        System.out.println(s1);
        Multiplication q4 = new Multiplication(10, 3);
        System.out.println("q4 = " + q4);
        q4.calculate();
        System.out.println("q4 = " + q4);

        Division q5 = new Division(10, 5);
        System.out.println("q5 = " + q5);
        q5.calculate();
        System.out.println("q5 = " + q5);

        Division q6 = new Division(10, 50);
        System.out.println("q6 = " + q6);
        q6.calculate();
        System.out.println("q6 = " + q6);

        Division q7 = new Division(10, 0);
        System.out.println("q7 = " + q7);
        q7.calculate();
        System.out.println("q7 = " + q7);

        System.out.println(" ================== ");

        List<Question> allTestQuestions = Arrays.asList(a1, s1, q4, q5, q6, q7);
        for (Question eachQ : allTestQuestions) {

            System.out.println("eachQ = " + eachQ);

        }



    }
}
