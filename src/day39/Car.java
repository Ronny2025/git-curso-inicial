package day39;

public class Car {
    int year;
    String model,color,make;
        //or in one shot
    //String model, make, color;

    //instance methods are tied to the object
    //it does not have static keyword
    //we need an object when we call them
    public void goForward(){
        System.out.println("Going forward ");
    }

    //create a method to print how old this car is
    public void printCarAge(){
        System.out.println("car age: "+ (2020 - year));
    }
    //create a method to change the color
    public void changeColorTo(String newColor){
        //Write bunch of code here to validate
        //user is actually passing correct color
        //for example Red, Blue is valid color
        //      ABC, EFG is not valid color
        color = newColor;
    }
}
