package day44;

public class Train extends Vehicle {
    int wagonBCount ;
    public void makeChoChoSound(){

        System.out.println( " Choo choo ");

    }


    public static void main(String[] args) {

        Train t1 = new Train();
        t1.makeChoChoSound();
        t1.goForward();
        t1.setMake("Thomas");
        t1.setYear(1954);
        t1.start();
        t1.goForward();
    }

}
