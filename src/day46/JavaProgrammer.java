package day46;

import java.sql.SQLOutput;

public class JavaProgrammer extends Programmer {
    @Override
    public void code() {
        System.out.println("I code Java");
    }

    @Override
    public void test() {
        System.out.println("We do Test");
    }

    public void drinkCoffee(){
        System.out.println("Java programmer drinks a lot of coffee");
    }
    public void doRepl(){
        System.out.println("Java programmer solves a lot of Repls to practice");
    }

    public void doJavaDevelopment(){
        System.out.println("Java programmer does a lot of development");
    }
}
