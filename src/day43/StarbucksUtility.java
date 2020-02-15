package day43;

public class StarbucksUtility {
    public static void main(String[] args) {
        Coffee c1 = new Coffee("Blonde", 5, 1.6);
        printCoffeeInfo(c1);
        printStringInfo(c1);
        printCoffeeInfo(new Coffee("latte",5,1.4));

    }

    // Create a static method to accept coffee object and print its information
    // like this: This coffee is: name, price is <price>, caffeine level is <level>
    public static void printCoffeeInfo(Coffee co){

        System.out.println("This coffee is: "+co.getType());
        System.out.println("The price is "+co.getPrice());
        System.out.println("The caffeine level is "+co.getCaffeineLevel() );

    } public static void printStringInfo(Coffee co){

        System.out.println(co.getType().charAt(0));


    }





}
