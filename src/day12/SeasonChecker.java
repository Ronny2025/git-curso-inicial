package day12;

import java.util.Scanner;

public class SeasonChecker {

    public static void main(String[] args) {

        Scanner blabla = new Scanner(System.in);

        System.out.println(" Please enter season: ");

        String season = blabla.nextLine();

        if (season.equalsIgnoreCase("summer")) {
            System.out.println("Hiking, Navruz, Allergy season, cool weather");
        } else if (season.equalsIgnoreCase("spring")) {
            System.out.println("fishing, soccer, Allergy season, cool weather");
        } else if (season.equalsIgnoreCase("fall")) {
            System.out.println("rain, foggy, chilly weather, Thanksgiving");
        } else if (season.equalsIgnoreCase("winter")) {
            System.out.println("snow, rain,  Christmas, cold weather");
        } else {
            System.out.println(" invalid season ");

        }
    }
}



