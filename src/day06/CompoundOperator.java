package day06;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CompoundOperator {
    public static void main(String[] args) {
        Scanner  input = new Scanner(System.in);

        System.out.println("please enter the student count");
        int studentOnline =input.nextInt();
        studentOnline +=5;
        System.out.println("5 people joined the class " + studentOnline);
        studentOnline -=3;
        System.out.println("3 people left the class "+ studentOnline);
        studentOnline = studentOnline*2;
        System.out.println("The student count doubled "+studentOnline);
        studentOnline = studentOnline/3;
        System.out.println("The student dropped by 3 times "+studentOnline);
    }
}
