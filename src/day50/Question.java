package day50;

public abstract class Question {
    int num1;
    int num2;
    String operator;
    int answer;
    boolean calculated;
    String questionType = "Unknown";

    public Question(String operator, String questionType) {
        this.operator = operator;
        this.questionType = questionType;
    }

    public abstract void calculate();

    public String toString(){

        return " Question type is -->>"+questionType;
    }
}
