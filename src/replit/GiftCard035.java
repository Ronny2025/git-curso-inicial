package replit;

import java.util.Scanner;

public class GiftCard035 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String item = scan.nextLine();
        int giftcard=100;
        int chargerprice=15;
        int usbcablePrice=10;
        int  headphonesPrice=30;
        int pantsPrice=50;
        int hatPrice=25;
        int socksPrice=5;
        int blanketPrice=60;
        int pillowPrice=40;
        if (item.equalsIgnoreCase("Smartphone")||item.equalsIgnoreCase("Laptop")){
            System.out.println("Sorry, not enough funds on your gift card!");
        } else if (item.equalsIgnoreCase("Charger")) {
            System.out.println("Thank you for your purchase");
            System.out.println("Your current balance is:" + (giftcard - chargerprice) + "$");
        }else if (item.equalsIgnoreCase("USB cable")) {
            System.out.println("Thank you for your purchase");
            System.out.println("Your current balance is:" + (giftcard - usbcablePrice + "$"));
        }else if (item.equalsIgnoreCase("Headphones")) {
            System.out.println("Thank you for your purchase");
            System.out.println("Your current balance is:" + (giftcard -  headphonesPrice + "$"));
        }else if (item.equalsIgnoreCase("Pants")) {
            System.out.println("Thank you for your purchase");
            System.out.println("Your current balance is:" + (giftcard -  pantsPrice + "$"));
        }else if (item.equalsIgnoreCase("Hat")) {
            System.out.println("Thank you for your purchase");
            System.out.println("Your current balance is:" + (giftcard -  hatPrice + "$"));
        }else if (item.equalsIgnoreCase("Socks")) {
            System.out.println("Thank you for your purchase");
            System.out.println("Your current balance is:" + (giftcard -  socksPrice + "$"));
        }else if (item.equalsIgnoreCase("Blanket")) {
            System.out.println("Thank you for your purchase");
            System.out.println("Your current balance is:" + (giftcard -  blanketPrice + "$"));
        }else if (item.equalsIgnoreCase("Pillow")) {
            System.out.println("Thank you for your purchase");
            System.out.println("Your current balance is:" + (giftcard -  pillowPrice + "$"));

        }else{
            System.out.println("Invalid item!");
        }
    }
}