package day43;

import day42.Movie;

public class MovieActions {
    public static void main(String[] args) {

        Movie m1 = new Movie("Frozen", 1.4,"cartoon");
        printMovieInfo(m1);
        m1.setName("Myn Bala");
        printMovieInfo(m1);
        Movie m2 = new Movie("Cinderella", 1.5, "Family");
        printMovieInfo(m2);
        printShorterDurationMovie(m1,m2);
        Integer i1 = Integer.valueOf(12);
        Movie result =printMovieName();
        System.out.println("result.getName() = " + result.getName());

    }

    public static void printMovieInfo(Movie movieObj){

        System.out.println("The movie name is = "+ movieObj.getName());
        System.out.println("The movie length is = "+ movieObj.getLength());
        System.out.println("The genre is = "+movieObj.getGenre());



    } public static void printShorterDurationMovie(Movie mv1, Movie mv2){

        if(mv1.getLength()>mv2.getLength()){

            System.out.println("The movie "+mv1.getName()+" has longer duration");
        } else {
            System.out.println("The movie "+mv2.getName()+" has longer duration");
        }
    } public static Movie printMovieName (){
        Movie j = new Movie("Joker",2.5, "Drama");

        return j;
    }

}
