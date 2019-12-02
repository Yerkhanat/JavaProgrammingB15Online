package day07;

public class Casting {
    public static void main(String[] args) {
        int num = (int) 12.99;
        int num1 = (int) 12.56;

        long earthToMoon = 238900000000l;
        int earthToMoon_int = (int) earthToMoon;


        System.out.println(num);
        System.out.println(earthToMoon_int);
    }
}
