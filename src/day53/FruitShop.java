package day53;

import java.util.List;

public class FruitShop {
    public static void main(String[] args) {
        Apple a1 = new Apple("sweet", "red", "Fuji");

        System.out.println("a1.color = " + a1.color);
        System.out.println("a1.type = " + a1.type);
        System.out.println("a1.taste = " + a1.taste);
        a1.getDigested();
        System.out.println("//------------------------------");
        Fruit f1=a1;
        System.out.println("f1.color = " + f1.color);
        System.out.println("f1.taste = " + f1.taste);
        f1.getDigested();
        System.out.println("------------------------------");

        Fruit f2 = new Apple("crispy but tasteless","hot red","Gala");
        Fruit f3= new Orange("sour","orange",12);
        Fruit f4 = new Orange("very sweet", "Blood Red",10);


        Fruit [] myFruits = {f1,f2,f3,f4};
        for (Fruit each :myFruits){
            each.getDigested();

        }




    }
}
