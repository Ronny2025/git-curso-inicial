package day18;

import java.util.Scanner;

public class SmartLockOpener {

    public static void main(String[] args) {

        //smart lock door has password
        //unless you eneter correct paaword
        ///it keep locking you out
        //assuming correct password is B15
        //keep asking until user enter correct one

        Scanner scan = new Scanner(System.in);

        System.out.println("Knock knock!!");
        System.out.println(" what is the password?");

        //entering password for the first time
        String password = scan.next();

       // while (!password.equals("B15")) {
            while (!password.equalsIgnoreCase("B15")) {


            System.out.println("wrong password!! try again!!");
            password = scan.next();
        }

        System.out.println("open sesame!!!");
    }
}