package day47;

public class Garage {
    public static void main(String[] args) {
        ElectricCar e1 = new ElectricCar();
        e1.batteryLife =11;
        e1.start();
        e1.goForward();
        e1.goBackward();
        e1.turn("right way");

        GasCar g1 = new GasCar();
        g1.start();
        g1.goForward();
        g1.goBackward();
        g1.turn("left");
    }
}
