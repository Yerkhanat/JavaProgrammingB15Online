package day49;

public class Tesla extends Vehicle implements Autonomus,Drawable {

    int horsePower;
    public Tesla(int year, int horsePower) {
        super(year);
        this.horsePower= horsePower;
    }

    @Override
    public void start() {
        System.out.println("Tesla start automatically");

    }

    @Override
    public void goForward() {
        System.out.println("After started it goes forward");

    }

    @Override
    public void selfDrive() {
        System.out.println("After a mile you can switch to self drive");

    }

    @Override
    public String toString() {
        return "Tesla{" +
                "horsePower=" + horsePower +
                ", year=" + year +
                '}';
    }

    @Override
    public void draw() {
        System.out.println("I don't know what method is this");

    }
}
