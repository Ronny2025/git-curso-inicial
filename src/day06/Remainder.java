package day06;

import java.util.Scanner;

public class Remainder {

    public static void main(String[] args) {

        Scanner Scan= new Scanner(System.in);

        // + - * / %

        System.out.println(5/2);
        System.out.println(5.2/2);
        System.out.println(5.2/2f);
        System.out.println(5.0/2f);

        //5 divided by 2 is 2 and remainder is 1
        //2*2 + 1= 5
        System.out.println(5%2);
        //10*10 + 0 + 99
        System.out.println(99 % 10);
        //10*10 + 0 =100
        System.out.println(100%10);

        //declare a variable called minutes data type int
        //ask user to enter minutes as whole format
        //print the result in X hours Y minutes format
        //for example 135 minutes, 2 hours 15 minutes
        System.out.println("Enter minutes");
        int minutes1 = Scan.nextInt(); //60*2+15

        System.out.println("You entered " + minutes1 + " Min.");

        int totalMinutes = minutes1 * 2+ 15;

        System.out.println( "Total Minutes is " + totalMinutes);

        System.out.println("---- modulus . remainder --- ");
        // 5 divided by 2 is 2 and remainder is 1
        // 2*2 + 1 = 5
        System.out.println(5 % 2);
        // 10*9 + 9 = 99
        System.out.println(99 % 10);
        // 10*10 + 0 = 100
        System.out.println(100 % 10);

        // declare a variable called minutes, data type int
        // ask user to enter minutes as whole number
        // print the result in x hour y minutes format
        // for example 135 minutes , 2 hours 15 minutes

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the minute you want to convert ");
        int minutes = scan.nextInt();   // 135 ; //60*2+15

        int hourPart = minutes / 60;     //135/60 ;  // -->> 2
        int minsPart = minutes % 60; // 135%60 ;  // -->> 15

        System.out.println(" The minutes " + minutes + " is "
                + hourPart + " hours and " + minsPart + " minutes");





    }
}
