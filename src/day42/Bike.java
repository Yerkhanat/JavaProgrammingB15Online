package day42;

public class Bike {

    int gear;
    int speed;
    String brand;
    public Bike(int gear){
        System.out.println("message from constructor");
       this.gear =gear;

    } public Bike(int gear, int speed){
        this.gear=gear;
        this.speed = speed;
    } public Bike(String str){
        System.out.println("Accept String");

    }
}
