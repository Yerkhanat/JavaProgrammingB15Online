package day39;

public class Garage {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.model = "Civic";
        c1.make = "Honda";
        c1.color ="Black";
        c1.year = 2007;

        System.out.println("c1.year = " + c1.year);
        System.out.println("c1.model = " + c1.model);
        System.out.println("c1.color = " + c1.color);
        System.out.println("c1.make = " + c1.make);

        Car c2 = new Car();
        c2.model = "Corolla";
        c2.make = "Toyota";
        c2.color ="White";
        c2.year = 2012;


        System.out.println("color of corolla "+ (c2.color=c1.color));
         c2.goForward();
        c2.printYear();
       c2.changeCarColor("Blue");
        System.out.println(c2.color);

        
        
    }
    
    
    
    
}
