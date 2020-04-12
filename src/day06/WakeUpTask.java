package day06;

import java.util.Scanner;

public class WakeUpTask {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double regularPrice, salePrice, discount;

        //regularPrice= 80;
        //salePrice=64;
        //discountPercentage=0.2;

        System.out.println("Enter Regular Price");
        regularPrice= scan.nextDouble();
        System.out.println("Enter Discount Rate");
        discount= scan.nextDouble();

        salePrice= regularPrice-regularPrice * discount;

        System.out.println("Regular Price is " + regularPrice + " Discount Rate is " + discount +
                " you got a deal of "  + salePrice );






    }
}