package replit;

import java.util.Scanner;

public class PhoneNumber023 {

    public static void main(String[] args) {

        Scanner ronny = new Scanner(System.in);

        int areaCode, localNumber;

        System.out.println(" Enter are code and local number");

        areaCode=ronny.nextInt();
        localNumber=ronny.nextInt();

        String phoneNumber= "("+areaCode+")"+"-"+localNumber;

        //System.out.println(phoneNumber);          //"("+areaCode+")"+"-"+localNumber);

        System.out.println("Calling number"+ phoneNumber);
    }
}
