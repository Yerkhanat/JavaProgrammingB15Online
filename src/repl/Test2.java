package repl;

public class Test2 {
    public static void main(String[] args) {
        String name = "admin"; // String to check it's value
        int nameLenght = name.length(); // length of the string used for the loop

        for (int i = 0; i < nameLenght; i++) {   // while counting characters if less than the length add one
            char character = name.charAt(i); // start on the first character
            int ascii = (int) character; //convert the first character
            System.out.println(character + " = " + ascii);
        }
    }
}
