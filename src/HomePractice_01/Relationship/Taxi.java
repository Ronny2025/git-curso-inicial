package HomePractice_01.Relationship;

public class Taxi {

    int plate;
    Engine eng;



}

class Engine{

    String Type;
    int horsePower;

    public Engine(String type, int horsePower) {
        Type = type;
        this.horsePower = horsePower;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "Type='" + Type + '\'' +
                ", horsePower=" + horsePower +
                '}';
    }
}
