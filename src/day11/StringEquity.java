package day11;

public class StringEquity {
    public static void main(String[] args) {
        String s = "Rabia";
        String s1 = new String("Rabia");
        String s2 = "Rabia";
        System.out.println(s);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s == s1);
        System.out.println(s == s2);
    }
}
