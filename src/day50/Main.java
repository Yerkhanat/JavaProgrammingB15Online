package day50;

public class Main {
    public static void main(String[] args) {
        Square s1  = new Square("my precious", 10);
        s1.calculateArea();
        System.out.println(Drawable.COLOR);
        s1.draw();

    }
}
