package day23;

public class WarmUp_array {
    public static void main(String[] args) {
        String[] shows = {
                "Orville", "Gifted",
                "Game Of Throne", "Flash",
                "Arrow", "Super girl"
                                       };
        int showsCount = shows.length;
        System.out.println(showsCount);

        for (int i = 0; i <showsCount ; i++) {
            int showLength = shows[i].length();
            System.out.println("My favorite shows: "+shows[i]+". Character count: "+showLength);
        }



    }
}
