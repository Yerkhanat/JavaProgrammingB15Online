package day43;

public class Pet {
    private String breed ;
    private String name ;
    public Pet() {

        this.breed ="Unknown";
        this.name = "no-name";
    }
   public Pet(String breed, String name){

        this.breed =breed;
        this.name = name;
   }


     public void speak(){

        if (breed.equalsIgnoreCase("cat")){
            System.out.println("meow");
        } else if(breed.equalsIgnoreCase("dog")){
            System.out.println("woof");
        } else if(breed.equalsIgnoreCase("cow")){
            System.out.println("moo");
        } else if(breed.equalsIgnoreCase("horse")){
            System.out.println("neinei");
        } else {
            System.out.println("invalidType");
        }
    }





    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "breed='" + breed + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public static void showGeneralPetInfo() {
        System.out.println("PETS ARE FRIEND OF HUMANS");
    }







}
