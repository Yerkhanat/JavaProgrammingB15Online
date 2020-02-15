package day44;

public class Vehicle {
  protected String make;
  private int year;

  public void setMake(String make) {
    this.make = make;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public void start(){

    System.out.println("Starting "+ make);
  }public void goForward(){

    System.out.println(make + " Go forward");
  }



}
