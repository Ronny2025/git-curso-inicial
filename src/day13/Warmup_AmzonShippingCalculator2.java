package day13;

public class Warmup_AmzonShippingCalculator2 {

    public static void main(String[] args) {

        //create a boolean store the result of youWanToshop
        //if yes, do you want to go to store or do you wanna shop online

        //if user do not wanna shop at all; print good job stay home coding!!!

        boolean youWantToShop = false;
        String preference = "Online";


        if (youWantToShop == true) {

            if (preference.equals("store")) {
                System.out.println("Going to Store for shopping");
            } else {
                System.out.println("Going to online for shopping");
            }


        } else {


            System.out.println("good job stay home coding!!!");
        }
    }
}