package day10;

public class Multibranch_Practice {

    public static void main(String[] args) {

        //at the McDonalds Drive thru
        System.out.println("Welcome to McDonald, what can I get for you");
       /*
       11, burger
       5, french fries
       8, nuggets
       35, ice cream
       55,coke

         */
        String order = " ";
        int itemNumber = 55;

        if (itemNumber == 11) {
            System.out.println("you have selected 11");
            order = " Burger";
        } else if (itemNumber == 5) {
            System.out.println("you have selected 5");
            order = " french fries";
        } else if (itemNumber == 8) {
            System.out.println("you have selected 8");
            order = " nuggets";

        } else if (itemNumber == 35) {
            System.out.println("you have selected 35");
            order = " ice cream";
        } else if (itemNumber == 55) {
            System.out.println("you have selected 55");
            order = " coke";
        } else {
            System.out.println(" you have selected Unknow Item Number");

        }
        System.out.println(" enjoy your " + order);

    }
}