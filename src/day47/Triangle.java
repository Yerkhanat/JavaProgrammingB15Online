package day47;

import java.sql.SQLOutput;

public class Triangle extends Shape {
  //  int height;
    int base;

    public Triangle(String color, String name, int height, int base) {
        super(color, name);
        this.height =height;
        this.base =base;
    }

    @Override
    public void calculateArea() {

        System.out.println("Triangle Area is "+this.height*this.base/2);

    }

    @Override
    public String toString() {
        return "Triangle{" +
                "height=" + height +
                ", base=" + base +
                ", color='" + color + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
