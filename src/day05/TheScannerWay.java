package day05;

import java.util.Scanner;

public class TheScannerWay {
    public static void main(String[] args) {
        // ask user name
        //and capture the result
        //print your name is
        //ask your name is
        // ask user for birth year
        //and capture the result
        //print the age
        //ask user for height
        //and capture the result
        //print the height

        // create scanner object
        // you can name a variable whatever you want
        //in below case we are calling is scan
        //Scanner is data type, scan is the name , new scanner(system.in)is the value
        Scanner scan = new Scanner(System.in);

        System.out.println("What is your name : ");
        //String name = "Sam";
        String name = scan.next();
        System.out.println(" My name is  " + name);

        System.out.println(" What is your birth year :");
        int birthYear = scan.nextInt();
        int age = 2019 - birthYear;

        System.out.println("my age is : "  + age);

        System.out.println(" What is your height ? ");
        double height = scan.nextDouble();
        System.out.println("your height is : " + height);












    }
}
