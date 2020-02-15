package day44.Sub;

import day44.Vehicle;

import java.sql.SQLOutput;

public class Car extends Vehicle {

    int mileage;
    public void printMileage(){
        System.out.println("Current mileage" +mileage);
    }

    public static void main(String[] args) {
        Car c1 = new Car();
        c1.mileage = 39637;
        c1.setYear(2016);
        c1.make = "Toyota";
        c1.start();


    }
}
