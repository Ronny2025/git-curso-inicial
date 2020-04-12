package day10;

import java.util.Scanner;

public class SeasonAction_Scanner {

    public static void main(String[] args) {

        /*
        what do you do in each season

        Spring==> Hike! Easter, Nawruz, Blossom
        Summer ==> swin, Vacation,BBQ, Holiday
        Fall ==> Black ffriday,Hiking, Harvest, halloween, Shopping
        Winter==> SnowBoarding, Ski, Christmas,New Year.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Hey what is the season!!!? ");

        String season = scan.next();
        // byte, short, int, char, String
        switch ( season){

            case"Spring":
                System.out.println("Hike! Easter, Nawruz, Blossom");
                break;
            case"Summer":
                System.out.println("swin, Vacation,BBQ, Holiday");
                break;
            case"Fall":
                System.out.println("Black ffriday,Hiking, Harvest, halloween, Shopping");
                break;
            case"Winter":
                System.out.println("SnowBoarding, Ski, Christmas,New Year");
                break;


        }

    }
}


