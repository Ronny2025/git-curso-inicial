package day48;
//this is how we create an interface
//interface is abstract type just like abstract class
//no object can be created from it
//it provide guideline for implementing classes
//it is like signing a contract
public interface Flyable {


    //an interface can only have public final field
    public static boolean HAVE_WING = true;

    //can we have have constructor ? : ABSOLUTLY NO!!!!!

    public abstract void fly();
}
