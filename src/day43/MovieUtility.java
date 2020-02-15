package day43;

import day42.Movie;

public class MovieUtility {
    public static void main(String[] args) {

        printMovieInfo(new Movie("Titanic", 2.1,"drama" ));

    }public static void printMovieInfo(Movie movieObj){

        System.out.println("The movie name is = "+ movieObj.getName());
        System.out.println("The movie length is = "+ movieObj.getLength());
        System.out.println("The genre is = "+movieObj.getGenre());

    }
}
