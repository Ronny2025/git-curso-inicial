package day06;

import java.util.Scanner;

public class ScannerCapturingMultipleWord {

    public static void main(String[] args) {

        Scanner Angelo = new Scanner(System.in);

        System.out.println("What is your name ? ");
        //nextLine method of Scanner is used capture h line

        String name = Angelo.nextLine();

        System.out.println("You have entered " + name);


        //Task 4
        //  use nextLine to ask your bio
        // what is your name
        //  which city you live in, including state, Tyson, Va
        //  what is your street address.

        System.out.println("Which city and State do you live in ?");
        String location = Angelo.nextLine();
        System.out.println("You have entered " + location);

        System.out.println("What is you street address");
        String address = Angelo.nextLine();
        System.out.println("You have enterer " + address);







    }
}





