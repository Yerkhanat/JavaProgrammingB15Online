package day47;

public class AreaCalculation {
    public static void main(String[] args) {
        Triangle t1= new Triangle("Yellow", "Pyramid", 12,12);
        t1.calculateArea();
        System.out.println(t1);
        Rectangle r1 = new Rectangle("Red", "House", 12, 12);
        r1.calculateArea();
        System.out.println(r1);
    }
}

