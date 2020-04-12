package day08;

  import java.util.Scanner;
public class WarmUpTask2 {
    public static void main(String[] args) {


        Scanner blabla = new Scanner(System.in);
        System.out.println("What is your favorite number: ");
        int myFavoriteNumber = blabla.nextInt();
        System.out.println("Your favorite number is " + myFavoriteNumber);
        if (myFavoriteNumber >= 10) {
            System.out.println("Bingo !!");
        } else {
            System.out.println(" Tray again later");

        }
    }
}