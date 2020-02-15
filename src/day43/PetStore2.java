package day43;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PetStore2 {
    public static void main(String[] args) {
        Pet p1 = new Pet("cat","David");
        Pet p2 = new Pet("horse","Walter");
        Pet p3 = new Pet("goose","Samantha");
        Pet p4 = new Pet("donkey","Oliver");
        Pet p5 = new Pet("dog","Henry");
        Pet p6 = new Pet("cow","Adam");
        Pet p7 = new Pet("ant","Atom");
        Pet p8 = new Pet("bear","Teddy");
        Pet p9 = new Pet("cat","Stephanie");
       
        
        List<Pet> myPets = (Arrays.asList(p1,p2,p3,p4,p5,p6,p7,p8,p9));

        System.out.println("myPets = " + myPets);
        for (Pet each: myPets
             ) {

            System.out.println("each name ="+each.getName());
            each.speak();
            
        }
        for (Pet eachCat: myPets
             ) {
            if(eachCat.getBreed().equalsIgnoreCase("cat")){
                System.out.println("cat name is ="+eachCat.getName());
            }
        }







    }
}
