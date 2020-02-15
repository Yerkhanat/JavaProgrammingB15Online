package day47;

public class GasCar extends Car {

     int gasLevel;

    @Override
    public void start() {
        System.out.println("Car is going forward");
    }

    @Override
    public void goForward() {
        System.out.println("Car is going forward");

    }

    @Override
    public void goBackward() {
        System.out.println("Car is going backward");

    }

    @Override
    public void turn(String direction) {
        System.out.println("Car is turning to "+direction);

    }
}
