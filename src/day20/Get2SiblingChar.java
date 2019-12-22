package day20;

public class Get2SiblingChar {
    public static void main(String[] args) {
        String name = "Arya";
        for (int i = 0; i <name.length()-1 ; i++) {
            System.out.println(name.charAt(i)+""+name.charAt(i+1));

        }
    }
}
