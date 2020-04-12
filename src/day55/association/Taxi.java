package day55.association;

//taxi-==>  Engine == Driver == passengers

//Taxi has driver == Driver object has 2 attribute (name, driverID)

//Create a class called Driver == it has 2 attribute (name String, driverID int)

//constructor to set the value , add toString method so we can print out

//Add instance field called Driver dr, update your constructor to set Driver as well


public class Taxi {

    int platenumber;
    //just like  String, we have class engine
    //so I can use it as data type
    Engine eng;
    //just like  String, we have class engine
    //so I can use it as data type
    Driver dr;


    public Taxi(int platenumber, Engine eng, Driver dr) {
        this.platenumber = platenumber;
        this.eng = eng;
    }

    @Override
    public String toString() {
        return "Taxi{" +
                "platenumber=" + platenumber +
                ", Engine=" + eng +
                ", Driver =" + dr +
                '}';
    }
}


