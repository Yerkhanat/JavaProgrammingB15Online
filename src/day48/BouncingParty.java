package day48;

import java.util.Arrays;
import java.util.List;

public class BouncingParty {
    public static void main(String[] args) {
        Bouncible b1 = new Kangaroo("Coco", 10);
        Bouncible b2 = new Ball("Round", "blue");
         Kangaroo k1 = new Kangaroo("Coco", 10);;
        System.out.println(k1.name);
         k1.eat();
         k1.KickBox();
         k1.carryChildInThePocket();
         b2.bounce();


        List<Bouncible> bounce = Arrays.asList(b1,b2);

        for (Bouncible each:bounce
             ) {

            each.bounce();


        }

    }
}
