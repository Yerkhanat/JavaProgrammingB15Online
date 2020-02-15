package day59;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionPractice {


    public static void main(String[] args) {

        // This simple program will get certain character from furkan's name
        // according to the index user provided

        System.out.println("The Start");
        String name = "Furkan";

        Scanner scan = new Scanner(System.in);
        System.out.println("Character at what index you want to get from Furkan's name ? ");

try {
    int targetIndex = scan.nextInt();
    System.out.println(name.charAt(targetIndex));
}catch (StringIndexOutOfBoundsException e){
    System.out.println(e.getMessage());

    System.out.println("Java says \" It doesn't look like anything to me\"");
}catch(InputMismatchException c) {
    System.out.println("Input miss match, Enter correct number");
}catch (Exception e){
    System.out.println("If i dont catch I would come here");
}
       // System.out.println("name = " + name);
        System.out.println("The End");


        // Exceptions are object , so it has it's own class
        // and we can create object ourselves just like we did from any other classes
        //StringIndexOutOfBoundsException e1 = new StringIndexOutOfBoundsException();
        //System.out.println( e1.toString() );


    }
}

