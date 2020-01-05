package day36;

public class MethodPractice {
    public static void main(String[] args) {
      //  Boolean b = true;
        Boolean result1 = checkIfStringhasNumber("yt 3zck");
        System.out.println(result1);
    }

    /**
     * write a static method to accept a String and return Boolean(Yes Uppercase)
     * it should return true if the String contains at least one number
     *
     * @param str
     * @return true if the String contains at least one number.
     */
    public static Boolean checkIfStringhasNumber(String str) {

        for (int i = 0; i < str.length(); i++) {
            char eachChar = str.charAt(i);
            if (Character.isDigit(eachChar)) {
                return Boolean.valueOf(true);
            }

        }return Boolean.valueOf(false);
    }
}

