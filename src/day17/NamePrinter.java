package day17;

public class NamePrinter {
    public static void main(String[] args) {
        String name = "Alexander"; // 1-800-Alexander
        int lenght = name.length();
        int x =0;
        while (x<lenght){
            System.out.println(name.charAt(x));
            ++x;
        }

        while (lenght>0){
            System.out.println("  "+name.charAt(lenght-1));
            --lenght;
        }
    }
}
