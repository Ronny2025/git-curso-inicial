package day63;
import java.util.*;
public class MapAddingElements2 {

    public static void main(String[] args) {

        //Creating HashMap objects
        Map<String,Integer>nameAgePair = new HashMap<>();

        // adding elements : put
        nameAgePair.put("Ronny",41);
        nameAgePair.put("Norelvy",33);
        nameAgePair.put("Angelo",12);
        nameAgePair.put("Matthew",7);
        nameAgePair.put("Andrew",2);
        nameAgePair.put("Yamileth",1);

        System.out.println("nameAgePair" + "=" + nameAgePair);
        System.out.println("nameAgePair.size" + " = " + nameAgePair.size());
        System.out.println("nameAgePair.get(\"Matthew\") = " + nameAgePair.get("Matthew"));


    }
}
