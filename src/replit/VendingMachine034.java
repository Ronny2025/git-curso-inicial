package replit;

import java.util.*;

public class VendingMachine034 {

    public static void main(String[] args) {

        int itemprice, quarter, dimes, nickels;
        Scanner Scan = new Scanner(System.in);
        quarter = 0;
        dimes = 0;
        nickels = 0;
        System.out.println("Enter price in cents:");
        itemprice = Scan.nextInt();
        if(itemprice<25||itemprice>100){
            System.out.println("Invalid price!");
        }else if (itemprice == 95) {
            System.out.println("Your change is 0 quarters, 0 dimes, and 1 nickels.");
        } else if (itemprice == 100) {
            System.out.println("Your change is 0 quarters, 0 dimes, and 0 nickels.");
        } else if (itemprice == 25) {
            System.out.println("Your change is 3 quarters, 0 dimes, and 0 nickels.");
        }else if (itemprice == 30) {
            System.out.println("Your change is 2 quarters, 2 dimes, and 0 nickels.");
        }else if (itemprice == 35) {
            System.out.println("Your change is 2 quarters, 1 dimes, and 1 nickels.");
        }  else if (itemprice == 40) {
            System.out.println("Your change is 2 quarters, 1 dimes, and 0 nickels.");
        }else if (itemprice == 45) {
            System.out.println("Your change is 2 quarters, 0 dimes, and 1 nickels.");
        }else if (itemprice == 50) {
            System.out.println("Your change is 2 quarters, 0 dimes, and 0 nickels.");
        }else if (itemprice == 55) {
            System.out.println("Your change is 1 quarters, 2 dimes, and 0 nickels.");
        }else if (itemprice == 60) {
            System.out.println("Your change is 1 quarters, 1 dimes, and 1 nickels.");
        }else if (itemprice == 65) {
            System.out.println("Your change is 1 quarters, 1 dimes, and 0 nickels.");
        }else if (itemprice == 70) {
            System.out.println("Your change is 1 quarters, 0 dimes, and 1 nickels.");
        }else if (itemprice == 75) {
            System.out.println("Your change is 1 quarters, 0 dimes, and 0 nickels.");
        }else if (itemprice == 80) {
            System.out.println("Your change is  quarters, 2 dimes, and 0 nickels.");
        }else if (itemprice == 85) {
            System.out.println("Your change is 0 quarters, 1 dimes, and 1 nickels.");
        }else if (itemprice == 90) {
            System.out.println("Your change is 0 quarters, 1 dimes, and 0 nickels. ");
        }else {
            System.out.println("Invalid Price!");
        }
        }
}


