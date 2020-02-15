package day49;

public abstract class Vehicle {
    int year;
    public Vehicle(int year){
        this.year =year;
    }
    public abstract void start();
    public abstract void goForward();



//    Create a concrete class called Tesla
//            add instance field horsePower as int
//    Tesla extends Vehicle and implements Autonomous
//    add constructor to set all fields
//    implement all abstract methods
//    add toString methods
//    create main method to test your code
}
