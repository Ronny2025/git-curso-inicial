package day42;

public class Movie {

   private String name;
   private double lentgh;
   private String type;

    public Movie() {
        System.out.println("EMPTY MOVIE");
    }
    //write a constructor to set all the fields value
    public Movie(String name, double lentgh, String type) {
        this.name = name;
        this.lentgh = lentgh;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public double getLentgh() {
        return lentgh;
    }

    public String getType() {
        return type;
    }

    //toString method to set all the fields value
    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", lentgh=" + lentgh +
                ", genre='" + type + '\'' +
                '}';
    }
}
