package replit.Ochentas;
import java.util.Scanner;
public class Replit084OnlineBookMerchant {
    public static void main(String[] args) {


        int freeBooks = 0;
        Scanner scan = new Scanner(System.in);
        boolean isPremiumCustomer = scan.nextBoolean();
        int nbooksPurchased = scan.nextInt();


        if (isPremiumCustomer == true && nbooksPurchased >= 5 && nbooksPurchased <= 7) {
            System.out.println(freeBooks = 1);
        }
        if (isPremiumCustomer == true && nbooksPurchased >= 8) {
            System.out.println(freeBooks = 2);
        }
        if (isPremiumCustomer != true && nbooksPurchased >= 7 && nbooksPurchased < 12) {
            System.out.println(freeBooks = 1);
        }
        if (isPremiumCustomer != true && nbooksPurchased >= 12) {
            System.out.println(freeBooks = 2);
        }
        if (isPremiumCustomer == true && nbooksPurchased <=5) {
            System.out.println(freeBooks = 0);
        }
        if (isPremiumCustomer != true && nbooksPurchased <= 5) {
            System.out.println(freeBooks = 0);
       }
    }
}