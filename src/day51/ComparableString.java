package day51;

public class ComparableString {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "xyz";
        //different result means those are not equal
        // abc < xyz
        System.out.println(s1.compareTo(s2));
        System.out.println(s2.compareTo(s1));
    }
}
