package day41;

public class TvAction {
    public static void main(String[] args) {
        Tv t1 = new Tv();
        t1.brand= "Sharp";
        t1.isOn = true;
        t1.currentChannel = 5;
        System.out.println(t1);
        System.out.println("Current channel is "+t1.currentChannel);
        t1.setCurrentChannel(6);
        System.out.println(t1);
        t1.moveBackward();
        t1.turnOf();
        t1.turnOn();
        t1.setCurrentChannel(50);


    }
}
