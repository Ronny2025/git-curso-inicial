package day07;

import javax.swing.*;
import java.util.Scanner;

public class EmailBuilder {

    public static void main(String[] args) {

        Scanner Scan= new Scanner(System.in);
        // create a class called EmailBuilder with main method

// create 3 String variable for first name  last name , company
// create another variable for email
// create email in this format firstName_lastName@company.com

// print out the result as ,
// my name is <your full name> and I work for <company> and my email is <email>

      String firstName, lastName, company;
      String email;

        System.out.println(" Enter your First Name: ");
         firstName=  Scan.nextLine();
        System.out.println( "your first name is " + firstName);

        System.out.println(" Enter your Last Name: ");
        lastName=  Scan.nextLine();
        System.out.println( "your last name is " + lastName);

        System.out.println(" Enter your Company: ");
        company=  Scan.nextLine();
        System.out.println( "your Company is " + company);

        System.out.println(firstName +"_"+lastName + "@"+ company+"."+"com");



    }
}
