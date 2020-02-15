package day40;

public class SpaceShipInAction {
    public static void main(String[] args) {

        SpaceShip ss = new SpaceShip();
        ss.name = "SpaceX";
        ss.setDirection("right");
        ss.setInitialPosition(1,5);
        System.out.println(ss);
        ss.move1Block();
        ss.move1Block("down");
        System.out.println(ss);



    }
}
