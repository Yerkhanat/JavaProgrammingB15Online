package day49;

public class TestDrive {
    public static void main(String[] args) {
        Tesla t1 = new Tesla(2019, 3000);
        t1.start();
        t1.goForward();
        t1.selfDrive();
        t1.draw();
        System.out.println(t1.toString());

    }
}
