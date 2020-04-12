package day10;

public class SeasonAction {

    public static void main(String[] args) {

        /*
        what do you do in each season

        Spring==> Hike! Easter, Nawruz, Blossom
        Summer ==> swin, Vacation,BBQ, Holiday
        Fall ==> Black ffriday,Hiking, Harvest, halloween, Shopping
        Winter==> SnowBoarding, Ski, Christmas,New Year.
         */

        String season = "Fall" ;
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
