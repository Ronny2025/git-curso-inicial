package day64;
import java.util.*;
public class MapKeySetView {

    public static void main(String[] args) {

        Map<String, Double> groceryPriceMap = new HashMap<>();
        groceryPriceMap.put("Tomato", 1.99);
        groceryPriceMap.put("Patato", 1.99);
        groceryPriceMap.put("Tomato", 3.00);
        groceryPriceMap.put("Grape", 3.99);
        groceryPriceMap.put("Banana", 1.99);
        groceryPriceMap.put("Apple", 1.89);
        System.out.println("groceryPriceMap = " + groceryPriceMap);
        // Map view :
        // keySet view , values view , entrySet view
        // How do I store all the keys into a Collection ?
        // what do you think the data type will be to store such collection ?
        // --- Set  because keys are unique

        // we can use keySet() method of Map to get Set of Keys
        // this Set is strictly connected to thr original map
        // if you remove an item , map entry with this key will be also removed
        Set<String> allNames = groceryPriceMap.keySet();
//        System.out.println("allNames = " + allNames);
//        allNames.remove("Tomato");
//        System.out.println("allNames no tomato = " + allNames);
//
//        System.out.println("groceryPriceMap after = " + groceryPriceMap);
        // WHAT IF WE DO NOT WANT SUCH RELATIONSHIP AND WE JUST WANT TO USE THE KEYS SOMEWHERE ELSE ?
        // GET A COPY OF THE SET into different Object
        Set<String> namesCopy = new HashSet<>(allNames);
        namesCopy.remove("Tomato");
        System.out.println("namesCopy = " + namesCopy);
        System.out.println("groceryPriceMap = " + groceryPriceMap);











    }


}