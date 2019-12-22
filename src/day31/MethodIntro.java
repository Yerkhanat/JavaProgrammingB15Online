package day31;

import day03.PrintVsPrintln;

public class MethodIntro {
    public static void main(String[] args) {
     // Two ways to call
     // ClassName.methodName(External data if needed)
     // if you are in same class
     // you can directly called them
       //MethodIntro.sayHello();
        System.out.println("Begin");
        sayHello();
        System.out.println("-----------");
        sayHello();
        System.out.println("The end");

        MethodIntro2.option2();
        PrintVsPrintln.day03();

    }  // <------main method ends here

    // DO  NOT A METHOD INSIDE MAIN METHOD
    public static void sayHello (){
        System.out.println("Hello World");
        System.out.println("My name is Juma");
        System.out.println("I love Java");

    }
}

