package repl.Tjmaxx235;

import repl.Animal;

public class Dog extends Animal {
    String breed;
    int humanYears;

    public Dog(String name, int age, String breed) {

        super(age, name);
        this.breed=breed;

    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setHumanYears(int humanYears) {
        this.humanYears = humanYears;
    }
    int x = getAge();

    public String getBreed() {
        return breed;
    }

    public int getHumanYears() {
        return humanYears;
    }

    @Override
    public int getAgeInHumanYears() {

        if(x<=2 ){
            return x*11;
        }else {
            return 22+((x-2)*5);
        }
    }

    @Override
    public String toString() {
        return  "Name: " +getName()+"\n"+
                "Breed: " + breed + "\n" +
                "Age in calendar years: "+getAge()+"\n"+
                "Age in human years: " + getAgeInHumanYears() ;
    }
}
