package replit;
import java.util.Scanner;
public class shoppingList2_30 {
    public static void main(String[] args) {
        /**
         * -Declare double variables price1, price2, price3, totalPrice
         * -Declare int variables count1, count2, count3
         * -Create a Scanner object named scan.
         * Execution flow using with example:
         * Use scanner to read all 3 values.
         * -Display prompt "Enter Item1, count and its price:"
         * Tomatoes
         * 2
         * 5.4
         * Explanation: (Item1 is "Tomatoes", count is 2, price is 5.4)
         * -Display prompt "Enter Item2, count and its price:"
         * Cheese
         * 0
         * 3.5
         * Explanation: (Item2 is "Cheese", count is 0, price is 3.5)
         * -Display prompt "Enter Item3, count and its price:"
         * Apples
         * 5
         * 6.3
         * Explanation: (Item3 is "Apples", count is 5, price is 6.3)
         * -calculate totalPrice for all items only if the item's count is more than 0!
         */
        Scanner Scan= new Scanner(System.in);
        double price1, price2, price3, totalPrice;
        int count1, count2, count3;

        String Item1,Item2,Item3;
        System.out.println("Enter Item1, count and its price:");

        Item1= Scan.next();
        count1=Scan.nextInt();
        price1= Scan.nextDouble();


        System.out.println("Enter Item2, count and its price:");
        Item2= Scan.next();
        count2=  Scan.nextInt();
        price2= Scan.nextDouble();


        System.out.println("Enter Item3, count and its price:");
        Item3= Scan.next();
        count3=Scan.nextInt();
        price3= Scan.nextDouble();



        }


    }

