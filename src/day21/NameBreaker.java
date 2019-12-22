package day21;

public class NameBreaker {
    public static void main(String[] args) {
        String name ="Yerkhanat";
        for (int x = 0; x <name.length(); x++) {
            if (name.substring(x, x + 1).equalsIgnoreCase("n")){
            System.out.println("found it at index: " +x);
            break;
        }
            System.out.println(name.substring(x,x+1));
        }
    }
}
