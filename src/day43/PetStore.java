package day43;

public class PetStore {
    public static void main(String[] args) {
        Pet p1 = new Pet("Bulldog","Dog");


        whatDoesPetSpeak(p1);
    }public static void whatDoesPetSpeak(Pet petObj){
        if(petObj.getName().equals("Dog")){
            System.out.println("Woof");
        }else if(petObj.getName().equals("Cat")){
            System.out.println("Meow");

        }else if(petObj.getName().equals("Cow")){
            System.out.println("Moo");
        }else if(petObj.getName().equals("Horse")){
            System.out.println("neinei");
        }

    }
}
