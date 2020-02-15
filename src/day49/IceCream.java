package day49;

public class IceCream implements Edible {


    public static void main(String[] args) {
        IceCream i1 = new IceCream();
        i1.drink();
        i1.eat();
        i1.digest();
    }

    @Override
    public void digest() {
        System.out.println("Digesting burger by chewing more");
    }

    @Override
    public void eat() {
        System.out.println("Eat with spooon!!!!");
    }

    @Override
    public void drink() {
        System.out.println("Drink if it has melted");


    }
}
