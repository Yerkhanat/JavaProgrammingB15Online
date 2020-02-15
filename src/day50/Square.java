package day50;

public class Square extends Shape {
    int length;

    public Square(String name, int length) {
        super(name);
        this.length=length;
    }

    @Override
    public void calculateArea() {
        area = length*length;
        System.out.println(area);
    }

    @Override
    public String toString() {
        return "Square{" +
                "length=" + length +
                ", name='" + name + '\'' +
                ", area=" + area +
                '}';
    }

    @Override
    public void draw() {
        System.out.println(" Draw Equal Line "+length+ " with color "+COLOR);
    }
}
