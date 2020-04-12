package day45;

public class Dog extends Animal {
    public static void main(String[] args) {

        Dog twix = new Dog();
        twix.speak();


    }

    @Override
    public void speak() {
        //super.can be used to specify we are calling
        //super class version of the method
        super.speak();
        System.out.println("BARK!!!");

    }
}
