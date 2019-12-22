package day20;

public class PalindromeTest {
    public static void main(String[] args) {
        //if you reverse the string and it does not change
        //the string is called Palindrome
        // level, kayak, elle, madam, aziza
        String name = "Nurses run";
        String reversedName = "";
        for (int x= name.length()-1 ; x >=0 ; x--) {
            reversedName = reversedName+name.charAt(x);

        }
        System.out.println("name= "+name);
        System.out.println("reversed name="+reversedName);
        if (name.equalsIgnoreCase(reversedName)){
            System.out.println("palenidrome test has passed");
        }else {
            System.out.println("failed");
        }

        // does not car about space ()
    }
}
