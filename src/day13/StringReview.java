package day13;

public class StringReview {
    public static void main(String[] args) {
        String password ="AbH272$3gfgdsu";
        boolean min8max16 = password.length() >= 8 && password.length() <=16;
        boolean mustContains_or$ = password.contains("_") || password.contains("$");
        boolean mustStartWithAB= password.startsWith("Ab");
        boolean mustStartWithSpace = password.contains(" ");

        if(min8max16&&mustContains_or$&&mustStartWithAB&&mustStartWithSpace){
            System.out.println("valid password");
        }else {
            System.out.println("INVALID PASSWORD");
        }
    }
}
