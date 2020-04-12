package day41;

// Make this Product a well encapsulated
// make all the instance fields private so it can only be accessible in same class
// provide public getters and setters method
public class Product {

    //this keyword can be used to refer the current object
    //we are working on
    //we can use it to refer the instance field
    //this.

    private String name;
    private double price;

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double newPrice) {

        if (newPrice > 0) {
            price = newPrice;
        }

    }


}