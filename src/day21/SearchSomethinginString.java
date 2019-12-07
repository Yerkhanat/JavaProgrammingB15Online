package day21;

public class SearchSomethinginString {
    public static void main(String[] args) {
        String name = "My name is Yerkhanat";
        int count =0;
        for (int i = 0; i <name.length() ; i++) {

            if(name.substring(i,i+1).equalsIgnoreCase("a")) {
                count++;
            }
            }

        System.out.println(count);
    }
}
