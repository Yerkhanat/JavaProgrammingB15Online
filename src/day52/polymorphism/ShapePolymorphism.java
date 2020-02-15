package day52.polymorphism;

public class ShapePolymorphism {
    public static void main(String[] args) {
        Drawable d1 = new Circle("Pizza", 12);

        Shape s1 = new Circle("PIzza", 5);
        Shape s2 = new Rectangle("Book", 10, 5);
        printAnyShapeArea(s1);
        printAnyShapeArea(s2);
        drawShape3Times(s1);
    }

    public static void printAnyShapeArea(Shape anyShape) {
        anyShape.calculateArea();
        System.out.println(anyShape.name + "\'s area is  " + anyShape.area);

    }

    public static void drawShape3Times(Shape anyShape2) {

        for (int i = 0; i < 3; i++) {
            anyShape2.draw();

        }

    }
}
