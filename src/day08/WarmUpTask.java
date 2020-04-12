package day08;

import java.util.Scanner;

public class WarmUpTask {

    public static void main(String[] args) {

        Scanner ronny = new Scanner(System.in);

        /*voting elegibility program
        create a variable called age as int
        check wheter this age is more than equal to 18
        if yes print : you are ready to vote!!!
        if it is less 18 print wait until you are 18



        create a program to guess your favorite number
        crates a variable called myFavoriteNumber as int
        ask user to guess your favorite number
        if user guessed right then print BINGO!!
        if not print try again later
         */


        int age= 17;

        if (age >= 18) {
            System.out.println("You are ready to vote");
        }else{
            System.out.println("Wait until you are 18");


            System.out.println("What is your favorite number: ");
            int myFavoriteNumber=  ronny.nextInt();
            System.out.println("Your favorite number is " + myFavoriteNumber);

            if(myFavoriteNumber >= 10) {
                System.out.println("Bingo !!");
            }else{
                System.out.println(" Tray again later");

            }

        }
    }
}
