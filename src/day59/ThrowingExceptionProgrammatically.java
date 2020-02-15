package day59;

public class ThrowingExceptionProgrammatically {
    public static void main(String[] args) {
//        NullPointerException e1 = new NullPointerException();
//        NullPointerException e2 = new NullPointerException("Back to Earth");
//        System.out.println(e2.getMessage());

        //throw e2; // throw is a keyword that has one purpose of throwing the exception to the runtime
        ArrayIndexOutOfBoundsException a1 = new ArrayIndexOutOfBoundsException("Hold your exceptions");
        throw a1;








    }

}
