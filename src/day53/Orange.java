package day53;

public class Orange extends Fruit {
    int vcLevel;


    public Orange(String taste, String color, int vcLevel) {

        super(taste, color);

        this.vcLevel = vcLevel;

    }

    @Override
    public void getDigested() {
        System.out.println("Orange with Vitamin C level "+"has color" +color +
                " it has "+ taste +" tas when you digest");

    }

    @Override
    public String toString() {
        return "Orange{" +
                "vcLevel=" + vcLevel +
                ", taste='" + taste + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}