package day47;

public abstract class Shape {
    String color;
   String name;
   int height;

    public Shape(String color, String name){
        this.color =color;
        this.name = name;

    }

    public abstract void calculateArea();


}
