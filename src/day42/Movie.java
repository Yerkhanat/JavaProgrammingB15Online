package day42;

public class Movie {
  private  String name;
  private double length;
  private  String genre;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getLength() {
        return length;
    }

    public String getGenre() {
        return genre;
    }

    public Movie(){
        System.out.println("Empty Movie");
    }

    public Movie(String name, double length, String genre){

        this.name =name;
        this.length = length;
        this.genre = genre;

    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", length=" + length +
                ", genre='" + genre + '\'' +
                '}';
    }
}
