package replit;

import java.util.Scanner;

public class ShoppingList022 {

    public static void main(String[] args) {

        Scanner ronny= new Scanner(System.in);

       // System.out.println(" Good morning user, please enter 3 items");

        String item1,item2,item3;

       // item1= ronny.nextLine();
      //  item2= ronny.nextLine();
       // item3= ronny.nextLine();

       // System.out.println("Enter price for those 3 Items");

        double price1,price2,price3,totalPrice;

       // price1= ronny.nextDouble();
       // price2= ronny.nextDouble();
       // price3= ronny.nextDouble();


        System.out.println(" Enter Item1 and its price:");
        item1= ronny.next();
        price1= ronny.nextDouble();

        System.out.println(" Enter Item2 and its price:");
        item2= ronny.next();
        price2= ronny.nextDouble();

        System.out.println(" Enter Item3 and its price:");
        item3= ronny.next();
        price3= ronny.nextDouble();

        totalPrice=price1+price2+price3;

        System.out.println("Item1: "+item1+" Price: "+price1+", Item2: "+item2+" Price: " +price2+", Item3: "+item3+" Price: "+price3);
        System.out.println("Total price: " + totalPrice);

    }
}
