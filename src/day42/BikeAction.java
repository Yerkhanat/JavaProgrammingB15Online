package day42;

public class BikeAction {


    public static void main(String[] args) {

        Bike b1 = new Bike(2);
        Bike b2 = new Bike(4);
        System.out.println("b1.gear = " + b1.gear);
        System.out.println("b2.gear = " + b2.gear);

        Bike b3 = new Bike(12);
        System.out.println("b3.gear = "+b3.gear);

        Bike b4 = new Bike(22,32);
        System.out.println(b4.gear);
        System.out.println(b4.speed);
        Bike b5 = new Bike("Hello");


        // I want bike object with both speed and gear set to value I specify




    }
}
