package day48;

import java.util.ArrayList;
import java.util.List;

public class Lion extends Mammals {


    @Override
    public void drinkMilk() {
        System.out.println("Lion drink milk");
    }

    @Override
    public void makeNoise() {
        System.out.println("Lion Say Roarrr!!");
    }

    public static void main(String[] args) {
        Lion l1 = new Lion();
        l1.makeNoise();
        l1.drinkMilk();

    Animal a1 = new Lion();
    a1.makeNoise();
    List<Integer> lst = new ArrayList<>();

    }


}
