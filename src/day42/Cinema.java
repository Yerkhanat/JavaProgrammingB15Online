package day42;

public class Cinema {
    public static void main(String[] args) {


        Movie m1 = new Movie("Gone girl", 123455, "Drama");
        System.out.println(m1);

        m1.setName("Promotheus");
        System.out.println(m1.getName());
        Movie m2 = new Movie("Joker", 1.5,"Drama");
        Movie m3 = new Movie("Pursuit of Happiness", 2.0, "drama");
        Movie m4 = new Movie();
        System.out.println("m2 = " + m2);
        System.out.println("m3 = " + m3);



    }
}
