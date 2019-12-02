package day16;

public class StringPractice {
    public static void main(String[] args) {
        String keyword = "Java";
        String title = keyword +"- Google Search";

        if(keyword.startsWith("Java")&&title.endsWith("- Google Search")){
            System.out.println("passed");

        }else {
            System.out.println("failed");
        }
    }
}
