package day33;

public class Practice {
    public static int getSumFrom1toX(int x){
        int sum=0;
        for (int i = 1; i <=x ; i++) {
            sum+=i;
        }
        return sum;
    }public static String build_GOT_email(String firstName, String lastName){
        String result = firstName.charAt(0)+lastName+"@NightWatch.com";
        return result;
    }
    public static void main(String[] args) {
        System.out.println(getSumFrom1toX(2));
        System.out.println(build_GOT_email("John", "Snow"));
        String herEmail = "Susan Cure";
        //String [] herEmailSplit = herEmail.split(" ");
        System.out.println(build_GOT_email(herEmail.split(" ")[0], herEmail.split(" ")[1]));
    }
}
