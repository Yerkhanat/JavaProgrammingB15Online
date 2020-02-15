package day49;

public interface Edible {

    public static final boolean IS_HUMAN_FOOD = true;

    // If method is no-body is not defined public abstract,
    // it is automatically public abstract

    public abstract void eat();
    public abstract void drink();
    public default void digest(){
        System.out.println("You Implement the code yourself !!");
    }

}
