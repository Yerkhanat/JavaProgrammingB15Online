package day50;

public class Substraction extends Question {
    public Substraction(int num1, int num2) {
        super("-", "Subtractions calculation ");
        this.num1 =num1;
        this.num2= num2;
    }

    @Override
    public void calculate() {
        if(this.num1>this.num2){
            int temp = this.num1;
            this.num1= this.num2;
            this.num2=temp;
            answer = this.num2- this.num1;
        }else {
            answer = this.num2 -this.num1;
        }
        this.calculated = true;


    }
    @Override
    public String toString(){


        if(this.calculated) {

            return super.toString()+ " "+ num1 + operator + num2 + "= " +"\n answer is "+num1 + operator + num2 + "= " + answer;
        } else {
            return num1 +operator +num2 + " = ";
        }
    }






}

