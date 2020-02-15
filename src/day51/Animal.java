package day51;

public class Animal {
public void makeNoise(){
    System.out.println("general animal noise");
}
}
class Dog extends Animal{
    @Override
    public void makeNoise(){
        System.out.println("Woof!!!!");
    }
}

class Horse extends Animal{

    @Override
    public void makeNoise() {
        System.out.println("NeiNei!!!!");
    }
}