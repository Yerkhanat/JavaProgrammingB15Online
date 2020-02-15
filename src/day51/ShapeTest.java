package day51;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShapeTest {
    public static void main(String[] args) {
        Shape s1 =new Triangle();
        Shape s2 = new Rectangle();
        Shape s3 = new Circle();
//
//        s1.draw();
//        s2.draw();
//        s3.draw();

        List<Shape> lst = Arrays.asList(s1,s2,s3);
        for (Shape each:lst
             ) {
            each.draw();

        }

        Shape [] allShapes = {s1,s2,s3, new Triangle()};
        for (Shape each1: allShapes
             ) {
            each1.draw();
        }

    }
}
