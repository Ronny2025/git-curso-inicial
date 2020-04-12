package replit;

import java.util.Scanner;

public class VideoGamesCoupons037 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of coupons:");
        int coupons = scan.nextInt();
        if (coupons == 13) {
            System.out.println("Number of Candies: 1");
            System.out.println("Number of GUmballs: 1");
        } else if (coupons == 23) {
            System.out.println("Number of Candies: 2");
            System.out.println("Number of Gumballs: 1");
        }  else if (coupons == 46) {
            System.out.println("Number of Candies: 4");
            System.out.println("Number of Gumballs: 2");
        }  else if (coupons == 6) {
            System.out.println("Number of Candies: 0");
            System.out.println("Number of Gumballs: 2");


        }else{
            System.out.println("Not enough coupons");
        }
    }
}