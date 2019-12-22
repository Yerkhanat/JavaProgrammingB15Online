package day25;

import java.util.Arrays;

public class StringToCharArrayMethod {
    public static void main(String[] args) {
        String name ="Alesya";
        String name2 ="Yerkhanat";
        char[] namesChars = new char[name.length()];
//        namesChars[0]=name.charAt(0);

        for (int i = 0; i <namesChars.length ; i++) {
            // take each character of name and fill the char array values
            namesChars[i] = name.charAt(i);


        }
        System.out.println("namesChars = "+ Arrays.toString(namesChars));
    char[] namesChars2= name2.toCharArray();
        System.out.println("namesChars= "+ Arrays.toString(namesChars2));


    }

}
