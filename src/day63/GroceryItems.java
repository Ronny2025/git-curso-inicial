package day63;

import java.util.HashMap;
import java.util.Map;

public class GroceryItems {

    public static void main(String[] args) {

        Map<String,Double> GroceryItems =  new HashMap<>();

        GroceryItems.put("Manzana",3.6);
        GroceryItems.put("Peras",3.2);
        GroceryItems.put("Queso",5.6);
        GroceryItems.put("Soda",4.0);
        GroceryItems.put("Galletas",5.9);
        GroceryItems.put("Fresas",8.7);
        GroceryItems.put("Tomato",7.5);

        GroceryItems.putIfAbsent("Manzana",3.6);
        System.out.println("Grocery Items = " +  GroceryItems);
        System.out.println("GroceryItems ="  + GroceryItems.size());
        System.out.println(GroceryItems);

    }
}
