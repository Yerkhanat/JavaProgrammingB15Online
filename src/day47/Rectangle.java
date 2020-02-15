package day47;

public class Rectangle extends Shape {
   // int height;
    int width;

    public Rectangle(String color, String name, int height, int width) {
        super(color, name);
        this.height= height;
        this.width =width;
    }

    @Override
    public void calculateArea() {
        System.out.println("Area of rectangular is "+height*width);

    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                ", width=" + width +
                ", color='" + color + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
