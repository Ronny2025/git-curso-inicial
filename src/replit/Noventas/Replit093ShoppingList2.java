package replit.Noventas;
import java.util.Scanner;
public class Replit093ShoppingList2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String shoppingListReport = "";
        String item = "";
        String answer="";
        double price = 0;
        int count = 1;
        double totalPrice = 0;


        do {
            System.out.println("Enter Item" + count + " and its price:");
            item = scan.nextLine();
            price = scan.nextDouble();

            System.out.println("Add one more item?");

            answer = scan.nextLine();
          count++;

        } while (!answer.equals("no"));

    }
}