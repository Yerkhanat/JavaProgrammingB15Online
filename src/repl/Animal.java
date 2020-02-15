package repl;

public abstract class Animal{
    String name;
    int age;
    public Animal(int age, String name){
        this.age =age;
        this.name =name;

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract int getAgeInHumanYears();





}