package replit.Ochentas;

import java.sql.SQLOutput;
import java.util.*;

public class Replit086Party {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String guestList = " ";
        String guest;
        String answer="no";

//       System.out.println("Please enter guest name:");
//       guest = input.nextLine();
//       System.out.println("Do you want to enter new guest name:");
//       // answer=input.nextLine();
//        //System.out.println(answer);
//        while(!guest.equals("no")){
//            answer=input.nextLine();
//            System.out.println("Please enter guest name:");
//            guest = input.nextLine();
//            System.out.println("Do you want to enter new guest name:");
//            answer =input.nextLine();
//            guestList=guest+","+guest;
//        }
//        System.out.println(" Guest's list:" + guestList);

        do {
            System.out.println("Please enter guest name:");
            guest = input.nextLine();
           // guestList=guest;
            System.out.println("Do you want to enter new guest name:");
            answer = input.nextLine();
        } while (! answer.equals("no"));
        System.out.println(guestList);
    }
}