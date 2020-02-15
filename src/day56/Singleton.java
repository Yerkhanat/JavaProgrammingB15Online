package day56;

/*
*Sometime we want to make a class that only generate single object
* throughout the entire application
 *
 */

public class Singleton {
    private static Singleton instance;



    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();

        } else {
            System.out.println("We already have this object");
        }
        return instance;
    }

    private Singleton(){
        System.out.println("nor arg being called!!!");
    }



}
