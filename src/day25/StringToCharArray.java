package day25;

public class StringToCharArray {
    public static void main(String[] args) {
        String name = "Yerkhanat";
        int count = 0;
        char[] namesChar= name.toCharArray();
        for (char eachChar: namesChar){

            System.out.println("each char = "+ eachChar);

            if (eachChar == 'a'){
                count++;
            }
        } System.out.println("in name Yerkhanat there are <"+count+"> \"a\" letter");
    }
}
