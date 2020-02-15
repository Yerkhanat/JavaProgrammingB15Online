package day50;

public class Addition extends Question {
    public Addition( int num1, int num2){
        super("+","Addition question" );
        this.num1 =num1;
        this.num2=num2;
    }

    @Override
    public void calculate() {
        answer = num1+num2;
        this.calculated = true;
    }

    public String toString(){


       if(calculated == true) {

           return super.toString()+ " "+ num1 + operator + num2 + "= " +"\n answer is "+num1 + operator + num2 + "= " + answer;
       } else {
           return num1 +operator +num2 + " = ";
       }
}
}
