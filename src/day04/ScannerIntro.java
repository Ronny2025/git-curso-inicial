package day04;

import java.util.Scanner;

public class ScannerIntro {

    public static void main(String[] args) {

        //I want to save input after asking questions
        //and I want to save this input so I can do something with it

        //Step 1 : use Scanner class to create object
                 // that have this functionality
        Scanner scan = new Scanner(System.in);
        // ask user to enter name
        System.out.println(" Enter your first name please :" );

        //capture what user typeon keyboard in console for name
        //scan .nextInt() is capturing single number that user entered
        String firstName= scan.next();
        //print the result of what we saved from user input
        System.out.println("you have entered : " + firstName);
        //ask question from user before entering
        System.out.println("What is your age : ");
        //capture what user typed on keyboard in console for age

        //scan .nextInt() is capturing single number that user entered
        int age = scan.nextInt();
        //print the result of user age
        System.out.println(" your age is : " + age);


    }
}
