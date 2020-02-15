package day59;

public class CheckedAndUnchecked {
    public static void main(String[] args) throws Exception {
        String x = "abc";
        System.out.println(x.charAt(100));
        // Exception Hiearachy
        // Throwable ->> child class --->> Exception

        // Under Exception class ,
        //throw new RuntimeException("just throwing it out!");
        throw new Exception("just throwing this array");

    }

}
