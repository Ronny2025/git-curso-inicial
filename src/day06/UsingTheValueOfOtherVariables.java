package day06;
import java.util.Scanner;
public class UsingTheValueOfOtherVariables {

    public static void main(String[] args) {
        Scanner ronny = new Scanner(System.in);

        int myFavoriteNumber = 300;

        int yourFavoriteNumber = myFavoriteNumber;


        System.out.println("My Favorite Number " + myFavoriteNumber );
        System.out.println("your Favorite Number " + yourFavoriteNumber );

        yourFavoriteNumber=100;
        System.out.println("My Favorite Number " + myFavoriteNumber );
        System.out.println("your Favorite Number " + yourFavoriteNumber );

        //Create a variable called yourOrder. type String and assign a value
        //Create another variable called my order and assign the value
        //to same value as yourOrder by copying
        //and just them out.

        String yourOrder = "Caramel Machiato";
        String myOrder="Caramel Latte";

        System.out.println("Your Order is : " + yourOrder + "\n" + "My Order is: " + myOrder);



    }
}
