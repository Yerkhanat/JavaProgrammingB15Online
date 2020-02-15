package day47;

public class ElectricCar extends Car {
    int batteryLife;

    @Override
    public void turn(String direction) {
        System.out.println("your car is moving to "+direction);
    }

    @Override
    public void goBackward() {
        System.out.println("Car is going backward");
    }

    @Override
    public void start() {
        System.out.println("This is how Electric car starts");
    }

    @Override
    public void goForward() {
        System.out.println("Electric car is going forward");
    }


}
