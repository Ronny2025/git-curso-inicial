package day39;

public class CarCreation {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.color ="blue";
        c1.make= "Toyota";
        c1.year=2007;
        c1.goForward();
        c1.printCarAge();
        c1.changeColorTo("Green" );

        System.out.println("c1 color "+c1.color);

        System.out.println("--------------------");

        Car c2 = new Car();
        c2.color ="Brown";
        c2.make= "Kia";
        c2.year=2004;
        c2.goForward();
        c2.printCarAge();
        c2.changeColorTo("white");
        System.out.println("c2 color "+c2.color);

        System.out.println("c2 make "+c2.make);
        System.out.println("c2 year "+c2.year);

        System.out.println("--------------------");

        Car c3 = new Car();
        c3.color ="Red";
        c3.make= "Nissan";
        c3.year=2004;
        System.out.println("c3 year "+c3.year);

        c2.year=2020;
        c2.color=c1.color;
        System.out.println("c2 year "+c2.year );
        System.out.println("c2 color "+c2.color );

    }
}
